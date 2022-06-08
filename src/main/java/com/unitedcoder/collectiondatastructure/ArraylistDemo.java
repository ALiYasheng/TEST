package com.unitedcoder.collectiondatastructure;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistDemo {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList=new ArrayList<>();
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(20);
        arrayList.add(50);

        System.out.println(arrayList.size());
        System.out.println(arrayList.get(2));
        arrayList.add(500);
        arrayList.add(400);
        arrayList.add(200);
        arrayList.set(0,600);
        arrayList.add(0,40);
        System.out.println(arrayList.size());
        arrayList.remove(7);
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);

        int sum = 0;
        for (int i= 0; i<arrayList.size(); i++){
            sum= sum + arrayList.get(i);
        }
        System.out.println(sum);
    }
}
