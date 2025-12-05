package org.example.arrays;

public class SumOfArray {

    void sumOfArray(){
        int[] arr = {12,23,34,45,56};
        int sum =0;


//        for(int i =0; i< arr.length; i++){
//            sum += arr[i];
//        }

        int i =0;
        while (i < arr.length){
            sum = sum + arr[i];
            i++;
        }
        System.out.println("Sum of the Array is " + sum);
    }

    public static void main(String[] args) {
        SumOfArray sum = new SumOfArray();
        sum.sumOfArray();
    }
}
