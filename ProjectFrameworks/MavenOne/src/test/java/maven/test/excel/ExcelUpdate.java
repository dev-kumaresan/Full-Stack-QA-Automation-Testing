package maven.test.excel;

/****** Test the Operations Read, Write, Update ********/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdate {

	public static void main(String[] args) throws IOException {
		
		// Create Sheet, Write to the Sheet, Read it.
		try
		{
			File file = new File("/home/kumaresan/Documents/TestExcelFiles/kumaresan.xlsx");
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet create_sheet = wb.createSheet("Practice");
			Row create_row = create_sheet.createRow(0);
			Cell create_cell = create_row.createCell(1);
			create_cell.setCellValue("Practice Name");
			FileOutputStream fos = new FileOutputStream(file);
			wb.write(fos);
			wb.close();
			System.out.println(create_cell);
		}
		// Get the created Sheet, Update the Cell Value to the cell, Read it. 
		catch(Exception e)
		{
				File file = new File("/home/kumaresan/Documents/TestExcelFiles/kumaresan.xlsx");
				FileInputStream fis = new FileInputStream(file);
				Workbook wb = new XSSFWorkbook(fis);
				Sheet sheet = wb.getSheet("Practice");
				Row get_row = sheet.getRow(0);
				Cell get_cell = get_row.getCell(1);
				get_cell.setCellValue("Practice Time");
				FileOutputStream fos = new FileOutputStream(file);
				wb.write(fos);
				wb.close();
				
				System.out.println(get_cell);
				int noOfRows = sheet.getPhysicalNumberOfRows();
				System.out.println(noOfRows);
				int noOfCells = get_row.getPhysicalNumberOfCells();
				System.out.println(noOfCells);
				Object cell_type = get_cell.getCellType();
				System.out.println(cell_type);
		}
		
		
		

	}

}
