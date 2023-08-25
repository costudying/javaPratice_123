package com.ohgiraffers.chap01.polymorphism;

import com.ohgiraffers.model.dto.Animal;
import com.ohgiraffers.model.dto.Cat;
import com.ohgiraffers.model.dto.Dog;

public class Application {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Cat cat1 = new Cat();


        /*인스턴스는 run시점에 생성(new Cat()/ new Dog())
        * 컴파일 시점에는 Animal*/
        Animal cat2 = new Cat();
        Animal dog2 = new Dog();
        Animal animal1 = new Animal();
        cat2.eat();
        dog2.eat();
        animal1.eat();

        /*컴파일 시점 오류*/
        // cat2.grooming();
        // dog2.bite();

        /*형변환을 통해 컴파일 시점 오류 해결*/
        ((Cat) cat2).grooming();
        ((Dog) dog2).bite();

        /*컴파일 시점에 오류는 안나지만 런 시점에 오류가 남.*/
       /* ((Dog) cat2).bite();
        ((Cat) dog2).grooming();
        */

        //instanceof
        System.out.println(cat2 instanceof Animal);
        System.out.println(cat2 instanceof Cat);
        System.out.println(cat2 instanceof Dog);

        if(cat2 instanceof Cat){
            ((Cat) cat2).grooming();
        }

        Animal ani1 = (Animal) new Cat();
        Animal ani2 = new Cat();
        ani1.cry();
        ani2.cry();

        Cat cat11 = (Cat) ani1; // 다운 캐스팅
        cat11.cry();
        // Cat cat12 = ani2; //이미 캣만의 자료형을 설정했기 때문에 Animal로 묵시적 형변환이 안됨.


        // Cat cat3 = new Animal(); -> is a 관계가 아님 고양이는 동물이지만 동물은 고양이가 아님
        // 즉 큰 개념이 작은 개념을 포함할 수 있지만 작은 개념은 큰 개념을 포함할 수 없다.

    }
}
