package com.gentech.exceldemo;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Read2ColumnAndWriteRow {
    public static void main(String[] args) {
        read2ColumnAndWriteToRowInAnotherSheet();
    }

    private static void read2ColumnAndWriteToRowInAnotherSheet()
    {
        FileInputStream fileInputStream =null;
        FileOutputStream fileOutputStream = null;
        Workbook workbook = null;
        Sheet sheet1 = null;
        Sheet sheet2 = null;
        Row rowSheet1 = null;
        Row rowSheet2 = null;
        Cell cellSheet1 = null;
        Cell cellSheet2 = null;
        try{
            fileInputStream= new FileInputStream("E:\\ExcelForJavaPoi\\FlowerColor.xlsx");
            workbook = new XSSFWorkbook(fileInputStream);
            sheet1 = workbook.getSheet("Sheet1");
            sheet2 = workbook.getSheet("Sheet2");
            if(sheet2 == null){
                sheet2=workbook.createSheet("Sheet2");
            }
           int rowCount =  sheet1.getPhysicalNumberOfRows();
            for(int r = 0;r < rowCount;r++){
                rowSheet1 = sheet1.getRow(r);
                int columnCount = rowSheet1.getPhysicalNumberOfCells();
                for(int c = 0;c < columnCount;c++){

                    rowSheet2 = sheet2.getRow(c+3);
                    if(rowSheet2 == null){
                        rowSheet2 = sheet2.createRow(c+3);
                    }
                    cellSheet1 = rowSheet1.getCell(c);
                    cellSheet2 = rowSheet2.getCell(r);
                    if(cellSheet2 == null){
                        cellSheet2 = rowSheet2.createCell(r);
                    }
                    String data = cellSheet1.getStringCellValue();
                   // System.out.printf("%-15s",data);
                    cellSheet2.setCellValue(data);
                }
               // System.out.printf("\n");
            }
            fileOutputStream = new FileOutputStream("E:\\ExcelForJavaPoi\\FlowerColor.xlsx");
            workbook.write(fileOutputStream);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            try {
                workbook.close();
                fileInputStream.close();
                fileOutputStream.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}
