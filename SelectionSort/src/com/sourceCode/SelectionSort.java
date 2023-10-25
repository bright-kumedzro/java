package com.sourceCode;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int temp;
        int smallestNum;
	    int[] numbers={9,8,7,6,5,4,3,2,1,0};
        for (int i=0; i<numbers.length; i++){
            smallestNum=numbers[i];
            for (int j=1; j<numbers.length; j++){
                if (smallestNum>numbers[j]){
                    smallestNum=numbers[j];
                }
            }
            temp=numbers[i];
            numbers[i]=smallestNum;
            smallestNum=temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
