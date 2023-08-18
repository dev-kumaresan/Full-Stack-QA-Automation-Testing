package testngen.pageom.pageexecution;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testngen.pageom.basepackage.BaseClass;
import testngen.pageom.pagefactory.TaskRedbus;

public class TaskRedbusExecution {

	@BeforeClass(description="launch the redbus url")
	public static void launchRedbus()
	{
		BaseClass.chromeDriverLaunch();
		BaseClass.launchUrl(TaskRedbus.redBusUrl);
		BaseClass.maximizeWindow();
		BaseClass.pageWaitBasedOnDomLoad(3000);
	}
	@Test(description="verify the input")
	public void verifyMobileNumber() throws InterruptedException
	{
		TaskRedbus trb = new TaskRedbus();
		BaseClass.pageWaitBasedOnDomLoad(3000);
		BaseClass.clickElement(trb.AccountSection);
		BaseClass.mouseHover(trb.LoginSection);
		BaseClass.clickElement(trb.LoginSection);
		BaseClass.breakFrame(BaseClass.driver, trb.breakFrame);
		BaseClass.typeWrite(trb.mobileNumberField, trb.expectedInput);
		String actualInput = BaseClass.attributeValueOfAssign(trb.mobileNumberField, 
				trb.attribute);
	    Assert.assertEquals(trb.expectedInput, actualInput);
	}
	@AfterClass(description="finally quit the browser")
	public static void quitRedBus()
	{
		BaseClass.pageWaitBasedOnDomLoad(3000);
		BaseClass.closeEntireDriver();
	}
}
