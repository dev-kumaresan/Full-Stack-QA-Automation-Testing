package testngen.pageom.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testngen.pageom.basepackage.BaseClass;

public class TaskDemoQAExcel {

	public TaskDemoQAExcel() {
		PageFactory.initElements(BaseClass.driver, this);
	}

	public static String DemoQaUrl = "https://demoqa.com/automation-practice-form";
	public static String attribute = "value";
	@FindBy(id = "firstName")
	public static WebElement fn;
	@FindBy(id = "lastName")
	public static WebElement ln;
	@FindBy(id = "userEmail")
	public static WebElement email;
	@FindBy(css = "#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(1) > label")
	public static WebElement gender;
	@FindBy(id = "userNumber")
	public static WebElement mobile;
	@FindBy(id = "dateOfBirthInput")
	public static WebElement dob;
	@FindBy(xpath = "//select[@class='react-datepicker__month-select']")
	public static WebElement month;
	@FindBy(xpath = "//select[@class='react-datepicker__year-select']")
	public static WebElement year;
	@FindBy(xpath = "//*[text()='13']")
	public static WebElement day;
	@FindBy(xpath = "(//div[@id='subjectsWrapper']/child::div)[2]/child::div/child::div")
	public static WebElement subject;
	@FindBy(css = "#hobbiesWrapper > div.col-md-9.col-sm-12 > div:nth-child(3) > label")
	public static WebElement hobby;
	@FindBy(id = "currentAddress")
	public static WebElement address;
	@FindBy(xpath = "//div[@class=' css-1wa3eu0-placeholder']")
	public static WebElement state;
	@FindBy(xpath = "(//div[@class=' css-1wa3eu0-placeholder'])[2]")
	public static WebElement city;
	@FindBy(id = "submit")
	public static WebElement submitButton;
	@FindBy(xpath="//*[@class='modal-content']")
	public static WebElement submittedDataSection;

	/*
	 * public static void validateDatas() throws IOException { List<WebElement>
	 * submittedData = BaseClass.locatorList(By.xpath("//table[@class]/tbody"));
	 * for(int i=1;i<submittedData.size();i++) { if(i==3&&i==5&&i==7) { continue; }
	 * List<WebElement> data =
	 * BaseClass.locatorList(submittedData,By.xpath("//table[@class]/tbody/tr["+i+
	 * "]/td[2]")); for(WebElement value : data) { String valueAsText =
	 * BaseClass.reteriveElementTxt(value); for(int
	 * oddValue=3;oddValue<=7;oddValue++) { if(oddValue%2==1) { List<WebElement>
	 * oddDatas = BaseClass.locatorList
	 * (submittedData,By.xpath("//table[@class]/tbody/tr["+oddValue+"]/td[2]"));
	 * for(WebElement value2 : oddDatas) { String value2AsText =
	 * BaseClass.reteriveElementTxt(value2); String actual =
	 * BaseClass.attributeValueOfAssign(value2, "value");
	 * Assert.assertEquals(value2AsText,actual); } } } for(int j=0;j<1;j++) {
	 * for(int k=0;k<1;k++) {
	 * 
	  *Assert.assertEquals(Utilities.accessByRecords(j, k), valueAsText); } } } } }
	 **/

}
