package com.gentech.exceldemo;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWriteFromOneExcelFileToAnother {
    public static void main(String[] args) {
        fileToAnotherFile();
    }

    private static void fileToAnotherFile(){
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        Workbook workbookFile1 = null;
        Workbook workbookFile2 = null;
        Sheet sheetFile1 = null;
        Sheet sheetFile2 = null;
        Row rowSheet1 = null;
        Row rowSheet2 = null;
        Cell cellSheet1 = null;
        Cell cellSheet2 = null;
        try{
                fileInputStream = new FileInputStream("E:\\ExcelForJavaPoi\\FlowerAndColour.xlsx");
                workbookFile1 = new XSSFWorkbook(fileInputStream);
                workbookFile2 = new XSSFWorkbook();

                sheetFile1 = workbookFile1.getSheet("Sheet1");

                sheetFile2 = workbookFile2.getSheet("Sheet1");
                if(sheetFile2 == null)
                {
                    sheetFile2 = workbookFile2.createSheet("Sheet1");
                }

                int rowCount = sheetFile1.getPhysicalNumberOfRows();
                for (int r = 0; r < rowCount; r++) {

                    rowSheet1 = sheetFile1.getRow(r);

                    rowSheet2 = sheetFile2.getRow(r);
                    if(rowSheet2 == null){
                        rowSheet2 = sheetFile2.createRow(r);
                    }

                    int cellCount = rowSheet1.getPhysicalNumberOfCells();
                    for (int c = 0; c < cellCount; c++) {

                        cellSheet1 = rowSheet1.getCell(c);

                        cellSheet2 = rowSheet2.getCell(c);
                        if(cellSheet2 == null){
                            cellSheet2 = rowSheet2.createCell(c);
                        }

                        String sheet1Data = cellSheet1.getStringCellValue();
                        cellSheet2.setCellValue(sheet1Data);
                    }
                }
                fileOutputStream = new FileOutputStream("E:\\ExcelForJavaPoi\\FlowerAndColourNew.xlsx");
                workbookFile2.write(fileOutputStream);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
                workbookFile1.close();
                workbookFile2.close();
                fileInputStream.close();
                fileOutputStream.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
