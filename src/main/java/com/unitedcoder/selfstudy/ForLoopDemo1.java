package com.unitedcoder.selfstudy;
// prinout 1- 150
//整除3的数后面输出 foo
// 整除5的数后面输出 biz
// 整除7的数后面输出 baz
// 同时整除3，5，7的数后面输出 foo biz baz
public class ForLoopDemo1 {
    public static void main(String[] args) {

        for (int i = 1; i<= 150; i++) {
            System.out.print(i + " ");
            if (i%3==0){
                System.out.print("foo ");
            }
            if (i%5==0){
                System.out.print("biz ");
            }if (i%7==0){
                System.out.print("baz ");
            }
                System.out.println();

        }
    }
}
