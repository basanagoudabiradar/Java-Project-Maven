package Day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromXl {

	public static void main(String[] args) throws IOException {
		FileInputStream file=new  FileInputStream(System.getProperty("user.dir")+"\\TestData\\bookNames.xlsx") ;
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		int rows=sheet.getLastRowNum();
		
		int cells=sheet.getRow(0).getLastCellNum();
		
		System.out.println("num of rows:"+rows);
		System.out.println("num of cells:"+cells);
		
		for(int r=0;r<=rows;r++)
		{
		  XSSFRow	allrows=sheet.getRow(r);
			for(int c=0;c<cells;c++)
			{
				XSSFCell allcell=allrows.getCell(c);
				System.out.print(allcell.toString()+"\t");
			}
			System.out.println();
		}
		workbook.close();
		file.close();
	}

}
