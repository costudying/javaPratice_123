package com.ohgiraffers.chap3.collection.run;

import java.util.Stack;

public class Application2 {

    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack<>();

        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);

        System.out.println(integerStack);

        System.out.println((integerStack.search(4)));
        System.out.println((integerStack.peek()));
        System.out.println((integerStack.peek()));

        /*Stack 위부터 1*/
        /*search 아래부터 1*/
        /*search 아래부터 1*/

        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
        System.out.println(integerStack.pop());
    }

}
