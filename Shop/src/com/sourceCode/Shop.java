package com.sourceCode;

public class Shop {

    public static void main(String[] args) {
        int highStreetYearlySale=0;
        int mallBranchYearlySale=0;
        int[] highStreetQuarterlySales=new int[4];
        int[] mallBranchQuarterlySales=new int[4];
        int combinedQuarterlySales;
        int sumOfYearlySale;

        int[][] highStreet={{42000,48000,50000},{52000,58000,60000},{48000,49000,58000},{50000,51000,61000}};
        int[][] mallBranch={{57000,63000,60000},{70000,67000,73000},{67000,65000,62000},{72000,69000,75000}};
        for (int i=0; i<highStreet.length; i++){
            for (int j=0; j<highStreet[j].length; j++){
                highStreetYearlySale+=highStreet[i][j];
                mallBranchYearlySale+=mallBranch[i][j];
                highStreetQuarterlySales[i]=highStreet[i][j];
                mallBranchQuarterlySales[i]=mallBranch[i][j];


            }
                combinedQuarterlySales=highStreetQuarterlySales[i] + mallBranchQuarterlySales[i];
            System.out.println("Their combined quarterly sales: " + combinedQuarterlySales);
            if (highStreetQuarterlySales[i]>mallBranchQuarterlySales[i]){
                System.out.println("High Street has a better quarterly sale of " + highStreetQuarterlySales[i] + " in quarter " + ++i);
            }
            else {
                System.out.println("Mall Branch has a better quarterly sale of " + mallBranchQuarterlySales[i] + " in quarter " + ++i);
            }

        }
        System.out.println("High Street's year sale: " + highStreetYearlySale);
        System.out.println("Mall Branch's year sale: " + mallBranchYearlySale);
        sumOfYearlySale=highStreetYearlySale + mallBranchYearlySale;
        System.out.println("Their combined year sale: " + sumOfYearlySale);
        if (highStreetYearlySale>mallBranchYearlySale){
            System.out.println("High Street got more sales compared to Mall Branch");
        }
        else {
            System.out.println("Mall Branch got more sales compared to High Street");
        }

    }
}
