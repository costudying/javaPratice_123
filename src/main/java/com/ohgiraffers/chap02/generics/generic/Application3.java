package com.ohgiraffers.chap02.generics.generic;

import com.ohgiraffers.model.wildcard.*;

public class Application3 {

    public static void main(String[] args) {

        WildCardHouse wildCardHouse = new WildCardHouse();

        wildCardHouse.anyType(new PoohHouse<Bear>(new Bear()));
        wildCardHouse.anyType(new PoohHouse<Pooh>(new Pooh()));
        wildCardHouse.anyType(new PoohHouse<AngryPooh>(new AngryPooh()));

        /*인자*/
        /*wildCardHouse.extendsType(new PoohHouse<Bear>(new Bear()));*/
        wildCardHouse.extendsType(new PoohHouse<Pooh>(new Pooh()));
        wildCardHouse.extendsType(new PoohHouse<AngryPooh>(new AngryPooh()));

        /*상,하위 클래스 지정해줌.
        * 즉, Pooh 포함 Pooh 1단계 위까지*/
        //wildCardHouse.superType(new PoohHouse<Mammal>(new Mammal()));
        wildCardHouse.superType(new PoohHouse<Bear>(new Bear()));
        wildCardHouse.superType(new PoohHouse<Pooh>(new Pooh()));
        /*wildCardHouse.superType(new PoohHouse<AngryPooh>(new AngryPooh()));*/

    }

}
