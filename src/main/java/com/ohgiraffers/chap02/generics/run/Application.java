package com.ohgiraffers.chap02.generics.run;

import com.ohgiraffers.chap02.generics.generic.GenericTest;

public class Application {
    public static void main(String[] args) {

        GenericTest<Integer> gt1 = new GenericTest<>();

        gt1.setValue(new Integer(1));
        System.out.println(gt1.getValue());
        System.out.println(gt1.getValue() instanceof Integer);


        /*제너릭 타입을 정했기 때문에 Integer형만 가능*/
        //gt1.setValue("hello");

        /*<>은 꼭 인스턴스 생성 시 표시해줘야함.
        * <>안에 내용은 생략할 수 있음.*/
        GenericTest<String> gt2 = new GenericTest<>();
        gt2.setValue("hello");
        System.out.println(gt2.getValue());
        System.out.println(gt2.getValue() instanceof String);

    }
}
