package pracice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_data_fromXL {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file=new FileInputStream(System.getProperty("user-dir"+"\\TestData\\myfile.xslx"));
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		int row=sheet.getLastRowNum();
		int cell=sheet.getRow(0).getLastCellNum();
		
		System.out.println("num of rows"+row);
		System.out.println("num of cells"+cell);
		
		for(int r=0;r<=row;r++)
		{
		  XSSFRow	allrow=sheet.getRow(r);
		  
		  for(int c=0;c<cell;c++)
		  {
			 XSSFCell allcell= allrow.getCell(c);
			 System.out.println("all cells are"+allcell);
		}  
		 	
	}
		workbook.close();
		file.close();
	}
}
