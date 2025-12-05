package org.example.arrays;

import java.util.Scanner;

public class SecondLargestElement {

    static int findMax(int[] arr){
     int mx = Integer.MIN_VALUE;
     for(int i =0; i< arr.length; i++){
         if(arr[i] > mx){
             mx = arr[i];
         }
     }
     return  mx;
    }

    static int findSecondMax(int[] arr){
        int mx = findMax(arr);

        for(int i =0; i< arr.length;i++){
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }

        int secondMax = findMax(arr);
        return secondMax;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the "+ n + " no of elements :");
        for(int i =0; i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Second max Element is "+ findSecondMax(arr));

    }
}
