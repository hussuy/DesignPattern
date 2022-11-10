package com.desginpattern.iterator;
import java.util.Iterator;

public interface Aggregate {

    public abstract Iterator createIterator();
}