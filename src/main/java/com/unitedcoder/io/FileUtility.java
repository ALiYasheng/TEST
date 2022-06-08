package com.unitedcoder.io;

import org.apache.xmlbeans.SystemProperties;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtility {
    //Create method to write a texts file.
    public void writeToFile(String fileFolder, String fileName,
                            String extension, String contain) throws IOException {
        // Create a folder if does not exist,
        String rootPath = System.getProperty("user.dir");
        String finalFolder = rootPath + File.separator + fileFolder;
        File file = new File(finalFolder);
        if (!file.exists()) {
            file.mkdir();
            System.out.println("Folder is created");
        }

        //final file name
        String finalFileName = finalFolder + File.separator + fileName + extension;
        File myFile = new File(finalFileName);
        FileWriter writer= null;

        //write content to my file by FileWriter
        try{
            writer = new FileWriter(myFile.getAbsoluteFile());
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Contain FileWriter to BufferedWriter (can contain more content thar FileWriter)
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        try {
            bufferedWriter.write(contain);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
