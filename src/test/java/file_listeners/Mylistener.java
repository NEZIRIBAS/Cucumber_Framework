package file_listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

	public class Mylistener implements ITestListener {

		@Override
		public void onStart(ITestContext context) {
			System.out.println("Project Execution Started");
		
		}
		
		@Override
		public void onTestStart(ITestResult result) {
			String testName = result.getName();
			System.out.println(testName + "---------> Test Case Started Executing");
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			String testName = result.getName();
			System.out.println(testName + "---------> Test Case Passed");
		
		}

		@Override
		public void onTestFailure(ITestResult result) {
			String testName = result.getName();
			System.out.println(testName + "---------> Test Case Failed" );
	
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			String testName = result.getName();
			System.out.println(testName + "---------> Test Case Skipped");
		
		}

		@Override
		public void onFinish(ITestContext context) {
			System.out.println("Project Execution Ends");
	
		}
	
	}


