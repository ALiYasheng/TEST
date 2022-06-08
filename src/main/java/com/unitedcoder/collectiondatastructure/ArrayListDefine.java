package com.unitedcoder.collectiondatastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDefine {
    public static void main(String[] args) {
        //Create a new array list
        ArrayList<String> names = new ArrayList<String>();

        //Add element/item
        names.add("Bob");
        names.add("Smith");
        names.add("Mike");
        names.add("Jordan");
        names.add("Emily");

        //set 2nd item
        names.set(1, "shirali");
        for (String name: names){
            System.out.println(name);
        }
        System.out.println(" The secondperson is ---" + names.get(1));

        // get total size of arry list
        System.out.println("total items: " + names.size());

        //Loop through item and print
        for (String name : names){
            System.out.print(name + "  " );
        }

        System.out.println(); //换行需要
        //Remove First item and print
        System.out.println(" ------Remove the first element-------");
        names.remove(0);
        for (String name: names){
            System.out.print(name+ "  ");
        }

        System.out.println(); // 换行需要
        //get specific element from array
        System.out.println(" The secoond person is ：- " + names.get(1));

        //Convert Array to ArrayList
        System.out.println(" print out number---");
        Integer[] evenNumbers = new Integer[]{2,4,6,8,10,};
        List<Integer> numberArraylist = new ArrayList<Integer>();
        numberArraylist = Arrays.asList(evenNumbers);
        for (Integer number : numberArraylist) {
            System.out.print(number + "  ");
        }
    }
}
