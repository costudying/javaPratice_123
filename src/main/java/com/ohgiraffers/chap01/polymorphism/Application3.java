package com.ohgiraffers.chap01.polymorphism;

//import com.ohgiraffers.chap01.abstractclass.Product;
import com.ohgiraffers.chap01.interfaceimplements.Product;
import com.ohgiraffers.chap01.abstractclass.SmartPhone;
import com.ohgiraffers.chap01.interfaceimplements.InterProduct;

public class Application3 {

    public static void main(String[] args) {


        /*추상클래스는 인스턴스 생성이 안됨.*/
        // Product product = new Product();

        /*SmartPhone smartPhone = new SmartPhone();
        System.out.println(smartPhone instanceof SmartPhone);
        System.out.println(smartPhone instanceof Product);

        Product product = new SmartPhone();
        product.absMethod();
        product.callmethod();
        ((SmartPhone) product).printSmartPhone();

        *//*인스턴스를 따로 생성하지 않아도 쓸 수 있음.
        * 프로그램 실행 동시에 static 영역에 할당*//*
        Product.callStaticMethod();*/

        System.out.println("==============================================================================");

        /*InterProduct interProduct = new InterProduct();*/

        InterProduct interProduct = new Product();

        interProduct.callMethod();
        interProduct.defaultMethod();
        //interProduct.staticMethod();
        /*static이 붙어있는 인터페이스는 인터페이스명에 붙여서 사용해야함.*/
        InterProduct.staticMethod();
        /*final(상수)가 붙어있는 인터페이스는 인터페이스명에 붙여서 사용해야함.*/
        System.out.println(InterProduct.MAX_NUM);
    }
}
