package com.gentech.exceldemo;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Read5ThColumnWrite5ThRow {
    public static void main(String[] args) {
        read20RowIn5ThColumnAndWriteTo5ThRow();
    }

    private static void read20RowIn5ThColumnAndWriteTo5ThRow(){
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        Workbook workbook = null;
        Sheet sheet1 = null;
        Sheet sheet2 = null;
        Row rowSheet1 = null;
        Row rowSheet2 = null;
        Cell cellSheet1 = null;
        Cell cellSheet2 = null;

        try {
            fileInputStream = new FileInputStream("E:\\ExcelForJavaPoi\\Bird.xlsx");
            workbook = new XSSFWorkbook(fileInputStream);
            sheet1 = workbook.getSheet("Sheet1");
            sheet2 = workbook.getSheet("Sheet2");
            if(sheet2 == null)
            {
                sheet2 = workbook.createSheet("Sheet2");
            }
            int rowCount = sheet1.getPhysicalNumberOfRows();
            for(int r = 0;r < rowCount;r++){
                rowSheet1 = sheet1.getRow(r);
                rowSheet2 = sheet2.getRow(rowCount-r-1);
                if(rowSheet2 == null){
                    rowSheet2 = sheet2.createRow(rowCount-r-1);
                }
                cellSheet1 = rowSheet1.getCell(4);
                String data = cellSheet1.getStringCellValue();
                // System.out.printf("%-15s",data);
                cellSheet2 = rowSheet2.getCell(4);
                if(cellSheet2 == null){
                    cellSheet2 = rowSheet2.createCell(4);
                }
                cellSheet2.setCellValue(data);
            }
            fileOutputStream = new FileOutputStream("E:\\ExcelForJavaPoi\\Bird.xlsx");
            workbook.write(fileOutputStream);
        } catch (Exception e) {
            e.printStackTrace();
            //throw new RuntimeException(e);
        }finally {
            try {
                workbook.close();
                fileInputStream.close();
                fileOutputStream.close();
            } catch (Exception e) {
                //throw new RuntimeException(e);
                e.printStackTrace();
            }
        }
    }
}
