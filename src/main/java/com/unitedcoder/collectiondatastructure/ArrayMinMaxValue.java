package com.unitedcoder.collectiondatastructure;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMaxValue {
    public static void main(String[] args) {
        //int [] arr = {30,20,15,5,90,50,95,10};
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter the array length: ");
        int length = scanner.nextInt();
        int [] arr= new int[length];

        int maxValue = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*100+1);
            if (maxValue<arr[i]){
                maxValue = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Maximum Value is "+maxValue);
        System.out.println("=======================");

        int minValue = maxValue;
        for (int i = 0; i < arr.length; i++) {
            if (minValue>arr[i]){
                minValue = arr[i];
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum Value is "+minValue);
    }
}
