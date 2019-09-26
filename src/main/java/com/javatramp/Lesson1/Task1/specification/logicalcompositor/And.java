package com.javatramp.Lesson1.Task1.specification.logicalcompositor;

import com.javatramp.Lesson1.Task1.specification.ISpecification;

public class And<T> implements ISpecification<T> {
    ISpecification<T> left;
    ISpecification<T> right;

    public And(ISpecification<T> left, ISpecification<T> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean IsSatisfied(T entity) {
        return left.IsSatisfied(entity) && right.IsSatisfied(entity);
    }
}
