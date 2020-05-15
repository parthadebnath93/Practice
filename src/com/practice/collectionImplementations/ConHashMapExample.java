package com.practice.collectionImplementations;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class ConHashMapExample {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        Map<String,Integer>map=new HashMap<>();
        map.put("Hello",1);
        map.put("Hi",3);
        map.put("Jey",5);
        map.put("Greetings",2);
        map.put("ABC",4);
        Map<String,Integer>linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put("Hello",1);
        linkedHashMap.put("Hi",3);
        linkedHashMap.put("Hey",5);
        linkedHashMap.put("Greetings",2);
        linkedHashMap.put("ABC",4);
        Map<String,Integer>treeMap=new TreeMap<>();
        treeMap.put("Hello",1);
        treeMap.put("Hi",3);
        treeMap.put("Hey",5);
        treeMap.put("Greetings",2);
        treeMap.put("ABC",4);
        System.out.println(map);
        System.out.println(linkedHashMap);
        System.out.println(treeMap);
    }
}
