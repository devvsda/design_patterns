package com.devsda.learning.designpatterns.visitorpattern;

import com.devsda.learning.designpatterns.constants.Country;
import com.devsda.learning.designpatterns.constants.CricketerType;
import com.devsda.learning.designpatterns.model.Cricketer;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CricketerGroupTest {

    @Test
    public void visitorTest() {

        List<Cricketer> cricketers = Arrays.asList(new Cricketer("Sachin Tendulkar", Country.INDIA, CricketerType.BATSMAN),
                new Cricketer("Dhoni", Country.INDIA, CricketerType.BATSMAN),
                new Cricketer("ABD", Country.SOUTH_AFRICA, CricketerType.BATSMAN),
                new Cricketer("MCGRATH", Country.AUSTRAILIA, CricketerType.BOWLER));


        CricketerGroup cricketerGroup = new CricketerGroup(cricketers);

        cricketerGroup.accept(new CricketerByCountryVisitor(Country.INDIA));
        cricketerGroup.accept(new CricketerByCountryVisitor(Country.AUSTRAILIA));
        cricketerGroup.accept(new CricketerByCountryVisitor(Country.SOUTH_AFRICA));
        cricketerGroup.accept(new CricketerByTypeVisitor(CricketerType.BATSMAN));

    }
}
