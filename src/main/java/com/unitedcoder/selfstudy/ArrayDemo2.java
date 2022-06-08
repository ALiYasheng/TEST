package com.unitedcoder.selfstudy;
//数组元素是
// 数组元素是整形---0
// 浮点型---0
//数组元素是char类型的---Ax码中的0  unicode 中的0 输出空白
//boolean 型---false


import static com.unitedcoder.selfstudy.ForLoopSpecialDemo.oddNumber;

public class ArrayDemo2 {
    public static void main(String[] args) {
        //数组元素的默认初始化
        int[] arr =new int[4];//动态初始化
        for (int i = 0; i <= arr.length-1; i++) {
            System.out.println(arr[i]);

        }oddNumber();
}
}
