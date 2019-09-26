package com.javatramp.Lesson1.Task1.specification;

public interface ISpecification<T> {

    boolean IsSatisfied(T entity);

}
