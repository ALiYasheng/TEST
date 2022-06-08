package com.unitedcoder.selfstudy;

import java.util.Scanner;

public class Week4Day2 {
    public static void main(String[] args) {

        //if else statement
        int accountBalance=10000;
        int withdrawAmount=(12000);
        if (withdrawAmount < accountBalance) {accountBalance = accountBalance-withdrawAmount;
            System.out.println(String.format("your balance is %d", accountBalance));
        }else{
            System.out.println("Please enter an amount les than your account balance");
            System.out.println("your accout balance was " + accountBalance);

        }
        System.out.println("========================================================");

        //scanner & ? mark statement
        //system ask for enter balance amount of account
        Scanner inputAmount=new Scanner(System.in);
        System.out.println("Enter your withdraw amount please: ");
        //input amount give to withdrawAmount 2
        int withdrawAmount2=inputAmount.nextInt();
        //assign value to accountBlance2
        int accountBalance2=28000;
        int finalBalance = accountBalance2 - withdrawAmount2;
        //question mark as another way like if statement
        //if condition is match, print out finnal Balance else accountBalamce2
        accountBalance2= withdrawAmount2 < accountBalance2 ? finalBalance : accountBalance2;
        System.out.println(String.format("你输入的取款金额超出你账户余额，你的账户只有 %d", accountBalance2));
        System.out.println("========================================================");


        //if else if else if else statement
        Scanner inputGrade=new Scanner(System.in);
        System.out.println("Enter your grade please: ");
        int score=inputGrade.nextInt();
        System.out.println("You entered: " + score);
        if(score>=90)
            System.out.println("your grade is A");
        else if (score>=80&&score<=90)
            System.out.println("your grade is B");
        else if (score>70 && score<=80)
            System.out.println("your grade is C");
        else
            System.out.println("You failed");
        System.out.println("=======================================================");


        // Nested Conditional Statement --- if else
        Scanner inputNumber=new Scanner(System.in);
        System.out.println("Enter a number:  ");
        int number=inputNumber.nextInt();
        if (number>0)
        {
            if(number%2==0)
            {
                System.out.println("You entered a possitive even number");
            }
            else
            {
                System.out.println("You enterd a possitive odd number ");
            }


        }
        else
            System.out.println("Please enter a possitive number");
        System.out.println("==============================================================");


        //Loop Statetment - Wile
        double balance=1000;
        double targetBalance=10000;
        int years=0;
        int rate=5;
        while (balance<targetBalance)
        {
            years++;
            double interest=balance*rate/100;
            balance=balance+interest;
        }
        System.out.println("Final balance" + balance);
        System.out.println("Total years " +years);

        int i =0;
        int sum=0;
        while (i<10)
        {
            i++;
            sum=sum+i;
        }
        System.out.println(String.format("Sum of number 0 to %d is %d",i,sum));
        System.out.println("===========================================================");
    }
}
