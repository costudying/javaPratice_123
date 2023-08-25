package com.ohgiraffers.model.wildcard;

/* 제네릭에서는 인터페이스를 상속받을 때도 extends 씀. (No implements)*/
/* 여러가지 상속받을 때는 Class가 먼저 나와야함. (extends Animal(인터페이스) & Bear(클래스) 안됨.)*/
public class PoohHouse<T extends Bear> {

    private T animal;

    public PoohHouse(){

    }

    public PoohHouse(T animal){
        this.animal = animal;
    }

    public void setAnimal(T animal){
        this.animal = animal;
    }

    public T getAnimal(){
        return animal;
    }

}
