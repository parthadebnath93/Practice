package com.practice.oops;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class TestReflection{
    private String str;
    public TestReflection(String s){
        this.str=s;
    }
    public void method1(){
        System.out.println("Value is:::"+this.str);
    }
    public void method2(int n){
        System.out.println("Passed Parameter:::"+n);
    }
    private void method3(){
        System.out.println("This is private method::::");
    }
}
interface test{
    public int sum(int a,int b);
}

public class ReflectionExample {
    public static void getException(Object data)  {
        try{
           data.hashCode();
        }catch (NullPointerException e){
            throw new NullPointerException();
        }
        finally {
            System.out.println("Finally Block executed::::");
        }
    }
    public static void main(String[] args) throws Exception {
        TestReflection test=new TestReflection("ABC");
        Class c=test.getClass();
        System.out.println("Constructor is:::"+c.getConstructors());
        Method[] methods=c.getMethods();
        for (Method m:methods){
            System.out.println(m.getName());
        }
        Method ma=c.getDeclaredMethod("method1");
        ma.invoke(test);
        Method method2=c.getDeclaredMethod("method2",int.class);
        method2.invoke(test,10);
        Method m=c.getDeclaredMethod("method3");
        m.setAccessible(true);
        m.invoke(test);
        Field f=c.getDeclaredField("str");
        f.setAccessible(true);
        f.set(test,"Java");
        Method me=c.getDeclaredMethod("method1");
        me.invoke(test);
        List<Integer>list=Arrays.asList(2,3,4,5);
        List<Integer>square=list.stream().map(E->E*E).collect(Collectors.toList());
        System.out.println(square.parallelStream().findFirst().orElse(null));
        test t=(int a,int b)->{
            return a+b;
        };
        System.out.println(t.sum(10,20));
        //getException(null);
        System.out.println("Lock:::"+Thread.holdsLock(Thread.currentThread()));
    }
    public static void getMissingNumbers(int[] numbers){
    }
}
