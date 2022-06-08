package com.unitedcoder.selfstudy;


import java.sql.SQLOutput;

//求1-100 间偶数和
public class WhileLoop {
    public static void main(String[] args) {
        /*int sum = 0;
        int i = 1;
        while (i <=100){if( i%2==0){
            sum +=i;} i++;
        }
        System.out.println(sum);*/

       //define a string variable
        String greeting = "Hello, Selenium Master";
       // get string length
       int i = greeting.length();
        System.out.println("string length is "+ i);
        //conver to upper case
        String greetingUpper = greeting.toUpperCase();
        System.out.println("Upper case of the strings greeting is > " + greetingUpper);
        //conver to lower case
        String greetingLowercase = greeting.toLowerCase();
        System.out.println("Lower casr of the string greeting is  >" + greetingLowercase);
        //concatenate strings
        String a=greeting.concat("> Jawa Wabdiver Crash Course");
        System.out.println(a);
        //replace strings;
        String testPlane = "Login Test";
        testPlane = testPlane.replace("Test","Plan");
        System.out.println(testPlane);
        //get sub string portion
        greeting = greeting .substring(0,5);
        System.out.println(greeting);
        //remove spaces in the begining and end
        String country = "    USA    ";
        System.out.println("Country is " +country);
        System.out.println("country is " + country.trim());
        //check the first occurrence of the specified character in string
        String x="abcdef";
        char y= 'f';
        int location=x.indexOf(y);
        System.out.println(String.format("The location of %s in %s is %d ",y,x,location));
        //check the sequense of characters in the string
        String testCase="Login Test";
        String subString="Login";
        System.out.println(String.format("Test case: %s contains %s : %b",
                testCase,subString,testCase.contains(subString)));











    }
}
