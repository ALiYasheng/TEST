package com.unitedcoder.collectiondatastructure;

import java.util.Arrays;

public class BubbleSortDemo {
    public static void main(String[] args) {
        int[] a = {20, 10, 100, 300, 80, 70, 90};
        for (int j = 0; j < a.length - 1; j++) {
            for (int i = 0; i < a.length - 1 - j; i++) {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        System.out.println("========================================");
        System.out.println(Arrays.toString(a));
    }
}
