package org.example.leetcode.arrays;

import java.util.Scanner;

public class TwoSum {

    int[] twoSum(int[] arr, int target){
        int[] ans = new int[2];
        int k =0;

        for(int i =0; i<arr.length; i++){
            for(int j =i; j<arr.length; j++){
                if(arr[i]+ arr[j] ==target){
                    ans[k++] = i;
                    ans[k++] = j;
                    return ans;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        TwoSum s = new TwoSum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element in array :");
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target :");
        int target = sc.nextInt();

        int[] ans = s.twoSum(arr,target);

        System.out.println("Output :");
        for(int i =0; i<ans.length;i++){
            System.out.print(i+",");
        }

    }
}
