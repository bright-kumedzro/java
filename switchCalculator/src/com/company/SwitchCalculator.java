package com.company;

import java.util.Scanner;

public class SwitchCalculator {

    public static void main(String[] args) {

        double num1,num2,sum=0;
        char operator;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter your first number");
        num1=input.nextDouble();

        System.out.print("Enter operator");
        operator=input.next().charAt(0);

        System.out.print("Enter your second number");
        num2=input.nextDouble();

        switch (operator){
            case '+': sum=num1+num2;
            break;
            case '-': sum=num1-num2;
            break;
            case '*': sum=num1*num2;
            break;
            case '/': sum=num1/num2;
            break;
        }

        System.out.println("Your answer is: " + sum);
    }
}
