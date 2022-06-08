package com.unitedcoder.exeldemo;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class exelUtility {
    //write a method to read exel data
    public String readFromExelCell(String fileName, String sheetName, int rowNumber, int cellNUmber){
        FileInputStream fileInputStream= null;
        try {
            fileInputStream= new FileInputStream(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        XSSFWorkbook workbook= null;
        try {
            workbook = new XSSFWorkbook(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //XSSFSheet sheet = workbook.getSheetIndex(0);
        XSSFSheet sheet1 = workbook.getSheet(sheetName);
        XSSFRow row= sheet1.getRow(rowNumber);
        String cellValue=null;
        if (row==null){
            System.out.println("empty row!!!");
        }
        else{
            XSSFCell cell= row.getCell(cellNUmber);
            CellType cellType= cell.getCellType();
            switch (cellType){
                case NUMERIC:
     //              // cellType=String.valueOf(cell.getNumericCellValue());
                    System.out.println(cellValue);
                    break;
                case STRING:
                    cellValue=cell.getStringCellValue();
                    System.out.println(cellValue);
                    break;
            }
        }
        return cellValue;

    }
}
