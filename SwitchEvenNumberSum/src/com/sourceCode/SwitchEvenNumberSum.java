package com.sourceCode;

public class SwitchEvenNumberSum {

    public static void main(String[] args) {

        EvenNumberSum(2048468);

    }

    public static void EvenNumberSum(int number) {

        int sum = 0;

        if (number<0){
            System.out.println("Invalid number");
        }
        else {
            while (number > 0) {
                switch (number % 10) {
                    case 2:
                        sum += 2;
                        break;
                    case 4:
                        sum += 4;
                        break;
                    case 6:
                        sum += 6;
                        break;
                    case 8:
                        sum += 8;
                        break;
                    case 0:
                        sum += 0;
                        break;
                }
                number = number / 10;
            }
            System.out.println(sum);
        }
    }


}

