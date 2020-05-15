package com.practice.problemsolvinginterview;

class A{
    public void run(){
        System.out.println("Run Method in Superclass");
    }
    public void go(){
        run();
        System.out.println("go method in superclass");
    }
}
class B extends A{
    @Override
    public void run(){
        System.out.println("Run Method in Subclass");
    }
    @Override
    public void go(){
        super.go();
        System.out.println("go method in subclass");
    }
}
public class OverriddenTest {
    public static void main(String[] args) {
        B b=new B();
        b.go();
    }
}
