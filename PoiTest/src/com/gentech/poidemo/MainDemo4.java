package com.gentech.poidemo;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainDemo4 {
    public static void main(String[] args) {
        writeFruit10thRow();
    }

    private static void writeFruit10thRow(){
        FileOutputStream fileOutputStream = null;
        Workbook workbook = null;
        Sheet sheet = null;
        Row row = null;
        Cell cell = null;

        try{
            fileOutputStream = new FileOutputStream("E:\\TextExcel\\FlowerAndColourNew.xlsx");
            workbook= new XSSFWorkbook();
            sheet = workbook.getSheet("Sheet2");
            if(sheet == null){
                sheet = workbook.createSheet("Sheet2");
            }

            row = sheet.getRow(9);
            if(row == null){
                row = sheet.createRow(9);
            }

            for (int c = 0; c < 20; c++) {
                cell = row.getCell(c);
                if(cell == null){
                    cell = row.createCell(c);
                }

                cell.setCellValue("Fruit1"+(c+1));

            }

            fileOutputStream = new FileOutputStream("E:\\TextExcel\\FruitNew.xlsx");
            workbook.write(fileOutputStream);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            try{
                workbook.close();
                fileOutputStream.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }


}
