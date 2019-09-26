package com.javatramp.Lesson1.Task1.specification.logicalcompositor;

import com.javatramp.Lesson1.Task1.specification.ISpecification;

public class Not<T> implements ISpecification<T> {
    ISpecification<T> specification;

    public Not(ISpecification<T> specification) {
        this.specification = specification;
    }

    @Override
    public boolean IsSatisfied(T entity) {
        return !this.specification.IsSatisfied(entity);
    }
}
