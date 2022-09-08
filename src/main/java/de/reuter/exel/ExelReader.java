package de.reuter.exel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExelReader {

    public static List<String> getDataFromExel(String inputFileLocation, int inputSheetNumber, int inputColumnNumber) {
        try {
            FileInputStream inputFile = new FileInputStream(inputFileLocation);
            Workbook inputWorkbook = new XSSFWorkbook(inputFile);
            Sheet inputSheet = inputWorkbook.getSheetAt(inputSheetNumber);
            List<String> data = new ArrayList<>();
            for (Row row : inputSheet) {
                data.add(getFieldValue(row.getCell(inputColumnNumber)));
            }
            return data;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String getFieldValue(Cell c) {
        try {
            return String.format("%s", (long) c.getNumericCellValue());
        } catch (IllegalStateException e) {
            return c.getStringCellValue();
        }
    }

}
