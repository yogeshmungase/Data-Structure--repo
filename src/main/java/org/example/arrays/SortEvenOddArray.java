package org.example.arrays;

import java.util.Scanner;

public class SortEvenOddArray {

    static void printArray(int[] arr){
        for(int array : arr){
            System.out.print(array+", ");
        }
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void sortEvenOdd(int[] arr){
        int n = arr.length;
        int left = 0, right = n-1;

        while (left < right){
            if(arr[left] % 2 != 0 && arr[right] % 2 == 0){
                swap(arr, left, right);
                left++;
                right--;
            }

            if(arr[left] % 2 == 0){
                left++;
            }
            if(arr[right] % 2 != 0){
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
         sortEvenOdd(arr);
        System.out.println();
        System.out.println("Sorted Array is :");
        printArray(arr);
    }
}
