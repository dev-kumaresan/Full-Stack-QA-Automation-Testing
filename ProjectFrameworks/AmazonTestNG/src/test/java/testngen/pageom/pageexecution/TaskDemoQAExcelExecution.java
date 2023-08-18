package testngen.pageom.pageexecution;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import testngen.pageom.basepackage.BaseClass;
import testngen.pageom.basepackage.Utilities;
import testngen.pageom.pagefactory.TaskDemoQAExcel;

public class TaskDemoQAExcelExecution {

	@BeforeClass(description = "launch the DemoQA Site")
	public static void launchDemoQA() throws AWTException {
		BaseClass.chromeDriverLaunch();
		BaseClass.launchUrl(TaskDemoQAExcel.DemoQaUrl);
		BaseClass.maximizeWindow();
		BaseClass.ctrlPress();
		BaseClass.minusOpKey();
//		BaseClass.minusOpKey();
//		BaseClass.ctrlRelease();
	}

	@Test(dataProvider = "excelDatas", description = "test excel inputs")
	public void testDemoInputs(String firstName, String lastName, String Email, String mobile, String sub, String addr,
			String state) throws AWTException, InterruptedException, IOException {
		TaskDemoQAExcel tdq = new TaskDemoQAExcel();
		BaseClass.pageWaitTill(3000);
		BaseClass.pageWaitBasedOnDomLoad(5000);
		BaseClass.typeWrite(tdq.fn, firstName);
		String actualFn = BaseClass.attributeValueOfAssign(tdq.fn, tdq.attribute);
		Assert.assertEquals(firstName, actualFn);
		
		BaseClass.typeWrite(tdq.ln, lastName);
		String actualLn = BaseClass.attributeValueOfAssign(tdq.ln, tdq.attribute);
		Assert.assertEquals(lastName, actualLn);
		
		BaseClass.typeWrite(tdq.email, Email);
		String actualEmail = BaseClass.attributeValueOfAssign(tdq.email, tdq.attribute);
		Assert.assertEquals(Email, actualEmail);
		
		BaseClass.clickElement(tdq.gender);
		Assert.assertTrue(tdq.gender.isEnabled());

		
		BaseClass.typeWrite(tdq.mobile, mobile);
		String actualMobile = BaseClass.attributeValueOfAssign(tdq.mobile, tdq.attribute);
		Assert.assertEquals(mobile, actualMobile);
		
		
		BaseClass.clickElement(tdq.dob);
		Assert.assertTrue(tdq.dob.isDisplayed());
		
		BaseClass.dropDownHandle(tdq.month, "October");
		String actualMonth = BaseClass.dropDownMultiSelectGfsoVTAssign(tdq.month, "October");
		Assert.assertEquals("October", actualMonth);
		
		BaseClass.dropDownHandle(tdq.year, "1998");
		String actualYear = BaseClass.dropDownMultiSelectGfsoVTAssign(tdq.year, "1998");
		Assert.assertEquals("1998", actualYear);
		
		BaseClass.clickElement(tdq.day);
		String actualDay = BaseClass.dropDownMultiSelectGfsoVTAssign(tdq.day, "13");
		Assert.assertEquals("13", actualDay);
		
		BaseClass.actionTypeWrite(tdq.subject, sub);
		BaseClass.enterKey();
		String actualSubject = BaseClass.attributeValueOfAssign(tdq.subject, tdq.attribute);
		Assert.assertEquals(sub, actualSubject);
		
		Assert.assertTrue(BaseClass.radioButtonOrCheckBoxValidateAssign(tdq.hobby));
		BaseClass.clickElement(tdq.hobby);
		
		
		BaseClass.typeWrite(tdq.address, addr);
		String actualAddress = BaseClass.attributeValueOfAssign(tdq.address, tdq.attribute);
		Assert.assertEquals(addr, actualAddress);
		
		BaseClass.actionTypeWrite(tdq.state, state);
		BaseClass.enterKey();
		String actualState = BaseClass.attributeValueOfAssign(tdq.state, tdq.attribute);
		Assert.assertEquals(state, actualState);
		
		BaseClass.tabKey();
		BaseClass.downArrowKey();
		BaseClass.enterKey();
		Assert.assertNotNull(tdq.city);
		
		BaseClass.tabKey();
		BaseClass.enterKey();
		BaseClass.pageWaitTill(3000);
		Assert.assertTrue(tdq.submittedDataSection.isDisplayed());
//		
	

	}

	@AfterClass(description = "finally quit the demoQA",enabled=false)
	public static void quitDemoQA() {
		BaseClass.pageWaitBasedOnDomLoad(5000);
		BaseClass.closeEntireDriver();
	}

	@DataProvider(name = "excelDatas")
	public Object[][] demoQaDatas() throws IOException {
		return new Object[][] { {

				"" + Utilities.accessByRecords(0, 0).getStringCellValue() + "",
				"" + Utilities.accessByRecords(0, 1).getStringCellValue() + "",
				"" + Utilities.accessByRecords(0, 2).getStringCellValue() + "",
				"" + Utilities.accessByRecords(0, 3).getStringCellValue() + "",
				"" + Utilities.accessByRecords(0, 4).getStringCellValue() + "",
				"" + Utilities.accessByRecords(0, 5).getStringCellValue() + "",
				"" + Utilities.accessByRecords(0, 6).getStringCellValue() + "",

				}

		};
	}

}

//table[@class]/tbody/tr[i]/td[2]
