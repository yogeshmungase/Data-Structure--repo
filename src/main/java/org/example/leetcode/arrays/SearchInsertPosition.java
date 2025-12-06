package org.example.leetcode.arrays;


import java.util.Scanner;

public class SearchInsertPosition {

    // Function to find search/insert position (Linear Search)
    public static int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) return mid;
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return left;


//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] >= target) {   // If equal or greater → return i
//                return i;
//            }
//        }
//
//        return nums.length;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        int index = searchInsert(nums, target);

        System.out.println("Target should be at index: " + index);
    }
}
