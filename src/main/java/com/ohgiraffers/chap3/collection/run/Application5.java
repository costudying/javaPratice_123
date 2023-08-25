package com.ohgiraffers.chap3.collection.run;

import java.util.*;

public class Application5 {

    public static void main(String[] args) {

        HashMap hmap = new HashMap();
        //Map map = new HashMap();

        /*오토~ 박싱~ 처리~*/
        hmap.put("one",new Date());
        hmap.put(12,"pineapple");
        hmap.put(33,37.3);

        System.out.println(hmap);

        System.out.println(hmap.get(12));

        hmap.put(12,"aaaapple");
        System.out.println(hmap.get(12));

        hmap.remove(12);
        System.out.println(hmap.get(12));

        System.out.println(hmap.size());

        System.out.println(hmap.get(33));

        System.out.println(hmap.keySet());

        System.out.println("====================================================================================");

        Map<String, String> hMap = new HashMap<>();
        hMap.put("one","hellokitty");
        hMap.put("two","kuromi");
        hMap.put("three","mymelody");
        hMap.put("four","anpanman");

        Iterator<String> keyIter = hMap.keySet().iterator();
        /* 담고 있는 의미
        Set<String> keys = hMap.keySet();
        Iterator<String> keyIter = keys.iterator();*/
        while (keyIter.hasNext()){
            String key = keyIter.next();
            String value = hMap.get(key);
            System.out.println(key + "=" + value);
        }

        System.out.println("----------------------------------------------------");
        Collection<String> values = hMap.values();
        System.out.println(values);

    }

}
