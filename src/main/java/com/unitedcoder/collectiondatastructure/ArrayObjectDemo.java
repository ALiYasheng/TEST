package com.unitedcoder.collectiondatastructure;

import java.util.Arrays;

public class ArrayObjectDemo {
    public static void main(String[] args) {
        int [] arr1=new int[]{100,200,30,40,10,5};
        int [] arr2=new int[]{20,200,40,50,80,100};
        // print out the given Array that element from small to big.
        Arrays.sort(arr2);
        Arrays.sort(arr1);

        // change int data type to sting data type
        // 数组元素在内存单位是以计算机语言单位存储的，所以需要转为字符串
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr1));

        Arrays.fill(arr1,5); //给数组arr1 赋值 5，所有元素变为5

        System.out.println(Arrays.toString(arr1));
        //print out all element from big to small by for loop.
        //从大到小排序
        for (int i=arr2.length-1; i>=0; i--){
            System.out.print(arr2[i]+" more then ");
        }
        System.out.println("==================================================");
        boolean b1 = Arrays.equals(arr1,arr2);
        System.out.println(b1);

        //Copy two array
        int [] arr3 ={20,40,10};
        int [] arr4 =  Arrays.copyOf(arr3,3);
        System.out.println(Arrays.toString(arr4));

        int [] arr5 = {90,20,100,300};
        int [] arr6 = new int[arr5.length];

        for (int i = 0; i < arr5.length; i++) {
            arr6[i]=arr5[i];
        }
        System.out.println("Length of arr6 is "+arr6.length);
        System.out.println("Element of the arr6"+ Arrays.toString(arr6));

    }
}
