package testngen.pageom.basepackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends KeyboardKeys {
	/**
	 * <h1>Description for interface and its instance</h1> ************** Declare
	 * WebDriver interface and create instance named driver for it. By using the
	 * instance named driver, calling the WebDriver classes and its methods By
	 * creating this WebDriver instance in dynamic way for accessing this classes
	 * 
	 * <h1>Description for Access Specifier and Noc-Access specifier</h1> ********
	 * Declare the interface as public access specifier which means
	 */
	public static WebDriver driver;
	public static Logger logger;

	public static void setSystemEnvironment(String driver, String driver_path) {
		System.setProperty("webdriver." + driver + ".driver",
				"/home/kumaresan/eclipse-workspace/SeleniumTesting/" + driver_path);
	}

	public static void chromeDriverLaunch() {
		driver = new ChromeDriver();
	}

	public static WebDriver chromeDriverAssignLaunch() {
		driver = new ChromeDriver();
		return driver;
	}

	public static WebDriver firefoxDriverAssignLaunch() {
		driver = new FirefoxDriver();
		return driver;
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

	public static String launchUrlAssign(String url) {
		driver.get(url);
		return url;
	}

	public static Object launchUrl(Object object) {
		driver.get((String) object);
		return object;
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

	public static String workingUrlAssign() {
		return driver.getCurrentUrl();
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

	public static void typeWritePF(WebElement textbox, String tester_input) {
		textbox.sendKeys(tester_input);
	}

	public static void clearInput(WebElement element) {
		element.clear();
	}

	public static void clickElement(WebElement element) {
		element.click();
	}

	public static String attributeValueOfAssign(WebElement element, String value) {

		return element.getAttribute(value);
	}

	public static void attributeValueOf(WebElement element, String value) {

		System.out.println(element.getAttribute(value));
	}

	public static void styleOf(WebElement element, String property) {
		System.out.println(element.getCssValue(property));
	}

	public static String styleOfAssign(WebElement element, String property) {

		return element.getCssValue(property);
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

	public static String dropDownMultiSelectGfsoVTAssign(WebElement element, String value) {

		Select s = new Select(element);
		s.selectByVisibleText(value);
		return s.getFirstSelectedOption().getText();
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

	public static boolean radioButtonOrCheckBoxValidateAssign(WebElement element) {
		boolean isDisplayed = element.isDisplayed();
		System.out.println("Displayed : " + isDisplayed);
		boolean isEnabled = element.isEnabled();
		System.out.println("Enabled : " + isEnabled);
		boolean isSelected = element.isSelected();
		System.out.println("Selected : " + isSelected);
		return isSelected;
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
		return ts;
	}

	public static void takeScreenshot(WebElement element, String path) throws IOException {
		File screenshot = element.getScreenshotAs(OutputType.FILE);
		File save_to = new File(path);
		FileUtils f = new FileUtils();
		FileUtils.copyFile(screenshot, save_to);
	}

	public static void pageWaitBasedOnDomLoad(int milliseconds) {
		driver.manage().timeouts().implicitlyWait(milliseconds, TimeUnit.SECONDS);
	}

	public static void folderCreation(String Path) {
		File file = new File(Path);
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

	public static void readExcelColumnByPosition(String Path, String sheetName, int ColumnPosition) throws IOException {
		try {
			File file = new File(Path);
			FileInputStream fis = new FileInputStream(file);
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet(sheetName);
			for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
				Row r = sheet.getRow(i);
				Cell c = r.getCell(ColumnPosition);
				System.out.println(c);
			}
		} catch (Exception e) {
			System.out.println("Something in the argument, Not Found !");
		}
	}

	public static String getFromProperty(String propertyValue) throws IOException {
		File relativePath = new File(propertyValue);
		String absolutePath = relativePath.getAbsolutePath();
		File file = new File(absolutePath);
		FileInputStream fis = new FileInputStream(file);
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(propertyValue);
		return value;

	}

	public static void printStatement(Object value) {
		System.out.println(value);
	}

	public static String reteriveElementTxt(WebElement element) {
		return element.getText();
	}

	public static void webDriverWaitAndClick(WebDriver driver, WebElement locator, Duration time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();
	}

	public static void logDebug(String logDebugStatement) {
		logger = LogManager.getLogger();
		logger.debug(logDebugStatement);
	}

	public static void logInfo(String logDebugStatement) {
		logger = LogManager.getLogger();
		logger.info(logDebugStatement);
	}

	public static void logWarning(String logDebugStatement) {
		logger = LogManager.getLogger();
		logger.warn(logDebugStatement);
	}

	public static void logError(String logDebugStatement) {
		logger = LogManager.getLogger();
		logger.error(logDebugStatement);
	}

	public static void logFatal(String logDebugStatement) {
		logger = LogManager.getLogger();
		logger.fatal(logDebugStatement);
	}

}
