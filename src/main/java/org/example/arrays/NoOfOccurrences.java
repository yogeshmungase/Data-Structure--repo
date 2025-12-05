package org.example.arrays;

public class NoOfOccurrences {
    static int countOccurrences(int[] arr, int x){
      int count = 0;

      for(int i = 0; i< arr.length; i++){
          if(arr[i] == x){
              count += 1;
          }
      }
        return count;

    }

    public static void main(String[] args) {
       int[] arr = {5,6,5,1,5};
       int x = 5;
        System.out.println( countOccurrences(arr,x));
    }
}
