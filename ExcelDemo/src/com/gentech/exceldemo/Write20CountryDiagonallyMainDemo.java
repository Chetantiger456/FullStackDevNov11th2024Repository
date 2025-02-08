package com.gentech.exceldemo;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;

public class Write20CountryDiagonallyMainDemo {
    static Workbook workbook = null;
    static FileOutputStream fileOutputStream = null;
    public static void main(String[] args) {

        try {
            workbook = new XSSFWorkbook();
            write20CountryDiagonally(20);
            rightToLeftWrite20CountryDiagonally(20);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                workbook.close();
                fileOutputStream.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    private static void write20CountryDiagonally(int numberOfCounty){

        try {

            Sheet sheet = workbook.getSheet("Sheet1");
            if(sheet == null){
                sheet = workbook.createSheet("Sheet1");
            }
            for(int r = 0;r<numberOfCounty;r++) {
                Row row = sheet.getRow(r);
                if(row == null){
                    row = sheet.createRow(r);
                }
                Cell cell = row.getCell(r);
                if(cell == null){
                    cell = row.createCell(r);
                }
                cell.setCellValue("Country"+(r+1));
            }
            fileOutputStream = new FileOutputStream("E:\\ExcelForJavaPoi\\Country.xlsx");
            workbook.write(fileOutputStream);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void rightToLeftWrite20CountryDiagonally(int numberOfCounty){

        try {

            Sheet sheet = workbook.getSheet("Sheet2");
            if(sheet == null){
                sheet = workbook.createSheet("Sheet2");
            }
            for(int r = numberOfCounty-1;r>=0;r--) {
                Row row = sheet.getRow(r);
                if(row == null){
                    row = sheet.createRow(r);
                }
                Cell cell = row.getCell(numberOfCounty-r-1);
                if(cell == null){
                    cell = row.createCell(numberOfCounty-r-1);
                }
                cell.setCellValue("Country"+(numberOfCounty-r));
            }
            fileOutputStream = new FileOutputStream("E:\\ExcelForJavaPoi\\Country.xlsx");
            workbook.write(fileOutputStream);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
