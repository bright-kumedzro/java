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


package com.sourceCode;

import java.util.Scanner;

public class IfElseGradingSystem {

    public static void main(String[] args) {
        double examScore;
        double assessScore;
        double fees;
        Scanner scanner = new Scanner(System.in);

        System.out.print("What grade did you get for the exam: ");
        examScore = scanner.nextDouble();

        System.out.print("What grade did you get for the assessment?: ");
        assessScore =scanner.nextDouble();

        System.out.print("How much of your fees have you paid: ");
        fees= scanner.nextDouble();


        if (examScore>=25 && assessScore>=15){
            if (fees>=100){
                System.out.println("You got "+examScore+" on your exam and " + assessScore + " on your assessment");
                System.out.println("Your fees are paid in full");
                System.out.println("Congratulations, you will receive a certificate");
            }
            else {
                System.out.println("You got "+examScore+" on your exam and " + assessScore + " on your assessment");
                System.out.println("You have not paid your fees in full");
                System.out.println("Pay your fees and you will get your certificate");
            }
        }

        else if(examScore<=25 || assessScore<=15){
            if (examScore+assessScore==39 && fees>=100){
                System.out.println("You got "+examScore+" on your exam and " + assessScore + " on your assessment");
                System.out.println("Your grades are condoned, and you will get a certificate");
            }
            else if(examScore+assessScore==39 && fees<100){
                System.out.println("You got "+examScore+" on your exam and " + assessScore + " on your assessment");
                System.out.println("Your grades are condoned, but you have not paid your fees in full for your certificate");
            }
            else if (examScore+assessScore>39 && assessScore>15){
                System.out.println("You passed your assessment but did not meet the minimum requirement for passing your exam, hence you failed");
            }
            else if (examScore+assessScore>39 && examScore>25){
                System.out.println("You passed your exam but did not meet the minimum requirement for passing your assessment, hence you failed");
            }
            else {
                if (examScore>=25){
                    System.out.println("You passed your exam with a grade of "+examScore);
                }
                else{
                    System.out.println("You failed your exam with a score of "+examScore);
                }
                if (assessScore>=15){
                    System.out.println("You passed your assessment with a grade of "+assessScore);
                }
                else{
                    System.out.println("You failed your assessment with a grade of "+assessScore);
                }
                System.out.println("Your grades are not good enough and you have failed");
            }

        }


    }
}
