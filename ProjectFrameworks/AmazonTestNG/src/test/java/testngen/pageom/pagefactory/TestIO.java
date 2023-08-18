package testngen.pageom.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import testngen.pageom.basepackage.BaseClass;
import testngen.pageom.basepackage.Utilities;

public class TestIO{

	public TestIO()
	{
		PageFactory.initElements(BaseClass.driver, this);
		
	}
	
	public static String credential= "kumaresan.thiru.75";
	
	public static String key = Utilities.getKey();
	@FindBy(id="first_name")
	public static WebElement firstName;
	@FindBy(id="last_name")
	public static WebElement lastName;
	@FindBy(id="company")
	public static WebElement company;
	@FindBy(id="email")
	public static WebElement email;
	@FindBy(id="Message")
	public static WebElement message;
	@FindBy(xpath="//*[@id='lp-pom-button-10']")
	public static WebElement button;
	
	@FindBys({
		@FindBy(xpath="//*[@id='pass']"),
		@FindBy(xpath="//*[@name='pass']"),
		})
	public static WebElement fbPass;
	
	
	@FindBys({
		@FindBy(xpath="//*[@id='email']"),
		@FindBy(xpath="//*[@name='email']"),
		@FindBy(xpath="//*[@data-testid='royal_email']"),
		})
	public static WebElement email2;
}
