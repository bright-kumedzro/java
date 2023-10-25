package com.sourceCode;

public class FirstAndLastDigitSum {

    public static void main(String[] args) {

        sumFirstAndLastDigit(47);

    }

   /* public static void sumFirstAndLastDigit(int number) {

        int sum=0,lastDigit;

        if (number < 0) {
            System.out.println("Invalid Number");
        } else {
            lastDigit=number % 10;
            while (number>0) {

                if (number <10) {
                    sum =lastDigit + (number % 10);

                }
                number = number / 10;
            }
            System.out.println(sum);
        }
    }*/

    /*public static int numOfDigit(int number){
        int count = 0;
        while (number>0){
            count++;
            number=number/10;
        }
        return count;
    }

    public static void sumFirstAndLastDigit(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int totalNumOfDigit=numOfDigit(2068);
            int lastDigit,firstDigit,divisor;
            int sum;

            lastDigit=number%10;

            divisor=(int)Math.pow(10,totalNumOfDigit-1);
            firstDigit=number/divisor;
            sum=firstDigit+lastDigit;
            System.out.println(sum);
        }

    }
*/

    public static void sumFirstAndLastDigit(int number){
        int firstDigit,lastDigit;
        int sum,divisor;
        int numberLength;
        if (number<0){
            System.out.println("Invalid Number");
        }
        else if (number<10) {
            System.out.println(number%10);
        }
         else {
            lastDigit=number%10;
            numberLength=String.valueOf(number).length();
            divisor=(int)Math.pow(10,numberLength-1);
            firstDigit=number/divisor;
            sum=firstDigit+lastDigit;
            System.out.println(sum);

        }
    }

}