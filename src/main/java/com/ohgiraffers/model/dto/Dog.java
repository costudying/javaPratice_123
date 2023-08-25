package com.ohgiraffers.model.dto;

public class Dog extends Animal{

    @Override
    public void eat() {
        System.out.println("챱챱챱챱");
    }

    @Override
    public void run() {
        System.out.println("와다다다닥");
    }

    @Override
    public void cry() {
        System.out.println("멍멍컹컹힝힝");
    }

    public void bite(){
        System.out.println("내꺼....");
    }
}
