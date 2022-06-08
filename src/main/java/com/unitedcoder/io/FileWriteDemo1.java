package com.unitedcoder.io;

import org.apache.commons.io.FileUtils;

import java.io.IOException;

public class FileWriteDemo1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append("Add customer test passed!!!");
        //通过 line.separator 换行
        stringBuilder.append(System.getProperty("line.separator"));
        stringBuilder.append("New customer add successfully!!\n");
        stringBuilder.append("Customer added successfully!!!\n");
        FileUtility fileUtility = new FileUtility();
        try {
            fileUtility.writeToFile("Test-Result",
                    "CustomerModuleTest"+ System.currentTimeMillis(),
                    "txt", stringBuilder.toString()); //加System.currentTimeMillis()该文件名
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
