package com.sourceCode;

public class FlourPack {

    public static void main(String[] args) {

        System.out.println(canPack(1,7,10));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
            bigCount=bigCount*5;
            int sum;
            sum=bigCount+smallCount;

            while (smallCount<0 || bigCount<0 || goal<0){
                return false;
            }

            if (sum==goal){
                return true;
            }
            else if (sum>goal){
                if (bigCount<smallCount){
                    return true;
                }
                else {
                    return false;
                }

            }
            else {
                return false;
            }
    }
}
