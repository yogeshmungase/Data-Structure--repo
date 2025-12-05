package org.example.arrays;

public class ArraysExample {

    void multiArray(){
        int[][] sumArray = new int[4][3];

        sumArray[0][0] = 12;
        sumArray[0][1] = 13;
        sumArray[0][2] = 14;
        sumArray[1][0] = 15;
        sumArray[1][1] = 16;
        sumArray[1][2] = 17;

        System.out.println(sumArray[0][0]);
        System.out.println(sumArray[0][1]);
        System.out.println(sumArray[0][2]);

        System.out.println(sumArray[1][0]);
        System.out.println(sumArray[1][1]);
        System.out.println(sumArray[1][2]);
    }
    void demoArrays(){
        int [] ages = new int[10];
        String[] names = {"rahul", "raj", "vijay"};

        ages[0]= 10;
        ages[1]= 17;
        ages[2]= 18;
        ages[3]= 20;

        System.out.println(ages[0]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[1]);
        System.out.println("_________+_________________");
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println("_________+_________________");
        System.out.println(ages.length);
        System.out.println(names.length);

    }
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
        obj.demoArrays();
        //obj.multiArray();
    }
}
