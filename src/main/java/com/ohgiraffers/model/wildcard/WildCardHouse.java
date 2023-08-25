package com.ohgiraffers.model.wildcard;

public class WildCardHouse {

    public void anyType(PoohHouse<?> house){
        house.getAnimal().cry();
    }

    /*매개변수*/
    public void extendsType(PoohHouse<? extends Pooh > house){
        house.getAnimal().cry();
    }

    /*Pooh거나 Pooh의 부모여야함.*/
    public void superType(PoohHouse<? super Pooh> house){
        house.getAnimal().cry();
    }


}
