package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import keyboard.KeyboardKeys;

public class SeleniumPackages extends KeyboardKeys {

	public static WebDriver driver;

	public static void setSystemEnvironment(String driver, String driver_path) {
		System.setProperty("webdriver." + driver + ".driver",
				"/home/kumaresan/eclipse-workspace/SeleniumTesting/" + driver_path);
	}

	public static void chromeDriverLaunch() {
		driver = new ChromeDriver();
	}

	public static void edgeDriverLaunch() {
		driver = new EdgeDriver();
	}

	public static void firefoxDriverLaunch() {
		driver = new FirefoxDriver();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public static void minimizeWindow() {
		driver.manage().window().minimize();
	}

	public static void workingUrl() {
		System.out.println(driver.getCurrentUrl());
	}

	public static void workingUrlTitle() {
		System.out.println(driver.getTitle());
	}

	public static void viewCurrentPageSource() {
		System.out.println(driver.getPageSource());
	}

	public static void closeWorkingUrl() {
		driver.close();
	}

	public static void closeEntireDriver() {
		driver.quit();
	}

	public static void refreshPage() {
		driver.navigate().refresh();
	}

	public static void backPage() {
		driver.navigate().back();
	}

	public static void forwardPage() {
		driver.navigate().forward();
	}

	public static void pageWaitTill(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}

	public static WebElement locator(By l) {
		WebElement element = driver.findElement(l);
		return element;
	}

	public static List<WebElement> locatorList(By ll) {
		List<WebElement> element = driver.findElements(ll);
		return element;
	}

	public static List<WebElement> locatorList(List<WebElement> lw, By ll) {
		lw = driver.findElements(ll);
		return lw;
	}

	public static void typeWrite(WebElement textbox, String tester_input) {
		textbox.sendKeys(tester_input);
	}

	public static void clearInput(WebElement element) {
		element.clear();
	}

	public static void clickElement(WebElement element) {
		element.click();
	}

	public static void attributeValueOf(WebElement element, String value) {
		System.out.println(element.getAttribute(value));
	}

	public static void styleOf(WebElement element, String property) {
		System.out.println(element.getCssValue(property));
	}

	public static void enter(WebElement element) {
		element.submit();
	}

	public static void chromeDriverManager() {
		WebDriverManager.chromedriver().setup();
	}

	public static void edgeDriverManager() {
		WebDriverManager.edgedriver().setup();
	}

	public static void firefoxDriverManager() {
		WebDriverManager.firefoxdriver().setup();
	}

	public static void mouseHover(WebElement element) {
		Actions as = new Actions(driver);
		as.moveToElement(element).perform();
	}

	public static void actionsRightClick(WebElement element) {
		Actions asc = new Actions(driver);
		asc.contextClick(element).perform();
	}

	public static void actionsDClick(WebElement element) {
		Actions asc = new Actions(driver);
		asc.doubleClick(element).perform();
	}

	public static void actionsDragDrop(WebElement drag_area, WebElement drop_area) {
		Actions asc = new Actions(driver);
		asc.dragAndDrop(drag_area, drop_area).perform();
	}

	public static void actionShiftPress(WebElement element, String input) {
		Actions asc = new Actions(driver);
		asc.keyDown(element, Keys.SHIFT).sendKeys(input);
		Action a = asc.build();
		a.perform();
	}

	public static void actionTypeWrite(WebElement element, String input) {
		Actions asc = new Actions(driver);
		asc.keyDown(element, Keys.NULL).sendKeys(input);
		Action a = asc.build();
		a.perform();
	}

	public static void dropDownHandle(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public static void dropDownHandle(WebElement element, String visible_text) {
		Select s = new Select(element);
		s.selectByVisibleText(visible_text);
	}

	public static void dropDownHandle(String value, WebElement element) {
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}

	public static void dropDownMultiSelectGfso(Select s) {

		System.out.println(s.getFirstSelectedOption().getText());
	}

	public static void dropDownMultiSelectGasos(Select s) {
		List<WebElement> all_selected_options = s.getAllSelectedOptions();
		for (WebElement aso : all_selected_options) {
			System.out.println(aso.getText());
		}
	}

	public static void radioButtonOrCheckBoxValidate(WebElement element) {
		boolean isDisplayed = element.isDisplayed();
		System.out.println("Displayed : " + isDisplayed);
		boolean isEnabled = element.isEnabled();
		System.out.println("Enabled : " + isEnabled);
		boolean isSelected = element.isSelected();
		System.out.println("Selected : " + isSelected);
	}

	public static void clickOkBasedResponse() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	public static void clickCancelBasedResponse() {
		Alert al = driver.switchTo().alert();
		al.dismiss();
	}

	public static void typeWriteInPrompt(String tester_input) {
		Alert al = driver.switchTo().alert();
		al.sendKeys(tester_input);
	}

	public static void breakFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	public static void breakFrame(WebDriver driver, String id_or_name) {
		driver.switchTo().frame(id_or_name);
	}

	public static void breakFrame(WebDriver driver, WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void tabSwitch(WebDriver driver, int which_tab) {
		Set<String> tabs = driver.getWindowHandles();
		List<String> tabs_list = new ArrayList<>(tabs);
		driver.switchTo().window(tabs_list.get(which_tab));

	}

	public static void jsTypeWrite(WebElement element, String tester_input) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','" + tester_input + "')", element);

	}

	public static void jsClickElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

	}

	public static void jsAttributeValueOf(WebElement element, String attribute) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		attribute = (String) js.executeScript("return arguments[0].getAttribute('" + attribute + "')", element);
		System.out.println(attribute);
	}

	public static void jsCssHighlight(WebElement element, String property) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style','" + property + "')", element);

	}

	public static JavascriptExecutor scroll(WebDriver driver, int from, int to) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy('" + from + "','" + to + "')");
		return js;
	}

	public static JavascriptExecutor scrollToElement(WebDriver driver, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
		return js;
	}

	public static TakesScreenshot takeScreenshot(WebDriver driver, String path) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		File save_to = new File(path);
		FileUtils.copyFile(screenshot, save_to);
		return (TakesScreenshot) driver;
	}

	public static void takeScreenshot(WebElement element, String path) throws IOException {
		File screenshot = element.getScreenshotAs(OutputType.FILE);
		File save_to = new File(path);
		FileUtils f = new FileUtils();
		FileUtils.copyFile(screenshot, save_to);
	}

	public static void pageWaitBasedOnNetwork(int milliseconds) {
		driver.manage().timeouts().implicitlyWait(milliseconds, TimeUnit.SECONDS);
	}

	public static void excelReadByNameRowCell(String Path, String sheetName, int row, int cell) throws IOException {
		try {
			File file = new File(Path);
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet(sheetName);
			Row r = sheet.getRow(row);
			Cell c = r.getCell(cell);
			System.out.println(c);
		} catch (NullPointerException e) {
			System.out.println("Something in the argument, Not Found !");
		}
	}

	public static void readExcelAllData(String Path, String sheetName) throws IOException {
		try {
			File file = new File(Path);
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet(sheetName);
			for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

				Row r = sheet.getRow(i);
				for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
					Cell c = r.getCell(j);
					System.out.print(c + "\t");
				}
				System.out.print("\n");
			}
		} catch (Exception e) {
			System.out.println("Something in the argument, Not Found !");
		}
	}

	public static void readExcelRowByPosition(String Path, String sheetName, int rowPosition) throws IOException {
		try {
			File file = new File(Path);
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet(sheetName);
			Row r = sheet.getRow(rowPosition);
			for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) {
				Cell c = r.getCell(i);
				System.out.print(c + "\t");
			}
		} catch (Exception e) {
			System.out.println("Something in the argument, Not Found !");
		}
	}
	public static void readExcelColumnByPosition(String Path,String sheetName, int ColumnPosition) throws IOException
	{
		try
		{
		File file = new File(Path);
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
		catch(Exception e)
		{
			System.out.println("Something in the argument, Not Found !");
		}
	}
}
