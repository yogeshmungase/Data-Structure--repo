package org.example.arrays.TwoDArrays;

import java.util.Scanner;

public class MultiDimensionalArray {

    static void printArray(int[][] arr){
        for(int i =0; i<arr.length; i++){ // row
            for(int j =0; j<arr[i].length;j++){ // column
                System.out.print(arr[i][j]+", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tne Row and Column :");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[r][c];


        System.out.println("Enter the elements :");
        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }


//        int[][] arr2 = {
//                         {1,2,3},
//                         {4,5,6}
//                        };

        printArray(arr);
    }


}
