package com.practice.patterns;

import org.w3c.dom.ls.LSOutput;

class TestSingleTone{
    private static TestSingleTone object=null;
    private TestSingleTone(){

    }
    public static TestSingleTone getInstance(){
        if(object==null){
            object=new TestSingleTone();
            return object;
        }
        else
            return object;
    }
}
public class SingleTonTest {

    public static void main(String[] args) {
        TestSingleTone ob1=TestSingleTone.getInstance();
        TestSingleTone ob2=TestSingleTone.getInstance();
        System.out.println(ob1.equals(ob2));
        System.out.println("HashCodes are:::::"+ob1.hashCode()+" "+ob2.hashCode());
    }

}
