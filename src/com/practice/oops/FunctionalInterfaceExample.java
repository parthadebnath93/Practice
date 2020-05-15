package com.practice.oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

interface Test{
    public int add(int a,int b);
}
public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Test t=(a,b)->{
            return a+b;
        };
        System.out.println(t.add(10,20));

        List<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(10);
        list.stream().forEach(E->{
            System.out.print(E+" ");
        });
        System.out.println();
        Optional<Integer> n=list.parallelStream().findFirst();
        System.out.println(n);
    }
}
