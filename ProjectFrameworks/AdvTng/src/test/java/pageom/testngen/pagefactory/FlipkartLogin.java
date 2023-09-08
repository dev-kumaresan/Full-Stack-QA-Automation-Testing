package pageom.testngen.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pageom.testngen.basepackage.BaseClass;

public class FlipkartLogin {

	public FlipkartLogin()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	public static String flipUrl = "https://www.flipkart.com/account/login";
	public static String expectedMobileNumber = "7339395354";
	public static String expectedEmail = "dev.kumaresanl@gmail.com";
	public static String unExpectedMobileNumber = "****";
	public static String e1 = "Please enter valid Email ID/Mobile number";
	public static String e2 = "Please enter valid Email ID/Mobile numbers.";
	public static String attribute = "value";
	@FindBy(xpath="//*[@class='_2IX_2- VJZDxU']")
	public static WebElement flipInput;
	@FindBy(xpath="//*[@value='7339395354']")
	public static WebElement after;
	@FindBy(xpath="//*[@value='dev.kumaresanl@gmail.com']")
	public static WebElement afterEmail;
	@FindBy(xpath="//*[text()='Please enter valid Email ID/Mobile number']")
	public static WebElement required;
	@FindBy(xpath="//*[text()='Request OTP']")
	public static WebElement button;

}
