package com.unitedcoder.HomeWork;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        Scanner salary=new Scanner(System.in);
        //1. Enter the annual salary and tax filing status from the console;
        System.out.println("please enter your annual salary amount : ");
        String  annualSalaryAmount= salary.nextLine();
        //2. If your tax filing status is single,
        if(StringUtils.isNumeric(annualSalaryAmount)){
            System.out.println();

        System.out.println("please enter your tax filing status: single or married ?");
        String status=salary.next();
        //if()
        // pay 10% tax for the annual salary between $0 - $32,000;
        double salaryAmount = Double.parseDouble(annualSalaryAmount);
        if(status.equalsIgnoreCase("single")) {
            if (salaryAmount > 0 & salaryAmount <= 32000) {
                double tax1 = salaryAmount * 0.1;
                System.out.println("you are tax filing amount is " + tax1);
            }
            // pay 25% tax for the annual salary over $32,000;
            else if (salaryAmount > 32000) {
                double salary1 = Double.parseDouble(annualSalaryAmount);
                double tax1 = salaryAmount * 0.1;//10%
                double tax2 = (salary1-32000)*0.25+tax1 ;//25% over 32000$
                System.out.println("you are tax filing amount is " +tax2);
            }

        //If your tax filing status is married, pay 10% tax for the annual salary between $0 - $64,000
        if (status.equalsIgnoreCase("married")){
            if(salaryAmount>0&salaryAmount<=64000){
                double tax3=salaryAmount*0.1;
                System.out.println("you are tax filing amount is " + tax3);
            }
            //pay 25% tax for the annual salary over $64,000
            else if(salaryAmount>64000){
                double salary2= Double.parseDouble(annualSalaryAmount);
                double tax3=salaryAmount*0.1;
                double tax4=(salary2-64000)*0.25+tax3;
                System.out.println("you are tax filing amount is "+tax4);
            }
        }
        }}else {
            System.out.println("OMG, Pleas Enter  ?");
        }
    }
}
