package testngen.pageom.pageexecution;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testngen.pageom.basepackage.BaseClass;
import testngen.pageom.pagefactory.TaskFlipkartLogin;

public class TaskFlipkartLoginExecution {

	
	@BeforeClass(description="launch flipkart url")
	public static void launchFlipkart()
	{
		BaseClass.chromeDriverLaunch();
		BaseClass.launchUrl(TaskFlipkartLogin.flipUrl);
	}
	@Test(description="verify flipkart input for mobile")
	public void verifyFlipMobileInput()
	{
		TaskFlipkartLogin tfl = new TaskFlipkartLogin();
		BaseClass.pageWaitBasedOnDomLoad(3000);
		BaseClass.typeWrite(tfl.flipInput, tfl.expectedMobileNumber);
		BaseClass.pageWaitBasedOnDomLoad(2000);
		String actualMobileNumber = BaseClass.attributeValueOfAssign
				(tfl.after, tfl.attribute);
		Assert.assertEquals(tfl.expectedMobileNumber, actualMobileNumber);
	}
	@AfterClass(description="finally quit the browser")
	public static void quitFlip()
	{
		BaseClass.pageWaitBasedOnDomLoad(2000);
		BaseClass.closeEntireDriver();
	}

}
