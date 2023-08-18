package testngen.pageom.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testngen.pageom.basepackage.BaseClass;

public class TaskRedbus {

	
	public TaskRedbus()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	public static String redBusUrl = "https://www.redbus.in/";
	public static String expectedInput = "8610450571";
	public static String attribute="value";
	public static int breakFrame=0;
	@FindBy(xpath="//*[text()='Account']")
	public static WebElement AccountSection;
	@FindBy(xpath="//*[text()='Login/ Sign Up']")
	public static WebElement LoginSection;
	@FindBy(xpath="//input[@id='mobileNoInp']")
	public static WebElement mobileNumberField;
	
}
