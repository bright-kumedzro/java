/*Develop a JAVA program for a grading system that satisfies the following requirements:
        1. Requirement for passing an exam is that, student must pass the exam by a score of 25 or more
        and must also pass the assessment by 15 or more to get a certificate.
        2. If a student score a total grade of 39 for both grading component(i.e if only a student score
        exam 25 and assessment 14 totalling 39, or exam 24 and assessment 15 totalling 39), the student is condoned.
        3. If a student satisfy either Req. 1 and Req. 2 and have paid their fees in full(where fee is 100), they are
        issued with a certificate.
        4. A student is deemed to have failed if he/she does not meet Req. 1 or Req. 2
        5. However, your program must inform the student the component he/she passed/failed.
        6. Where a student failed both components he/she is repeated.*/


package com.company;

import java.util.Scanner;

public class switchGradingSystem {
    public static void main(String[] args) {
        double examScore, assessScore, fees;

        System.out.println("Enter your exam score");
        Scanner input = new Scanner(System.in);
        examScore = input.nextDouble();
        System.out.println("Enter your assessment score");
        Scanner input1 = new Scanner(System.in);
        assessScore = input1.nextDouble();
        System.out.println("How much of your fees have you paid?");
        Scanner input2 = new Scanner(System.in);
        fees = input2.nextDouble();

        switch (examScore >= 25 & assessScore >= 15) {
            switch (fees) {
                case 100:
                    System.out.println("You have passed both your exams and assessment and will get a certificate");
                    break;
                case :
                    System.out.println("You have passed both your exams and assessment. Pay your fees in full for your certificate");
                    break;
            }
        }
        switch (examScore + assessScore == 39 & ((examScore == 24 & assessScore == 15) || (examScore == 25 & assessScore == 14))) {
            switch (fees) {
                case 100:
                    System.out.println("You are pardoned and will get a certificate");
                    break;
                case :
                    System.out.println("You are pardoned. Pay your fees in full for your certificate");
                    break;
            }
            case 3:
                switch (examScore >= 25 & assessScore < 14) {
                    case 1:
                        System.out.println("You have failed your assessment and passed your exams");
                        break;
                }
                switch (examScore < 24 & assessScore >= 15) {
                    case 1:
                        System.out.println("You have failed your exams and passed your assessment");
                        break;
                    case 2:
                        System.out.println("You have failed both exams and assessment and are repeated");
                        break;
                }
        }
    }
    }
}