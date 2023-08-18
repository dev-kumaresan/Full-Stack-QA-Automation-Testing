package testngen.pageom.pageexecution;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testngen.pageom.basepackage.BaseClass;
import testngen.pageom.pagefactory.TestIO;

public class TestIOExecution {
 
	@BeforeClass(alwaysRun=true,enabled=true)
	public static void launchTestIO() throws IOException
	{
		BaseClass.chromeDriverLaunch();
		BaseClass.launchUrl(BaseClass.getFromProperty("test-url"));
	}
	@Test(dataProvider="fields",priority=1,invocationCount=2)
	public void tc1(String fn,String ln,String comp,String email,String mes,String value,int len) throws InterruptedException
	{
		TestIO ti = new TestIO();
		BaseClass.typeWrite(ti.firstName, fn);
		String n = BaseClass.attributeValueOfAssign(ti.firstName, value);
		int l = n.length();
		Assert.assertEquals(len, l);
		Assert.assertEquals(fn, n);
		BaseClass.typeWrite(ti.lastName, ln);
		BaseClass.typeWrite(ti.company, comp);
		BaseClass.typeWrite(ti.email, email);
		BaseClass.typeWrite(ti.message, mes);
		BaseClass.clickElement(ti.button);
		BaseClass.pageWaitBasedOnDomLoad(10000);
		
		
	}
 /** NOTE : when switch to new url in any of the @Test annotations method,
  * just launch the url only *DON'T LAUNCH THE DRIVER *
  * 
  * @throws IOException
  */
	@Test(priority=3,dependsOnMethods= {"tc1"},description="facebookLogin")
	public void faceBookValidate() throws IOException
	{
		TestIO ti = new TestIO();
		BaseClass.launchUrl(BaseClass.getFromProperty("facebook-url"));
		BaseClass.maximizeWindow();
		BaseClass.pageWaitBasedOnDomLoad(10000);
		BaseClass.typeWrite(TestIO.email2,TestIO.credential);
		BaseClass.typeWrite(TestIO.fbPass,TestIO.key);
		
		
	}
	@Test(priority=2,dependsOnMethods = {"faceBookValidate"},
			description="sumbitLogin")
	public void submitToFb() throws AWTException
	{
		BaseClass.enterKey();
		
	}
	@AfterClass(description="quit the browser")
	public static void quitTestIO() throws InterruptedException
	{
		BaseClass.pageWaitTill(3000);
		BaseClass.closeEntireDriver();
	}
	@AfterMethod
	public void refresh() throws InterruptedException
	{
		
		
		BaseClass.pageWaitTill(2000);
		BaseClass.refreshPage();
		BaseClass.pageWaitTill(2000);
	}
	@DataProvider(name="fields")
	public Object[][] testDatas()
	{
		return new Object[][]
				{
		{"kumaresan","L","kumaresan-qa","dev.kumaresanl@gmail.com","Hi,I am a tester","value",9},
		{"vijay","k","qa","r","message","value",5}
		};
	}
	
	

}
