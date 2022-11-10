package com.desginpattern.strategy;

public class Bus implements Transportation {

    @Override
    public void move(String start, String end){
        System.out.println("출발점 : " + start + "에서 목적지 : " + end + "까지 `버스`로 이동합니다.");
    }
}