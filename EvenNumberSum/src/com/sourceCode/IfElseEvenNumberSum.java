package com.sourceCode;

    public class IfElseEvenNumberSum {

            public static void main(String[] args) {

                EvenNumberSum(204);

            }

            public static int EvenNumberSum(int number) {

                int sum = 0;
                if (number < 0) {
                    return -1;
                } else {
                    while (number > 0) {
                        if (number % 10 == 2) {
                            sum += 2;
                        } else if (number % 10 == 4) {
                            sum += 4;
                        } else if (number % 10 == 6) {
                            sum += 6;
                        } else if (number % 10 == 8) {
                            sum += 8;
                        } else {
                            sum += 0;
                        }

                        number = number / 10;

                    }

                    return sum;
                }
            }


        }

