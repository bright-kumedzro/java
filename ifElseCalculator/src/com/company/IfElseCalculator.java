package com.company;

import java.util.Scanner;

        public class IfElseCalculator {

            public static void main(String[] args){
                double num1, num2;
                char operator;
                double sum;
                Scanner input=new Scanner(System.in);

                System.out.print("Enter your first number: ");
                num1=input.nextDouble();

                System.out.print("Enter operator: ");
                operator=input.next().charAt(0);

                System.out.print("Enter your second number: ");
                num2=input.nextDouble();

                if (operator=='+'){
                    sum=num1+num2;
                }
                else if (operator=='-') {
                    sum=num1-num2;
                }
                else if (operator=='*'){
                    sum=num1*num2;
                }
                else {
                    sum=num1/num2;
                }

                System.out.println("Your answer is: " + sum);

    }
}
