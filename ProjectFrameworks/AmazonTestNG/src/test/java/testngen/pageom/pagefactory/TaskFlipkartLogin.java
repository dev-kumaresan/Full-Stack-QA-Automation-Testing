package testngen.pageom.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testngen.pageom.basepackage.BaseClass;

public class TaskFlipkartLogin {

	public TaskFlipkartLogin()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
		public static String flipUrl = "https://www.flipkart.com/account/login";
		public static String expectedMobileNumber = "7339395354";
		public static String attribute = "value";
		@FindBy(xpath="//*[@class='_2IX_2- VJZDxU']")
		public static WebElement flipInput;
		@FindBy(xpath="//*[@value='7339395354']")
		public static WebElement after;
		
}
