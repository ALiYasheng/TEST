package com.unitedcoder.selfstudy;

import java.util.Scanner;

public class DogAge {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("please enter the ages of your dog: ");
        int dogAge=scanner.nextInt();

        if (dogAge>0 && dogAge<=2){
            System.out.println("Same as human's age " +dogAge * 10.5);
        }else if (dogAge>2){
            System.out.println("Same as human's age " +(( dogAge-2) * 4 + 2 *10.5));
        }else{
            System.out.println("Your dog hasn't been born yet");
        }
    }
}
