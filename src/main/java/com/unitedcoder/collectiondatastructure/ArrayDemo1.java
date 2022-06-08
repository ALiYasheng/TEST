package com.unitedcoder.collectiondatastructure;

import java.util.Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] a;
        a = new int[]{20,10,100,300,80,70,90};

        for (int i = 0; i < a.length-1; i++) {

        for (int j=0; j<a.length-i-1; j++){

            //{20,10,100,300,80,70,90};
            if (a[j]<a[j+1]){ //如果后一项大于前一项，执行下一步
                int box = a[j]; //定义一个空盒子先把第j像元素放进去
                a[j] = a[j+1]; //把后一项赋值给前一项
                a[j+1] = box;  //把盒子里的第一项拿出来赋值给第二项



            }//System.out.println(Arrays.toString(a)); //for 循环里打印输出，6次循环的结果
        } //System.out.println(Arrays.toString(a));
    }System.out.println(Arrays.toString(a));
    }//System.out.println(Arrays.toString(a));
}
