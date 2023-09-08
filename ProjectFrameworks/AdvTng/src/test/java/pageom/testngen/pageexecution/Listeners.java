package pageom.testngen.pageexecution;

import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener, IRetryAnalyzer {

	private int reTestCount = 0;
	private int maxCount = 2;
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Successful");
		
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		 System.out.println("Test Skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
	 System.out.println("Driver Started");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Driver Finish");
		
	}

	@Override
	public boolean retry(ITestResult result) {

		if(reTestCount<maxCount)
		{
			reTestCount++;
			return true;
		}
		return false;
	}

	
}
