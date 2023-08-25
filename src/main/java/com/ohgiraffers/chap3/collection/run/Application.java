package com.ohgiraffers.chap3.collection.run;

import java.util.*;

public class Application {

    public static void main(String[] args) {

        ArrayList alist = new ArrayList();
        List list = new ArrayList();
        Collection clist = new ArrayList();

        alist.add("hello");
        /*오토 박싱 처리해줌.*/
        /*alist.add(new Integer(123));*/
        alist.add(123);
        /*alist.add(new Double(97.7));*/
        alist.add(97.7);
        alist.add(new Date());

        System.out.println(alist);

        System.out.println(alist.size()); // array -> length

        System.out.println(alist.get(0));

        alist.remove(2);
        System.out.println(alist);
        System.out.println(alist.get(2));

        List<String> stringList = new ArrayList<>();
        stringList.add("hi");
        stringList.add("hello");
        /*stringList.add(123);
        stringList.add(new Integer(123));*/
        stringList.add("bye");

        System.out.println(stringList);
        System.out.println(stringList.get(0).equals(stringList.get(1)));

        stringList.set(0,"hiroo");

        System.out.println(stringList);

        Collections.sort(stringList); // 오름차순 정렬
        System.out.println(stringList);
        stringList.sort(Comparator.reverseOrder());//내림차순 정렬
        System.out.println(stringList);

        stringList = new LinkedList<>();


        Iterator<String> iter = ((LinkedList<String>)stringList).descendingIterator();

        List<String> descList = new ArrayList<>();
        while (iter.hasNext()){
            descList.add(iter.next());
        }

        System.out.println(descList);

        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        while (iter.hasNext()){
            System.out.println(iter.next());
        }



    }

}
