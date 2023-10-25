package com.company;

public class Frequency {
    public static void main (String[] args) {
        int[] ratings = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 2, 5, 3,6};
        int rate1 = 0;
        int rate2 = 0;
        int rate3 = 0;
        int rate4 = 0;
        int rate5 = 0;
        int rate6= 0;

        for (int i = 0; i < ratings.length; i++)
            switch (ratings[i]) {
                case 1: rate1++;
                break;
                case 2: rate2++;
                break;
                case 3: rate3++;
                break;
                case 4: rate4++;
                break;
                case 5: rate5++;
                break;
            }
        System.out.println(" 1 had " + rate1 + " ratings");
        System.out.println(" 2 had " + rate2 + " ratings");
        System.out.println(" 3 had " + rate3 + " ratings");
        System.out.println(" 4 had " + rate4 + " ratings");
        System.out.println(" 5 had " + rate5 + " ratings");
        System.out.println(" 6 had " + rate6 + " ratings");
    }
}