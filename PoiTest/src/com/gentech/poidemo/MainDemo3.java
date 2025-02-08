package com.gentech.poidemo;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainDemo3 {
    public static void main(String[] args) {
        filetofile();
    }

    private static void filetofile(){
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        Workbook workbook1 = null;
        Workbook workbook2 = null;
        Sheet sheet1 = null;
        Sheet sheet2 = null;
        Row row1 = null;
        Row row2 = null;
        Cell cell1 = null;
        Cell cell2 = null;

        try{
            fileInputStream = new FileInputStream("E:\\TextExcel\\Color.xlsx");
            workbook1 = new XSSFWorkbook(fileInputStream);
            workbook2 = new XSSFWorkbook();
            sheet1 = workbook1.getSheet("Sheet1");

            sheet2 = workbook2.getSheet("Sheet1");
            if(sheet2 == null){
                sheet2 = workbook2.createSheet("Sheet1");
            }

            int rowCount = sheet1.getPhysicalNumberOfRows();

            for (int r = 0; r < rowCount; r++) {
                row1 = sheet1.getRow(r);

                row2 = sheet2.getRow(r);
                if(row2 == null){
                    row2 = sheet2.createRow(r);
                }

                cell1  = row1.getCell(0);

                cell2 = row2.getCell(0);
                if(cell2 == null){

                    cell2 = row2.createCell(0);
                }

                String sheet1Data = cell1.getStringCellValue();
                cell2.setCellValue(sheet1Data);
            }

            fileOutputStream = new FileOutputStream("E:\\TextExcel\\ColorNew.xlsx");
            workbook2.write(fileOutputStream);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            try{
                fileInputStream.close();
                fileOutputStream.close();
                workbook1.close();
                workbook2.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

