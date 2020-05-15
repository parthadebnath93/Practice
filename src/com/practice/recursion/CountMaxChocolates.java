package com.practice.recursion;

public class CountMaxChocolates {
    public static int maxChoc(int chocolates,int wrap){
        if(chocolates<wrap){
            return 0;
        }
        int newChoc=chocolates/wrap;
        return newChoc+maxChoc(newChoc+chocolates%2,wrap);
    }
    public static int maximumCountChoc(int money,int price,int wrap){
      int newChoc=money/price;
      return newChoc+maxChoc(newChoc,wrap);
    }
    public static void main(String[] args) {
        int money = 15 ;
        int price = 1;

        // no of wrappers needs to be
        // exchanged for one chocolate.
        int wrap = 3 ;
        int totalChoc=maximumCountChoc(money,price,wrap);
        System.out.println("Total::::"+totalChoc);
    }
}
