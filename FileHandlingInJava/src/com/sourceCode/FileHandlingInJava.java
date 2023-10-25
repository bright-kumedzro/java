package com.sourceCode;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

        public class FileHandlingInJava {

            public static void main(String[] args) {

                try {

                    File f = new File("C:/users/hp/Desktop/output.txt");
                    f.createNewFile();
                    Scanner scanner = new Scanner(System.in);
                    int[][] num=new int[3][3];
                    System.out.println("Enter first nine odd numbers");
                    for (int i=0; i<num.length; i++) {
                        for (int j = 0; j < num.length; j++) {
                            while (num[i][j] > 0 && num[i][j] < 18) {
                                System.out.print("Number: ");
                                num[i][j] = scanner.nextInt();
                            }
                        }
                    }
                    FileWriter fw= new FileWriter(f);
                    fw.write(Arrays.deepToString(num));
                    fw.close();

                    FileReader fr=new FileReader(f);
                    Scanner reader=new Scanner(fr);
                    while (reader.hasNextLine()){
                        String data=reader.nextLine();
                        System.out.println(data);
                    }
                    reader.close();


                }
                catch (IOException e){
                    System.out.println("There was an error");
                }

        }

    }
