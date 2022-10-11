package com.gnome;

public class SummativeSums {
    public static void main(String[] args){
        // initialize arrays
        int[] a = {1,90,-33,-55,67,-16,28,-55,15};
        int[] b = {999,-60,-77,14,160,301};
        int[] c = {10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200,-99};

        // initialize total sum for each array
        // use addInt method to initialize
        int sum1 = addInt(a);
        int sum2 = addInt(b);
        int sum3 = addInt(c);
        int totalSum = sum1 + sum2 + sum3;

        // print out array sum
        System.out.println("#1 Array Sum:" + " " + sum1);
        System.out.println("#2 Array Sum:" + " " + sum2);
        System.out.println("#3 Array Sum:" + " " + sum3);
        System.out.println("Your total sum is: " + totalSum);
    }


    public static int addInt(int[] array){
        int x = 0;
        for(int i = 0; i < array.length; i++){  // loop through as long as i is less than the length of array
            x += array[i]; // add indexes
        }
        return x;
    }
}
