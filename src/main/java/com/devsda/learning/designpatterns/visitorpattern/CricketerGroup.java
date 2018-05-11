package com.devsda.learning.designpatterns.visitorpattern;

import com.devsda.learning.designpatterns.model.Cricketer;

import java.util.ArrayList;
import java.util.List;

public class CricketerGroup implements Visitable {

    private List<Cricketer> cricketers = new ArrayList<>();

    public CricketerGroup(List<Cricketer> cricketers) {
        this.cricketers = cricketers;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(cricketers);
    }

    public List<Cricketer> getCricketers() {
        return cricketers;
    }

    public void setCricketers(List<Cricketer> cricketers) {
        this.cricketers = cricketers;
    }

    @Override
    public String toString() {
        return "CricketerGroup{" +
                "cricketers=" + cricketers +
                '}';
    }
}
