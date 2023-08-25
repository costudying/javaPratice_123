package com.ohgiraffers.model.dto;

public class Cat extends Animal{

    @Override
    public void eat() {
        System.out.println("츄르는 맛있어");
    }

    @Override
    public void run() {
        System.out.println("ㅋㅋㅋㅋㅋㅋㅋㅋㅋ");
    }

    @Override
    public void cry() {
        System.out.println("야~옹~ 야~옹~");
    }

    public void grooming(){
        System.out.println("뽀득 뽀득");
    }

}
