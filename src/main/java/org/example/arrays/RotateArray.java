package org.example.arrays;

import java.util.Scanner;

public class RotateArray {

    static void printArray(int[] arr) {
        for (int ans : arr) {
            System.out.print(ans + ", ");
        }
    }

    //    static int[] rotate(int[] arr, int k){
//        int n = arr.length;
//        k = k % n;
//        int[] ans = new int[n];
//        int j =0;
//
//        for(int i = n-k; i<n; i++){
//            ans[j++] = arr[i];
//        }
//
//        for(int i = 0; i< n-k; i++){
//            ans[j++] = arr[i];
//        }
//        return ans;
//    }

    static void swapInArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void pointerReverseArray(int[] arr, int i, int j ) {


        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }


    }

    static int[] rotateInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k% n;
        pointerReverseArray(arr, 0, n-k-1);
        pointerReverseArray(arr, n-k, n-1);
        pointerReverseArray(arr, 0, n-1);

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

        System.out.println("Enter the value of k :");
        int k = sc.nextInt();

//        int[] arr = {1,2,3,4,5};
//        int k = 3;
        printArray(arr);
        System.out.println();
        int[] ans = rotateInPlace(arr, k);
        printArray(ans);
    }
}
