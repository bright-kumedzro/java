package com.company;

public class getEvenDigitSum {

    public static void main(String[] args) {

                System.out.println(getEvenDigitSum(242));

            }

            public static int getEvenDigitSum(int number){
        int[] divisor={2,4,6,8,0};
        int sum = 0, remainder;
        while (number>0) {
            remainder = number % 10;
            for (int i=0; i<5; i++) {
                if (remainder == divisor[i]) {
                    sum = sum + remainder;
                }
            }
            number = number / 10;
        }
        return sum;

            }
}
