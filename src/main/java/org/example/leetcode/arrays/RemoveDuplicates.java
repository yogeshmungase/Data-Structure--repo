package org.example.leetcode.arrays;
import java.util.Scanner;
public class RemoveDuplicates {


        // Function to remove duplicates
        public static int removeDuplicates(int[] nums) {

            if (nums.length == 0) return 0;

            int k = 1; // index where next unique element will go

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[k] = nums[i];
                    k++;
                }
            }

            return k; // number of unique elements
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // Input size
            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();

            int[] nums = new int[n];

            // Input elements
            System.out.println("Enter " + n + " sorted elements:");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            // Call function
            int k = removeDuplicates(nums);

            // Output
            System.out.println("Number of unique elements = " + k);
            System.out.print("Array after removing duplicates: ");

            for (int i = 0; i < k; i++) {
                System.out.print(nums[i] + " ");
            }
        }


}
