package com.gentech.poidemo;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class MainDemo1 {
    public static void main(String[] args) {
        numberOfColumns();
    }

    private  static void numberOfColumns(){
        FileInputStream fileInputStream = null;
        Workbook workbook = null;
        Sheet sheet = null;
        Row row = null;
        Cell cell = null;

        try{
            fileInputStream = new FileInputStream("E:\\TextExcel\\FlowerAndColourNew.xlsx");
                    workbook= new XSSFWorkbook(fileInputStream);
                    sheet = workbook.getSheet("Sheet1");

                    row = sheet.getRow(0);

                    int cellCount = row.getPhysicalNumberOfCells();

            System.out.println("Number of columns:"+cellCount);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            try{
                workbook.close();
                fileInputStream.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    
}
