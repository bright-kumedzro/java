package com.sourceCode;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(81,153));

    }

    public static int getGreatestCommonDivisor (int first,int second){
        int greatestCommonDivisor=0;

            if (first<10 || second<10){
                return -1;
            }
            else {
                for (int i=1; i<=first && i<=second; i++) {
                    if (first%i==0 && second%i==0){
                        greatestCommonDivisor=i;
                    }
                }
                return greatestCommonDivisor;
            }
    }

}
