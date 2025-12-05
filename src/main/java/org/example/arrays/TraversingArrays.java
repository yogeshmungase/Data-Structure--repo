package org.example.arrays;

public class TraversingArrays {

    void multiArray(){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("By using for loop ------------->");

        for(int i =0; i<arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }



    void demoArrays(){
        int [] ages = new int[4];
        String[] names = {"rahul", "raj", "vijay"};

        ages[0]= 10;
        ages[1]= 17;
        ages[2]= 18;
        ages[3]= 20;
        // by using for loop
        for(int i =0; i<ages.length; i++){
            System.out.println(ages[i]);
        }

        // by using foreach loop
        System.out.println("For each loop------------------");
        for(int x : ages){
            System.out.println(x);
        }

        System.out.println("By using while loop--------");

        int i =0;
        while (i< ages.length){
            System.out.println(ages[i]);
            i++;
        }

    }

    public static void main(String[] args) {
        TraversingArrays ta = new TraversingArrays();
         //ta.demoArrays();
        ta.multiArray();
    }
}
