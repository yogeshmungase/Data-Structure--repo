package org.example.arrays;

import java.util.Scanner;

public class SortingArray {

    static void printArray(int[] array){
        for(int arr : array){
            System.out.print(arr+", ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
// method 1 -------------------------------------------
//    static void sortZeroesAndOnes(int[] arr){
//        int n = arr.length;
//        int zeroes = 0;
//        // count number of zeroes
//        for(int i =0; i<n; i++){
//            if(arr[i]==0){
//                zeroes++;
//            }
//        }
//
//        // add zeroes from 0 to zeroes-1 index and in other index add 1
//        for(int i =0; i<n; i++){
//            if(i< zeroes){
//                arr[i] = 0;
//            }else {
//                arr[i] = 1;
//            }
//        }
//    }

 // method 2 ---------------------------------------

    static void sortZeroesAndOnes(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;

        while(left < right){

            if(arr[left] == 1 && arr[right] == 0){
                swap(arr, left, right);
                left++;
                right--;
            }
            if(arr[left] == 0){
                left++;
            }
            if(arr[right] == 1){
                right--;
            }
        }
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
        sortZeroesAndOnes(arr);
        System.out.println("Sorted array :");
        printArray(arr);
    }
}
