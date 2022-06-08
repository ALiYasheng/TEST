package com.unitedcoder.collectiondatastructure;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayAdvanced {
    public static void main(String[] args)
    {
        //find sum and average of ana ArrayLit
        Integer [] evenNumbers = new Integer[]{17, 4,6,8,8,22,8,10};
        ArrayList<Integer> numberArrayList = new ArrayList<Integer>();
        Collections.addAll(numberArrayList, evenNumbers);
        double totalSum = 0;
        for (int number : numberArrayList)
        {
            totalSum +=number;
            // System.out.println(totalSum);
        }
        System.out.println(" Total sum is "+totalSum + "  ");

        //Find average of array
        System.out.println(" There are "+ numberArrayList.size()+ " item in the array");
        System.out.println(" The average number is " + totalSum/numberArrayList.size());

        //Find match
        System.out.println("---Find match example---");
        int i=8;
        int totalMatch = 0;
        for (int number: numberArrayList)
        {
            if (number == i)
            {totalMatch=totalMatch+1;}
        }
        System.out.println(totalMatch);
        if (totalMatch==0)
        {
            System.out.println(" No item is found with the value" +i);
        }

        //Print out Maximum Value
        System.out.println(" --- Print ou tMaximum value---" );
        int maxNumber=0;
        for (int num : numberArrayList){
            if (maxNumber<num){
                maxNumber=num;
            }
        }
        System.out.println(maxNumber);

        //Find minimum value
        int minValue = maxNumber;
        for (int num : numberArrayList){
            if (minValue>num){
                minValue = num;
            }
        }
        System.out.println(" Minimum value is "+minValue);
    }
}
