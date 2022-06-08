package com.unitedcoder.HomeWork;

import java.util.Scanner;

public class TaxClculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the annual Salary Amount: ");
        int salaryAmount= input.nextInt();
        System.out.println("Please Enter the Tax Filing Status: ");
        String taxFilingStatus=input.next();
        if (taxFilingStatus.equalsIgnoreCase("single")){
            if (salaryAmount<32000 & salaryAmount>0){
                System.out.println("your slary is: " +salaryAmount+
                        "  your tax filing status is: " +taxFilingStatus +"   your total tax is:  " + salaryAmount*0.01);
            }else {
                System.out.println("your slary is: " +salaryAmount+
                        "  your tax filing status is: " +taxFilingStatus +"   your total tax is:  " + salaryAmount*0.25);
            }
        } else if (salaryAmount<64000 & salaryAmount>0){
            System.out.println("your slary is: " +salaryAmount+
                    "  your tax filing status is: " +taxFilingStatus +"   your total tax is:  " + salaryAmount*0.01);
        }else {
            System.out.println("your slary is: " +salaryAmount+
                    "  your tax filing status is: " +taxFilingStatus +"   your total tax is:  " + salaryAmount*0.025);
        }


    }
}
