package Day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataintoXL {

	public static void main(String[] args) throws IOException 
	{
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("data");
		XSSFRow row1=sheet.createRow(0);
		  row1.createCell(0).setCellValue("java");
		  row1.createCell(1).setCellValue("123");
		  row1.createCell(2).setCellValue("selenium");
		XSSFRow row2=sheet.createRow(1);
		  row2.createCell(0).setCellValue("c#");
		  row2.createCell(1).setCellValue("1234");
		  row2.createCell(2).setCellValue("Automation");
		XSSFRow row3=sheet.createRow(2);
		  row3.createCell(0).setCellValue("MYSQL");
		  row3.createCell(1).setCellValue("1236");
		  row3.createCell(2).setCellValue("restAssured");
	   FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\Myfile1.xlsx");
	   workbook.write(file);
	   workbook.close();
	   file.close();
	   System.out.println("file is created......");
	}

}
