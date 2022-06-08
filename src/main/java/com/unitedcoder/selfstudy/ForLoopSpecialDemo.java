package com.unitedcoder.selfstudy;

public class ForLoopSpecialDemo {
    public static void main(String[] args) {
        int i=1;
        for (System.out.print('a'); i<=3; System.out.print('c'), i++ ) {
            System.out.print('b');
        }
        System.out.println();
        oddNumber();
        System.out.println();
        oddSum();
        System.out.println();
        numberOfOdd();


    }

    //odd number between 1-100 为自己的输出1--100 间偶数的计算方法。上面以调用
    public static void oddNumber(){
        for (int i=1; i<=100; i++){
            if (i %2==0){
                System.out.print(i+ "  ");
            }
        }
    }

    //sum of odd number between 1-100求偶数和 方法
    public static void oddSum(){
        int sum=0;
        for (int i=0; i<=100; i++){
            if (i%2==0){
                System.out.print(i+" " );
                sum=sum+i;
            }
        }
        System.out.println();
        System.out.println(sum + " ");
    }
    //how many even number between 1-100求偶数个数 方法
    public static void numberOfOdd(){
        int sum = 0;
        for (int i=1; i <=100; i++){
            if (i%2==0){
                sum=sum+1;
            }
        }System.out.print(sum+ " ");

    }




}
