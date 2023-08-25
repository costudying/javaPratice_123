package com.ohgiraffers.chap02.generics.generic;

import com.ohgiraffers.model.wildcard.AngryPooh;
import com.ohgiraffers.model.wildcard.Bear;
import com.ohgiraffers.model.wildcard.Pooh;
import com.ohgiraffers.model.wildcard.PoohHouse;

public class Application2 {

    public static void main(String[] args) {

        PoohHouse<Bear> house1 = new PoohHouse<>();
        PoohHouse<Pooh> house2 = new PoohHouse<>();
        PoohHouse<AngryPooh> house3 = new PoohHouse<>();
        /* PoohHouse -> Bear이거나 Bear의 자손*/

        house1.setAnimal(new Bear());
        house1.getAnimal().cry();

        house2.setAnimal(new Pooh());
        house2.getAnimal().cry();

        house3.setAnimal(new AngryPooh());
        house3.getAnimal().cry();

    }
}
