package Guru99loginpage;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class FetchData_Excel {
    private static WebDriver driver;



    public static String[][] readFile(String sheetName) throws IOException, InvalidFormatException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {



        File file = new File("src/main/resources/Login_Credentials.xlsx");


        XSSFWorkbook workbook = new XSSFWorkbook(file);


        XSSFSheet sheet = workbook.getSheet(sheetName);




        //Get rows count

       int totalRows = sheet.getLastRowNum();
        //Get column count
        int totalCols = sheet.getRow(0).getLastCellNum();
        System.out.println("Total rows: " + totalRows);
        System.out.println("Total cols: " + totalCols);



        String[][] data = new String[totalRows][totalCols];
        /**
         * Loop through the rows
         */
        //i=1 coz first row is header
        for(int i=1;i<=totalRows;i++){
            //loop thro columns
            for(int j=0;j<totalCols;j++){
                String value= sheet.getRow(i).getCell(j).getStringCellValue();
                data[i-1][j]=value;
                System.out.println("Value is: "+value);

            }
        }
        workbook.close();
        return data;
    }
}
