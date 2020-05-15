package com.practice.oops;

public class ClonableTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        ClonableExam exam=new ClonableExam(10,"Partha");
        System.out.println(exam);
        ClonableExam ex= (ClonableExam) exam.clone();
        exam.setId(20);
        System.out.println(exam);
        System.out.println(ex);
    }
}
