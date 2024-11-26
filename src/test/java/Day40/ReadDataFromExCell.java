package Day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadDataFromExCell {

	public static void main(String[] args) throws IOException {
		FileInputStream File=new FileInputStream(System.getProperty("userdir")+"\\TestData\\BookNames.xlsx");
        XSSFWorkbook WorkBook=new  XSSFWorkbook(File);
        XSSFSheet Sheet= WorkBook.getSheet("sheet2");
        int  rows= Sheet.getLastRowNum();
        int cells= Sheet.getRow(0).getLastCellNum();

        System.out.println("num of rows"+rows);
        System.out.println("num of cells"+cells);

        for(int r=0;r<=rows;r++)
        {
        XSSFRow	AllRows=Sheet.getRow(r);
        System.out.println("all rows is:"+AllRows);
        }
        WorkBook.close();
        File.close();
       
	}
}
