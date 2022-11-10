package com.desginpattern.strategy;

public class PeopleWithMovement {

    private Transportation transportation;

    public PeopleWithMovement(Transportation transportation) {
        this.transportation = transportation;
    }

    public void move(String start, String end) {
        transportation.move(start, end);
    }

    public void changeTransporation(Transportation transportation) {
        this.transportation = transportation;
    }
}