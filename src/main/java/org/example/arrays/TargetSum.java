package org.example.arrays;

import java.util.Scanner;

public class TargetSum {

    static int pairSum(int[] arr, int target){
        int ans =0;

        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
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

        System.out.println("Enter the Target Sum :");
        int target = sc.nextInt();

        System.out.println("Number of pairs is : "+pairSum(arr, target));
    }
}
