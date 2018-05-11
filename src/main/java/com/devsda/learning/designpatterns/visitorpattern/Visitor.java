package com.devsda.learning.designpatterns.visitorpattern;

import java.util.List;

public interface Visitor<T> {

    void visit(List<T> items);

}
