package pracice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DyanamicPageXL {

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\Dyanamicpage");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet Sheet=workbook.createSheet("Dynamic");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of rows");
		int rows=sc.nextInt();
		System.out.println("enter no of cells");
		int cells=sc.nextInt();
		
		for(int r=0;r<=rows;r++) 
		{
		XSSFRow curentrow=Sheet.createRow(r);
		  
		      for(int c=0;c<=cells;c++)
		       {
		            XSSFCell	cell=curentrow.createCell(c);
		            cell.setCellValue(sc.next());
		       }
	     }
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("file is created");

}
}
