package testngen.pageom.pageexecution;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import testngen.pageom.basepackage.BaseClass;
import testngen.pageom.pagefactory.TaskFacebook;

public class TaskFacebookExecution {

	@BeforeClass(description="launch the fb in browser")
	public static void launchFb()
	{
		BaseClass.chromeDriverLaunch();
		BaseClass.launchUrl(TaskFacebook.fbUrl);
		BaseClass.pageWaitBasedOnDomLoad(3000);
	}
	@Test(description="check fb valid inputs")
	public void fbInputs()
	{
		TaskFacebook tf = new TaskFacebook();
	  BaseClass.typeWrite(tf.fbEmail, tf.expectedEmail);
	  BaseClass.typeWrite(tf.fbPass, tf.expectedPassword);
	  String actualEmail = BaseClass.attributeValueOfAssign
			  (tf.fbEmail, tf.attribute);
	  String actualPass = BaseClass.attributeValueOfAssign
			  (tf.fbPass, tf.attribute);
	  Assert.assertEquals(tf.expectedEmail, actualEmail);
	  Assert.assertEquals(tf.expectedPassword, actualPass);
	}
	@AfterClass(description="finally quit the browser")
	public static void quitBrowser()
	{
		BaseClass.pageWaitBasedOnDomLoad(3000);
		BaseClass.closeEntireDriver();
	}

}
