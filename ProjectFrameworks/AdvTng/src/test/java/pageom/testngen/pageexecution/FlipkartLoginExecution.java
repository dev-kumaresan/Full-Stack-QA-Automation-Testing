package pageom.testngen.pageexecution;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageom.testngen.basepackage.BaseClass;
import pageom.testngen.pagefactory.FlipkartLogin;

//@Listeners(pageom.testngen.pageexecution.Listeners.class)
public class FlipkartLoginExecution extends BaseClass {
	@BeforeClass
	public static void startMessage()
	{
		printStatement("Start Successfully");
	}
@Parameters("browser1")
@Test(groups="successtests")
public void checkMobileNumberInChrome(String browser) throws Exception
{
	browserTest(browser);
	launchUrl(FlipkartLogin.flipUrl);
	FlipkartLogin tfl = new FlipkartLogin();
	pageWaitBasedOnDomLoad(3000);
	typeWrite(tfl.flipInput, tfl.unExpectedMobileNumber);
	pageWaitBasedOnDomLoad(2000);
    clickElement(tfl.button);
    String error = reteriveElementTxt(tfl.required);
    Assert.assertEquals(tfl.e1, error);
    
}
@BeforeGroups(groups="successtests")
public void groups()
{
	System.out.println("Before group started");
}
@Parameters("browser2")
@Test(groups="successtests")
public void checkMobileNumberInFirefox(String browser) throws Exception
{
	browserTest(browser);
	launchUrl(FlipkartLogin.flipUrl);
	FlipkartLogin tfl = new FlipkartLogin();
	pageWaitTill(3000);
	typeWrite(tfl.flipInput, tfl.unExpectedMobileNumber);
	pageWaitBasedOnDomLoad(2000);
	clickElement(tfl.button);
    String error = reteriveElementTxt(tfl.required);
    Assert.assertEquals(tfl.e1, error);
}
@Parameters("browser1")
@Test(groups="failedtests")
public void mobileNumberFunctionSkipped(String browser) throws Exception
{
	browserTest(browser);
	launchUrl(FlipkartLogin.flipUrl);
	FlipkartLogin tfl = new FlipkartLogin();
	pageWaitBasedOnDomLoad(3000);
	typeWrite(tfl.flipInput, tfl.unExpectedMobileNumber);
	pageWaitBasedOnDomLoad(2000);
	clickElement(tfl.button);
    String error = reteriveElementTxt(tfl.required);
    Assert.assertEquals(tfl.e2, error);
}
@Parameters("browser2")
@Test(groups="failedtests")
public void mobileNumberInFailedCase(String browser) throws Exception
{
	browserTest(browser);
	launchUrl(FlipkartLogin.flipUrl);
	FlipkartLogin tfl = new FlipkartLogin();
	pageWaitBasedOnDomLoad(3000);
	typeWrite(tfl.flipInput, tfl.unExpectedMobileNumber);
	pageWaitBasedOnDomLoad(2000);
	clickElement(tfl.button);
    String error = reteriveElementTxt(tfl.required);
    Assert.assertEquals(tfl.e2, error);
}

@AfterMethod
public static void quitBrowsers() 
{
	closeEntireDriver();
}
@AfterClass
public static void quitMessage()
{
	printStatement("Quit Successfully");
}
public static void main(String[] args) {
	logFatal("debug");
	
}
}
