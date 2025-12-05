package org.example.arrays.TwoDArrays;

import java.util.Scanner;

public class MultiplicationOfMatrix {

    static void print2DArray(int[][] arr){
        for(int i =0; i<arr.length; i++){ // row
            for(int j =0; j<arr[i].length;j++){ // column
                System.out.print(arr[i][j]+", ");
            }
            System.out.println();
        }
    }

    static void multiply(int[][] arr1, int r1, int c1, int[][] arr2, int r2, int c2){
        if(c1 != r2){
            System.out.println("Multiplication not possible - wrong dimension");
            return;
        }

        int[][] mul = new int[r1][c2];

        for(int i =0; i< r1; i++){
            for(int j =0; j<c2; j++){
                for(int k =0; k<c1; k++){
                    mul[i][j] += (arr1[i][k] * arr2[k][j]);
                }
            }
        }
        System.out.println("Multiplication of 2 matrices is :");
        print2DArray(mul);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tne Row and Column of Matrix one :");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr = new int[r1][c1];

        System.out.println("Enter the elements :");
        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter tne Row and Column of matrix one :");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] arr2 = new int[r2][c2];

        System.out.println("Enter the elements :");
        for(int i =0; i<arr2.length; i++){
            for(int j =0; j<arr2[i].length; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        print2DArray(arr);
        System.out.println("Matrix 2");
        print2DArray(arr2);

        System.out.println("Multiplication of two matrix is ");
        multiply(arr, r1, c1, arr2, r2, c2);

    }
}
