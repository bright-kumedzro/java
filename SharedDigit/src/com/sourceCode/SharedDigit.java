package com.sourceCode;

public class SharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(91,99));

    }

    public static boolean hasSharedDigit(int num1, int num2){
        int digitOfNum1=0,nextDigitOfNum2=0,lastDigitOfNum2=0;

        if ((num1>9 && num1<100) && (num2>9 && num2<100)){
            for (int i=1;1<= num1 || i<=num2;i++) {
                digitOfNum1 = num1 % 10;
                lastDigitOfNum2 = num2 % 10;
                if (digitOfNum1 == lastDigitOfNum2) {
                    return true;
                } else {
                    num2 = num2 / 10;
                    nextDigitOfNum2 = num2 % 10;
                    if (digitOfNum1 == nextDigitOfNum2) {
                        return true;
                    }
                    num1 = num1 / 10;
                    num2 = (num2 * 10) + lastDigitOfNum2;
                }
            }
                if ((digitOfNum1!=lastDigitOfNum2) && (digitOfNum1!=nextDigitOfNum2)){
                    return false;
                }
            }
            return false;
        }

}
