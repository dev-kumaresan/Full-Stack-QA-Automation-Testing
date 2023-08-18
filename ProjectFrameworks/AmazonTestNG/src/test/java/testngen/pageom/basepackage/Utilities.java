package testngen.pageom.basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Utilities {
	
public static String getKey()
{
	String userKey = "12345";
	return userKey;
}
public static Cell accessByRecords(int row,int CellIndex) throws IOException
{
	File f = new File("/home/kumaresan/Videos/Java-Salenium-Training/Project-Class/Day8/Tasks-TestNG/demoQa.xlsx");
	FileInputStream fis = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet sheet = wb.getSheet("Sheet1");
	Row row1 = sheet.getRow(row);
	Cell cell1 = row1.getCell(CellIndex);
	cell1.setCellType(CellType.STRING);
	return cell1;
}
}

