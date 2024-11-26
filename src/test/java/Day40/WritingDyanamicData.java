package Day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDyanamicData {

	public static void main(String[] args) throws IOException {
		FileOutputStream file =new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\Dyanamic1_file.xslx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Dynamic");
		
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		System.out.println("enter no of rows?");
		int cells=sc.nextInt();
		System.out.println("enter no of cells?");
		for(int r=0;r<=rows;r++)
		{
			XSSFRow currentrow=sheet.createRow(r);
			for(int c=0;c<cells;c++)
			{
				XSSFCell currentcell=currentrow.createCell(c);
				currentcell.setCellValue(sc.next());
				
			}
		}
		
		workbook.write(file);
		workbook.close();
		file.close();
		System.out.println("file is created");

	}

}
