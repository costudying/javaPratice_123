package com.ohgiraffers.chap01.interfaceimplements;

/*인터페이스가 인터페이스를 상속할 때는 extends를 써야함.
* 인터페이스 간 다중 상속 가능(extends써도)*/
public interface InterProduct /*extends java.io.Serializable,java.util.Comparator*/ {

    /*인터페이스는 final(상수)필드만 가질 수 있음.*/
    int MAX_NUM = 100;

    /*인터페이스는 추상메소드만 가질 수 있음.*/
    void callMethod();

    public default void defaultMethod(){
        System.out.println("InterProduct 인터페이스의 defaultMethod");
    }

    public static void staticMethod(){
        System.out.println("InterProduct 인터페이스의 staticMethod");
    }


}
