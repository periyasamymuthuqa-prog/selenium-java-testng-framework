package utils;


import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelUtils {


    private static XSSFWorkbook workbook;

    private static XSSFSheet sheet;



    public static void loadExcel(
            String filePath,
            String sheetName) {


        try {


            FileInputStream file =
            new FileInputStream(filePath);


            workbook =
            new XSSFWorkbook(file);


            sheet =
            workbook.getSheet(sheetName);


        }
        catch(Exception e){

            e.printStackTrace();

        }

    }



    public static String getCellData(
            int row,
            int column) {


        return sheet
        .getRow(row)
        .getCell(column)
        .getStringCellValue();

    }


    public static int getRowCount(){

        return sheet.getPhysicalNumberOfRows();

    }

}
