package com.gentech.poidemo;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainDemo5 {
    public static void main(String[] args) {
        writeDiag();
    }

    private static void writeDiag() {
            FileInputStream fileInputStream = null;
            FileOutputStream fileOutputStream = null;
            Workbook workbook = null;
            Sheet sheet1 = null;
            Sheet sheet2 = null;
            Row row1 = null;
            Row row2 = null;
            Cell cell1 = null;
            Cell cell2 = null;

            try {
                fileInputStream = new FileInputStream("E:\\TextExcel\\Country.xlsx");
                workbook = new XSSFWorkbook(fileInputStream);
                sheet1 = workbook.getSheet("Sheet1");

                sheet2 = workbook.getSheet("Sheet3");
                if (sheet2 == null) {
                    sheet2 = workbook.createSheet("Sheet3");
                }

                int rowCount = sheet1.getPhysicalNumberOfRows();

                for (int r = 0; r < rowCount; r++) {
                    row1 = sheet1.getRow(r);

                    row2 = sheet2.getRow(r);
                    if (row2 == null) {
                        row2 = sheet2.createRow(r);
                    }

                    cell1 = row1.getCell(r);

                    cell2 = row2.getCell(r);
                    if (cell2 == null) {

                        cell2 = row2.createCell(r);
                    }

                    String sheet1Data = cell1.getStringCellValue();
                    cell2.setCellValue(sheet1Data);
                }

                fileOutputStream = new FileOutputStream("E:\\TextExcel\\Country.xlsx");
                workbook.write(fileOutputStream);

            } catch (Exception e) {
                throw new RuntimeException(e);
            } finally {
                try {
                    fileInputStream.close();
                    fileOutputStream.close();
                    workbook.close();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
