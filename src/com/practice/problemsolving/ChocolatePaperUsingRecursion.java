package com.practice.problemsolving;

public class ChocolatePaperUsingRecursion {
    public static int maxCount(int choc,int wrap){
        if(choc<wrap){
            return 0;
        }
        int newChoc=choc/wrap;
        return newChoc+maxCount(newChoc+(choc%wrap),wrap);
    }
    public static int countMaxChoco(int money,int price,int wrap){
        int newChoc=money/price;
        return newChoc+maxCount(newChoc,wrap);
    }
    public static void main(String[] args) {
        int money = 15 ; // total money
        int price = 1; // cost of each candy

        // no of wrappers needs to be
        // exchanged for one chocolate.
        int wrap = 3 ;
        System.out.println(countMaxChoco(money,price,wrap));
    }
}
