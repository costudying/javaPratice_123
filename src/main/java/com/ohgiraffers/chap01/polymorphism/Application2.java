package com.ohgiraffers.chap01.polymorphism;

import com.ohgiraffers.model.dto.Animal;
import com.ohgiraffers.model.dto.Cat;
import com.ohgiraffers.model.dto.Dog;

public class Application2 {
    public static void main(String[] args) {

        Animal animal1 = new Cat();
        Animal animal2 = new Dog();


        Application2 app2 = new Application2();
        app2.feed(animal1);
        app2.feed(animal2);

        Cat animal3 = new Cat();
        Dog animal4 = new Dog();
        app2.feed(animal3);
        app2.feed(animal4);

    }

    public void feed(Animal animal){
        animal.eat();
    }

}
