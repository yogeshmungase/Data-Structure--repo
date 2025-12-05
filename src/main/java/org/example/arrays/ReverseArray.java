package org.example.arrays;

public class ReverseArray {

//    static void reverseArray(int[] arr){
//       int n = arr.length;
//       int ans[] = new int[n];
//       int j =0;
//        System.out.println("Original Array : ");
//        for(int k =0; k <n; k++ ){
//            System.out.print(arr[k]+", ");
//        }
//
//       for(int i = n-1; i >= 0; i--){
//           ans[j++] = arr[i];
//       }
//        System.out.println();
//        System.out.println("After array reverse :");
////       for(int k =0; k <n; k++ ){
////           System.out.print(ans[k]+", ");
////       }
//
//        for(int rev : ans){
//            System.out.print(rev);
//        }
//    }

    static void printArray(int[] arr){
        for(int ans : arr){
            System.out.print(ans+", ");
        }
    }

    static void swapInArray(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void pointerReverseArray(int[] arr){
        int i =0, j =arr.length-1;

        while(i<j){
            swapInArray(arr, i, j);
            i++;
            j--;
        }


    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        pointerReverseArray(arr);
        printArray(arr);

    }
}
