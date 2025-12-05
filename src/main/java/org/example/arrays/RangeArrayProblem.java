package org.example.arrays;

import java.util.Scanner;

public class RangeArrayProblem {



    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;
        for(int i =1; i< n; i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the " + n + " Elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int [] prefSum = makePrefixSumArray(arr);

        System.out.println("Enter number of queries ");
        int q = sc.nextInt();

        while (q-- > 0){
            System.out.println("Enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = prefSum[r] - prefSum[l];
            System.out.println("sum" + ans);
        }
    }
}
