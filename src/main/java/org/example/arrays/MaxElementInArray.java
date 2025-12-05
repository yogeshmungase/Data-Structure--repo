package org.example.arrays;

public class MaxElementInArray {

    void maxElement(){
        int arr[] ={1,5,3};
        int max = arr[0];
        for(int i =0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max element is "+ max);
    }

    public static void main(String[] args) {
        MaxElementInArray max = new MaxElementInArray();
        max.maxElement();
    }
}
