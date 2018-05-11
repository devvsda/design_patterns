package com.devsda.learning.designpatterns.visitorpattern;

import com.devsda.learning.designpatterns.constants.CricketerType;
import com.devsda.learning.designpatterns.model.Cricketer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class CricketerByTypeVisitor implements Visitor<Cricketer>{

    private static final Logger log = LoggerFactory.getLogger(CricketerByTypeVisitor.class);

    private List<Cricketer> filteredCricketers = new ArrayList<>();
    private CricketerType cricketerType;

    public CricketerByTypeVisitor(CricketerType cricketerType) {
        this.cricketerType = cricketerType;
    }

    @Override
    public void visit(List<Cricketer> items) {

        for(Cricketer cricketer : items) {
            if(cricketerType.equals(cricketer.getCricketerType())) {
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

    public CricketerType getCricketerType() {
        return cricketerType;
    }

    public void setCricketerType(CricketerType cricketerType) {
        this.cricketerType = cricketerType;
    }

    @Override
    public String toString() {
        return "CricketerByTypeVisitor{" +
                "filteredCricketers=" + filteredCricketers +
                ", cricketerType=" + cricketerType +
                '}';
    }
}
