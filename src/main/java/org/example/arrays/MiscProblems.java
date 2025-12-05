package org.example.arrays;

public class MiscProblems {

    static void  swap(int a, int b){
        System.out.println("Original value before swap :");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
//      method 1
//        int temp = a;
//        a = b;
//        b = temp;
//      method 2
        a = a+b;// 3+9 = 12
        b = a-b; // 12-3 = 9
        a = a-b;// 12 -9 = 3
        System.out.println("Values after swap :");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    public static void main(String[] args) {
        int a=9;
        int b=3;
        int[] arr = {1, 2, 3, 4, 5};

        swap(a, b);
    }
}
