package maven.test.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	

	public static void fcWriteDataByRowCell(String Path, String sheetName,int row,int cell,String data) throws IOException
	{
		File file = new File(Path);
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet cSheet = wb.createSheet(sheetName);
		Row createRow1 = cSheet.createRow(row);
		Cell createCell = createRow1.createCell(cell);
		createCell.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		wb.close();
		
	}
	public static void writeDataByRowCell(String Path,String sheetName,int row,int cell,Object datas) throws IOException
	{
		File file = new File(Path);
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet getSheet = wb.getSheet(sheetName);
		Row createRow1 = getSheet.createRow(row);
		Cell createCell1 = createRow1.createCell(cell);
		createCell1.setCellValue(datas.toString());
		createCell1.setCellValue((String)datas);
		FileOutputStream fos = new FileOutputStream(file);
		wb.write(fos);
		wb.close();
		System.out.println("success");
	
	}
	
	public static void main(String[] args) throws IOException {

//			fcWriteDataByRowCell("/home/kumaresan/Documents/TestExcelFiles/kumaresan.xlsx", "Java", 0, 0, "paper");
			Object data[][] = { {"Name","Age"},{"Kumaresan",25},{"murugan",56} };
			for(int i=0;i<data.length;i++)
			{
				for(int j=0;j<data[i].length;j++)
				{
					writeDataByRowCell("/home/kumaresan/Documents/TestExcelFiles/kumaresan.xlsx","Java",i,j, data[i][j].toString());
				}
			}
			
			
		   
		
			
			

	}

}
