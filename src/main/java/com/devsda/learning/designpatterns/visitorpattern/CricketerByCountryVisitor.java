package com.devsda.learning.designpatterns.visitorpattern;

import com.devsda.learning.designpatterns.constants.Country;
import com.devsda.learning.designpatterns.model.Cricketer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class CricketerByCountryVisitor implements Visitor<Cricketer> {

    private static final Logger log = LoggerFactory.getLogger(CricketerByCountryVisitor.class);

    private List<Cricketer> filteredCricketers = new ArrayList<>();
    private Country country;

    public CricketerByCountryVisitor(Country country) {
        this.country = country;
    }

    @Override
    public void visit(List<Cricketer> items) {

        for(Cricketer cricketer : items) {
            if(country.equals(cricketer.getCountry())) {
                filteredCricketers.add(cricketer);
            }
        }

        log.info(filteredCricketers.toString());

    }

    public List<Cricketer> getFilteredCricketers() {
        return filteredCricketers;
    }

    public void setFilteredCricketers(List<Cricketer> filteredCricketers) {
        this.filteredCricketers = filteredCricketers;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "CricketerByCountryVisitor{" +
                "filteredCricketers=" + filteredCricketers +
                ", country=" + country +
                '}';
    }
}
