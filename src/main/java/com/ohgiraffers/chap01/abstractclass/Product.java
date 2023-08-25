package com.ohgiraffers.chap01.abstractclass;

/*추상 클래스*/
public abstract class Product {

    private int nonStaticField;
    private static int staticField;

    public Product(){}

    public void callmethod(){
        System.out.println("Product 추상클래스의 method 호출");
    }

    public static void callStaticMethod(){
        System.out.println("Product 추상클래스의 static method 호출");
    }

    /*추상 메소드는 {}을 가질 수 없음.*/
    public abstract void absMethod();
}
