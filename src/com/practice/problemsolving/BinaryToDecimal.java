package com.practice.problemsolving;

public class BinaryToDecimal {
    public static void main(String[] args) {
        String str="1010";
        System.out.println("Output is::::"+Integer.parseInt(str,2));
        convertToDecimal(str);
    }
    public static void convertToDecimal(String str){
        int power=0;
        int decimal=0;
        int number=Integer.parseInt(str);
        while (true){
            if(number==0){
                break;
            }
            else {
                int temp = number % 10;
                decimal += temp * Math.pow(2, power);
                number = number / 10;
                power++;
            }
        }
        System.out.println("Decimal Number is::::"+decimal);
    }
}
