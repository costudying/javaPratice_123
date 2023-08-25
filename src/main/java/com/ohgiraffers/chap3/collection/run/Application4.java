package com.ohgiraffers.chap3.collection.run;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application4 {

    public static void main(String[] args) {

        HashSet<String> hset = new HashSet<>();
        Set<String> set = new HashSet<>();
        Collection<String> cSet= new HashSet<>();

        hset.add(new String("java"));
        hset.add(new String("mysql"));
        hset.add(new String("JDBC"));
        hset.add(new String("MyBatis"));

        System.out.println(hset);

        hset.add(new String("java"));

        System.out.println(hset);

        System.out.println(hset.size());
        System.out.println(hset.contains(new String("MyBatis")));

        Object[] arr = hset.toArray();
        for(Object arrObj : arr){
            System.out.println(arrObj);
        }

        /*많이 씀*/
        Iterator<String> iter = hset.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        hset.clear();
        System.out.println(hset.isEmpty());

    }

}
