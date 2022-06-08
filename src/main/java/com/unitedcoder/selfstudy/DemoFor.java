package com.unitedcoder.selfstudy;
//循环结构for
//格式：for（初始化语句；条件判断；步进语句；）循环体
public class DemoFor {
    public static void main(String[] args) {
        //i = i + 1 can write i+=1 or i++
        for(int i = 1; i <= 100; i = i + 1)  {
            System.out.println("i am wrong, forgive me " + i);

        }
        System.out.println("system stop");
    }
}
