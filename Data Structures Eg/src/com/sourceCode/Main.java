package com.sourceCode;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int temp;
        int[] numbers={20,-15,7,35,1,-22,55};
                for(int i=0; i<numbers.length; i++){
                    for(int j=1; j<numbers.length; j++){
                        if (numbers[j-1]>numbers[j]){
                            temp=numbers[j];
                            numbers[j]=numbers[j-1];
                            numbers[j-1]=temp;
                        }
                    }
                }

        System.out.println(Arrays.toString(numbers));

    }
}
