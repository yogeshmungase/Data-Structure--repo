package org.example.arrays;

import java.util.Scanner;

public class LastOccurrences {

    static int lastOccurrences(int arr[], int x){
        int index = -1;
        int n =x;
        for(int i =0; i<arr.length; i++){
            if(arr[i] == n){
                index = i;
            }
        }

        return  index;
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

        System.out.println("Enter the element :");
        int x = sc.nextInt();

        System.out.println(lastOccurrences(arr, x));
    }
}
