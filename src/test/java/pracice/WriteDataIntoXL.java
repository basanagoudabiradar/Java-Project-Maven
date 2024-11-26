package pracice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataIntoXL {

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\file2.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Data");
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("java");
		row1.createCell(1).setCellValue("selenum");
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("testing");
		row2.createCell(1).setCellValue("dev");
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("file is created");
    }

}
