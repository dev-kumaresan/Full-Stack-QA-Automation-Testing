package maven.test.excel;

/**********   Excel Read :- Basic steps Remember -
                    get file using - File class 
                    declare - FileInputStream class for reading a file
                    WorkBook interface for - get the workbook first
                    Sheet interface for - get which sheet in the workbook using getSheet() method..
                    Row interface for - get which row in the sheet using getRow() method
                    Cell interface for - get which cell in the row using getCell() method 
                    finally read the cell using print statement **********/

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
//		c.setCellValue("Age");
//		FileOutputStream fos = new FileOutputStream(file);                   //update Cell
//		wb.write(fos);
//		wb.close();
		System.out.println(c);           //print in console
	
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

		
		    
			excelReadByNameRowCell("Java",0,1);
//		    readExcelAllData("Sheet1");
//		   readExcelRowByPosition("Sheet1", 1);
//		readExcelColumnByPosition("sheet1", 2);
//		SeleniumPackages.excelReadByNameRowCell("/home/kumaresan/Documents/TestExcelFiles/kumaresan.xlsx", "Sheet2", 1, 0);
//		SeleniumPackages.readExcelAllData("/home/kumaresan/Documents/TestExcelFiles/kumaresan.xlsx", "Sheet2");
//		SeleniumPackages.readExcelRowByPosition("/home/kumaresan/Documents/TestExcelFiles/kumaresan.xlsx", "Sheet1", 0);
//		SeleniumPackages.readExcelColumnByPosition("/home/kumaresan/Documents/TestExcelFiles/kumaresan.xlsx", "Sheet1", 1);
			
			
			
		
			
			
	}

}
