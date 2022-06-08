package com.unitedcoder.collectiondatastructure;

import java.util.Arrays;

public class DataStructureArray {
    public static void main(String[] args) {
        //Define int type array
        int[] numberArr = new int[5];
        //Define String data type array
        String [] stringsArr = new String[5];

        //Assign value to numberArr
        numberArr [0] = 2;
        numberArr [1] = 4;
        numberArr [2] = 3;
        //numberArr [3] = 8;
        //numberArr [4] = 9;

        System.out.println("The number of the element in the array is: " + numberArr.length );
        System.out.println(Arrays.toString(numberArr));
        for (int number: numberArr){
            System.out.print(number+"  ");

        }
        System.out.println(); //换行需要
        System.out.println("===============================================");
        //Assign value to stringsArr
        stringsArr[0] = "samt";
        stringsArr[1] = "mamat";
        stringsArr[2] = "amat";
        stringsArr[3] = "san";
        stringsArr[4] = "man";
        System.out.println("The number of the element in the array is " + stringsArr.length);
        System.out.println(Arrays.toString(stringsArr));
        System.out.println("===============================================");
        //for Loop for printout all element in the array
        for (String name : stringsArr){
            System.out.print(name + "  ");
        }

        System.out.println(); //换行需要
        System.out.println("================================================");
        // Two dimensional arrays
        int row = 3;
        int column = 4;
        String[][] seats = new String[row][column];
        seats [0] [0] = "Mike";
        seats [0] [1] = "Bob";
        seats [0] [2] = "Emily";
        seats [0] [3] = "Jake";
        for ( int r= 0; r<3;r++){
            for (int c =0; c<column; c++){
                //if we not use this line,this code will be return null for unassigned seats.
                if (seats[r][c]== null){
                    seats[r][c]= "unassigned";
                }

                System.out.println("Row  " + r + " column  " + c + " assigned "+ seats[r][c]);
            }

        }

    }
}
