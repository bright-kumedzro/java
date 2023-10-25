package com.sourceCode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage() {
        int i = 0;
        int number;
        int sum = 0;
        long average=0;
        for (; ;i++ ) {
           try {
               System.out.print("Enter number");
               Scanner input = new Scanner(System.in);
               number = input.nextInt();
               sum += number;
           }

            catch (InputMismatchException e) {
               average=sum/i;
                System.out.println( "SUM = " + sum + " AVG = " + average);
            }
        }

    }

}
