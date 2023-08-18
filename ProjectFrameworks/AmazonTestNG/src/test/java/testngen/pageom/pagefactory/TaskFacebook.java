package testngen.pageom.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testngen.pageom.basepackage.BaseClass;

public class TaskFacebook {
	
	
	public TaskFacebook()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	public static String expectedEmail = "kumaresan.thiru.75";
	public static String expectedPassword = "12345";
	public static String fbUrl="https://www.facebook.com/";
	public static String attribute = "value";
	@FindBy(id="email")
	public static WebElement fbEmail;
	@FindBy(id="pass")
	public static WebElement fbPass;
	
}
