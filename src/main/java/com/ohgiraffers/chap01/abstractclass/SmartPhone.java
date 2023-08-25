package com.ohgiraffers.chap01.abstractclass;

public class SmartPhone extends Product{

    public SmartPhone(){

    }

    @Override
    public void absMethod() {
        System.out.println("Product 추상 클래스의 absMethod를 오버라이딩한 메소드");
    }

    public void printSmartPhone(){
        System.out.println("나는야 스~마트~폰");
    }
}
