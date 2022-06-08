//Array 是数组，多个相同类型数据的一个集合，
// 包括很多元素，元素的角标（从零开始）一个数组名。
// 数组的长度---数组内元素的数量
package com.unitedcoder.selfstudy;


public class ArrayDemo1 {
    public static void main(String[] args) {
        //Array 初始化
        int num; //声明
        num=10; // 初始化
        int id = 1001; //声明+初始化

        int[] ids;//声明int 型元素的的数组，名称是ids
        //下面是静态初始化--数组初始化 跟数组元素的赋值同时进行。
        ids = new int[]{1001,1002,1003,1004}; //数组是引用数据类型所以用new
        //下面是动态初始化---数组初始化 和 元素赋值操作分开进行
        String [] names = new String[5]; //有5个元素的数组，没确定各个元素。

        //调用数组元素，通过数组元素的角标
        names[0] = "shirali ";
        names[1] = "yasin";
        names[2] = "mamat ";
        names[3] = "Samat ";
        names[4] = "Amat ";

        //获取数组长度
        //属性 length
        System.out.println(names.length);
        System.out.println(ids.length);

        //如何遍历数组---通过循环
        for (int i = 0; i <= names.length-1; i++) {
            System.out.println(names[i]);
        }


    }
}
