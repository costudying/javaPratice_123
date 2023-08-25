package com.ohgiraffers.chap3.collection.run;

import java.util.LinkedList;
import java.util.Queue;

public class Application3 {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("first");
        queue.offer("second");
        queue.offer("third");
        queue.offer("fourth");
        queue.offer("fifth");

        System.out.println(queue);

        System.out.println(queue.peek());
        System.out.println(queue.peek());

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }

}
