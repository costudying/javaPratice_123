package com.ohgiraffers.chap01.interfaceimplements;

import com.ohgiraffers.chap01.abstractclass.SmartPhone;

/*클래스에서 인터페이스를 상속받을 때는 implements 및 다중 상속 가능*/
/* 상속과 구현할 대는 extends가 우선 작성 후 implements를 작성해야함.*/
public class Product extends SmartPhone implements InterProduct/*, java.io.Serializable*/ {
    @Override
    public void callMethod() {
        System.out.println("InterProduct의 callMethod를 오버라이딩한 method");
    }

    /* default 메소드는 인터페이스에서만 사용할 수 있음.*/
    /*public default void defaultMethod(){}*/

    public void defaultMethod(){
        System.out.println("InterProduct의 defaultMethod를 오버라이딩한 method");
    }

}
