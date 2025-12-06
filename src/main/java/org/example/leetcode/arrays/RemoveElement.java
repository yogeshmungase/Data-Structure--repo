package org.example.leetcode.arrays;

import java.util.Scanner;

public class RemoveElement {

    static void printArray(int[] nums, int k){
        System.out.print("Modified array = ");
        for(int i = 0; i < k; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }

    public int removeElement(int[] nums, int val){
        int k =0;

        for(int i =0; i<nums.length; i++){
            if(nums[i] != val){
                nums[k++] = nums[i];
            }
        }

        printArray(nums, k);

        return k;
    }

    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the Element :");
        for(int i =0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the value :");
        int value = sc.nextInt();

        int k = re.removeElement(nums, value);
        System.out.println("Remaining element is  " +k );


    }
}
