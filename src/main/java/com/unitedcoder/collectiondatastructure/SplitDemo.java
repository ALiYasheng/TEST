package com.unitedcoder.collectiondatastructure;

import java.util.Arrays;

public class SplitDemo {
    public static void main(String[] args) {
        String school = " United_coder_school";
        String s1 = "Hello,welcome,to,Word";
        String [] arr = school.split("_");
        System.out.println(Arrays.toString(arr));

        for (String s:arr){
            System.out.println(s);
        }
        System.out.println("==============================");
        System.out.println(arr[1]);

        System.out.println("==============================");

        String [] arr1 = s1.split(",");
        for (String s2 : arr1){
            System.out.println(s2+"  ");
        }

    }
}
