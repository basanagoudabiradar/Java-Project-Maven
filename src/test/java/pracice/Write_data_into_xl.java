package pracice;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_data_into_xl {

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream file=new FileOutputStream(System.getProperty("user-dir")+"\\TestData\\myfil.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet();
		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("ram");
		row1.createCell(1).setCellValue("kam");
		row1.createCell(2).setCellValue("ang");
		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("mac");
		row2.createCell(1).setCellValue("book");
		workbook.write(file);
		file.close();
		
	}

}
