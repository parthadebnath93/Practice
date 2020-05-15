package com.practice.problemsolving;
class TestBase {
    public void test(){
        System.out.println("Hello");
    }
}
public class Test extends TestBase{
    public void newTest(){
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        TestBase ts=new Test();
    }
}
