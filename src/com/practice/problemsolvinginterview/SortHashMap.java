package com.practice.problemsolvinginterview;

import java.util.*;

public class SortHashMap {
    public static Map<String,Integer> sortHashMap(Map<String,Integer>map){
        List<Map.Entry<String,Integer>>list=new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> stringIntegerEntry, Map.Entry<String, Integer> t1) {
                return stringIntegerEntry.getValue().compareTo(t1.getValue());
            }
        });
        Map<String,Integer>neMap=new LinkedHashMap<>();
        for (Map.Entry<String,Integer> m:list){
            neMap.put(m.getKey(),m.getValue());
        }
        //System.out.println(neMap);
        return neMap;
    }
    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<>();
        map.put("A",100);
        map.put("B",40);
        map.put("C",20);
        map.put("D",10);
        map.put("E",30);
        map=sortHashMap(map);
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
