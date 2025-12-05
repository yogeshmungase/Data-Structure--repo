package org.example.arrays.TwoDArrays;

import java.util.Scanner;

public class TransposeMatrix {
    static void print2DArray(int[][] arr){
        for(int i =0; i<arr.length; i++){ // row
            for(int j =0; j<arr[i].length;j++){ // column
                System.out.print(arr[i][j]+", ");
            }
            System.out.println();
        }
    }

    static int[][] findTranspose(int[][] matrix, int r, int c){
        int[][] ans = new int[c][r];

        for(int i =0; i<c; i++){
            for(int j =0; j<r;j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter tne Row and Column of Matrix one :");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] arr = new int[r1][c1];
        int totalElements = r1 * c1;
        System.out.println("Enter the elements :");
        for(int i =0; i<arr.length; i++){
            for(int j =0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix ");
        print2DArray(arr);

        System.out.println("Transpose of matrix " );
        int[][] ans = findTranspose(arr, r1, c1);
        print2DArray(ans);
    }
}
