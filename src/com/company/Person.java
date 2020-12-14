package com.company;

public class Person implements Cloneable {
    public int id;

    public Person(){

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
