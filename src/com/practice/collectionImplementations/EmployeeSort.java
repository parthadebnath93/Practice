package com.practice.collectionImplementations;

import java.util.Comparator;

public class EmployeeSort implements Comparator<Employee> {
    @Override
    public int compare(Employee employee, Employee t1) {
        return employee.getName().compareTo(t1.getName());
    }
}
