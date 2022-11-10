package com.desginpattern.strategy;

public class Bicycle implements Transportation {

    @Override
    public void move(String start, String end){
        System.out.println("출발점 : " + start + "에서 목적지 : " + end + "까지 `자전거`로 이동합니다.");
    }
}