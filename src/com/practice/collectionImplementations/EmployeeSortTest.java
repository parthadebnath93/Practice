package com.practice.collectionImplementations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSortTest {
    public static void main(String[] args) {
        List<Employee>list=new ArrayList<>();
        list.add(new Employee(1,"Partha Debnath",25000.0));
        list.add(new Employee(2,"Jkl Debnath",65000.0));
        list.add(new Employee(3,"ABC Debnath",30000.0));
        list.add(new Employee(4,"Test Debnath",55000.0));
        Collections.sort(list,new EmployeeSort());
        System.out.println(list);


    }
}
