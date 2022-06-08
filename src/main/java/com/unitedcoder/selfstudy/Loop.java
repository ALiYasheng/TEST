package com.unitedcoder.selfstudy;

public class Loop {
    public static void main(String[] args) {
        squre();
        System.out.println();
        kolmas();

    }
    // 矩形 打印 方法 square
    public static void squre(){
        for (int j = 0; j < 5; j++) {
            for (int i=0; i < 5; i++){
                System.out.print("*  ");
            }
            System.out.println();

        }
    }

    // 三角形答应方法
   public static void kolmas(){
       for (int j = 1; j < 6; j++) {
           for (int i = j; i < 6; i++) {
               System.out.print("*  ");
       }
           System.out.println();
       }
   }




}
