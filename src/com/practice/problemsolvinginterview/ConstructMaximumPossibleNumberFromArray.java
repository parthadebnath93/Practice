package com.practice.problemsolvinginterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ConstructMaximumPossibleNumberFromArray {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("10", "68", "97", "9", "21", "12");
        Collections.sort(numbers, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return (Integer) (t1+s).compareTo(s+t1);
            }
        });
        numbers.stream().forEach(System.out::print);
    }
}
