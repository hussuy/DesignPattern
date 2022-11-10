package com.desginpattern.strategy;


// <snippet_classdef_1>
public class MainEntry {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Bus bus = new Bus();

        PeopleWithMovement whybeFirst = new PeopleWithMovement(bicycle);
        whybeFirst.move("시작점", "끝점");

        PeopleWithMovement whybeSecond = new PeopleWithMovement(bus);
        whybeSecond.move("시작점", "끝점");

        PeopleWithMovement whybeChangeMovement = new PeopleWithMovement(bicycle);
        whybeChangeMovement.move("시작점", "중간지점");
        whybeChangeMovement.changeTransporation(bus);
        whybeChangeMovement.move("중간지점", "끝점");
    }

}