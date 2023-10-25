package com.sourceCode;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int temp;
	    int[] numbers = {9,8,7,6,5,4,3,2,1,0};

            for (int i=0; i<numbers.length;i++){
                for (int j=1; j<numbers.length;j++){
                    if (numbers[j]<numbers[j-1]){
                        temp= numbers[j];
                        numbers[j]= numbers[j-1];
                        numbers[j-1]= temp;
                    }
                }
            }
        System.out.println(Arrays.toString(numbers));

    }
}
