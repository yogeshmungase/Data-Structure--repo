package org.example.arrays;

import java.util.Scanner;

public class PrefixSum {
    static void printArray(int[] array){
        for(int arr : array){
            System.out.print(arr+", ");
        }
        System.out.println();
    }
//methos one

//    static int[] makePrefixSumArray(int[] arr){
//        int n = arr.length;
//        int[] pref = new int[n];
//        pref[0] = arr[0];
//
//        for(int i =1; i< n; i++){
//            pref[i] = pref[i-1]+ arr[i];
//        }
//        return pref;
//    }

    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;
        for(int i =1; i< n; i++){
           // arr[i] = arr[i-1]+ arr[i];
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

        System.out.println("Original Array is : ");
        printArray(arr);
        int[] ans = makePrefixSumArray(arr);
        System.out.println("Prefix sum of array :");
        printArray(ans);
    }
}
