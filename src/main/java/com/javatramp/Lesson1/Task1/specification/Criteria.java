package com.javatramp.Lesson1.Task1.specification;

import java.beans.Expression;
import java.util.List;

public abstract class Criteria<T> implements ISpecification<T> {

    private List<ISpecification> criteria;

    public Criteria(List<ISpecification> criteria) {
        this.criteria = criteria;
    }
}
