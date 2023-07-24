package maven.test.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void excelReadByNameRowCell(String sheetName, int row, int cell) throws IOException
	{
		File file = new File("/home/kumaresan/Documents/TestExcelFiles/kumaresan.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row r = sheet.getRow(row);
		Cell c = r.getCell(cell);
		System.out.println(c);
	}
	public static void readExcelAllData(String sheetName) throws IOException
	{
		File file = new File("/home/kumaresan/Documents/TestExcelFiles/kumaresan.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet(sheetName);
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++)
		{
			
				Row r = sheet.getRow(i);
				for(int j=0;j<r.getPhysicalNumberOfCells();j++)
				{
					Cell c = r.getCell(j);
					System.out.print(c+"\t");
			}
			System.out.print("\n");
		}
	}
	public static void readExcelRowByPosition(String sheetName, int rowPosition) throws IOException
	{
		File file = new File("/home/kumaresan/Documents/TestExcelFiles/kumaresan.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row r = sheet.getRow(rowPosition);
		for(int i=0;i<r.getPhysicalNumberOfCells();i++)
		{
			Cell c = r.getCell(i);
			System.out.print(c+"\t");
		}
	}
	public static void readExcelColumnByPosition(String sheetName, int ColumnPosition) throws IOException
	{
		File file = new File("/home/kumaresan/Documents/TestExcelFiles/kumaresan.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet(sheetName);
		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++)
		{
			Row r = sheet.getRow(i);
			Cell c = r.getCell(ColumnPosition);
			System.out.println(c);
		}
	}
	public static void main(String[] args) throws IOException {

		
		    
//			excelReadByNameRowCell("Sheet1",1,0);
//		    readExcelAllData("Sheet1");
//		   readExcelRowPosition("Sheet1", 1);
//		readExcelColumnByPosition("sheet1", 2);
		
			
			
	}

}
