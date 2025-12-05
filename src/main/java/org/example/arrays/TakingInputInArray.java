package org.example.arrays;

import java.util.Scanner;

public class TakingInputInArray {

    void inputInArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter "+ n + " elements");
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

        //trying to copy arr to arr2
        int[]  arr_2 = arr;

    }

    public static void main(String[] args) {
        TakingInputInArray input = new TakingInputInArray();
        input.inputInArray();
    }
}
