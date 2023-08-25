package com.ohgiraffers.chap02.generics.generic;

public class GenericTest<T> {

    /*일반 필드 생성*/
   /*
    private int age;
    private String name;
    */

    /*어떤 타입이든 내가 넣은 걸로 지정할 수 있도록 함.*/
    private T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return this.value;
    }

}
