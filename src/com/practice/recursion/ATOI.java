package com.practice.recursion;

public class ATOI {
    public static int atoi(String str,int count){
        System.out.println(count++);
        if(str==""){
            return 0;
        }
        int ascii=str.charAt(0);
        int zero='0';
        if(ascii-zero==ascii){
            return (Character.getNumericValue(ascii)*10)+atoi(str.substring(1,str.length()-1),count);
        }
        else{
            return atoi(str.substring(1,str.length()-1),count);
        }
    }
    public static void main(String[] args) {
        String str="123";
        System.out.println(atoi(str,0));
    }
}
