package de.reuter.exel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExelWriter {

    public static void writeDataToExel(String outputFileLocation, int outputSheetNumber, int outputColumnNumber,List<String> data) {
        try {
            FileInputStream outputFile = new FileInputStream(outputFileLocation);
            Workbook outputWorkbook = new XSSFWorkbook(outputFile);
            Sheet outputSheet = outputWorkbook.getSheetAt(outputSheetNumber);

            for (Row row : outputSheet) {
                row.getCell(outputColumnNumber).setCellValue(data.get(row.getRowNum()));
            }
            FileOutputStream file = new FileOutputStream(outputFileLocation);
            outputWorkbook.write(file);
            file.close();
            System.out.println("Data Copied to Excel");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
