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
		BaseClass.minusOpKey();
		BaseClass.ctrlRelease();
	}

	@Test(dataProvider = "excelDatas", description = "test excel inputs")
	public void testDemoInputs(String firstName, String lastName, String Email, String mobile, String sub, String addr,
			String state, String month, String year) throws AWTException, InterruptedException, IOException {
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

		BaseClass.dropDownHandle(tdq.month, month);
		String actualMonth = BaseClass.dropDownMultiSelectGfsoVTAssign(tdq.month, month);
		String splitMonthTxt = actualMonth.substring(0, 3);
		Assert.assertEquals("October", actualMonth);

		BaseClass.dropDownHandle(tdq.year, year);
		String actualYear = BaseClass.dropDownMultiSelectGfsoVTAssign(tdq.year, year);
		Assert.assertEquals("1998", actualYear);

		BaseClass.clickElement(tdq.day);
		String actualDOB = BaseClass.attributeValueOfAssign(tdq.dobInput, tdq.attribute);
		String[] actualDay = actualDOB.split(" ");
		Assert.assertEquals(actualDay[0] + " " + splitMonthTxt + " " + actualYear, actualDOB);

		BaseClass.actionTypeWrite(tdq.subject, sub);
		BaseClass.enterKey();
		String actualSubject = BaseClass.reteriveElementTxt(tdq.subject);
		Assert.assertEquals(sub, actualSubject);

		BaseClass.clickElement(tdq.hobby);
		Assert.assertTrue(tdq.hobby.isEnabled());

		BaseClass.typeWrite(tdq.address, addr);
		String actualAddress = BaseClass.attributeValueOfAssign(tdq.address, tdq.attribute);
		Assert.assertEquals(addr, actualAddress);

		BaseClass.actionTypeWrite(tdq.state, state);
		BaseClass.enterKey();
		String actualState = BaseClass.reteriveElementTxt(tdq.stateText);
		Assert.assertEquals(state, actualState);

		BaseClass.tabKey();
		BaseClass.downArrowKey();
		BaseClass.enterKey();
		Assert.assertNotNull(tdq.city);

		BaseClass.tabKey();
		BaseClass.enterKey();
		BaseClass.pageWaitTill(3000);
		Assert.assertTrue(tdq.submittedDataSection.isDisplayed());
	}

	@AfterClass(description = "finally quit the demoQA")
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
				"" + Utilities.accessByRecords(0, 7).getStringCellValue() + "",
				"" + Utilities.accessByRecords(0, 8).getStringCellValue() + "",

				}

		};
	}

}

//table[@class]/tbody/tr[i]/td[2]
