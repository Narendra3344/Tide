package Utilities;

import java.io.File;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ResuableComponenet.BaseClass;

public class ExtentReports extends BaseClass{
	public static ExtentReports extent;
	public static ExtentTest test;

	public ExtentReports(String string, boolean b) {
		// TODO Auto-generated constructor stub
	}

	public ExtentTest startTest(String testname) {
		extent = new ExtentReports("Reports.html", true);
//		extent.loadConfig(new File(
//				"C:\\Users\\M1087990\\seleniumprojects\\Ms3Reattempt\\src\\main\\resources\\extent-config.xml"));
		test = extent.startTest(testname);
		test.log(LogStatus.PASS, "Test case " + testname + " started ");
		return test;
	}

	private void loadConfig(File file) {
		// TODO Auto-generated method stub

	}

	public void endTest(ExtentTest test2) {
		extent.endTest(test);
		extent.flush();
		extent.close();
	}

	private void close() {
		// TODO Auto-generated method stub

	}

	private void flush() {
		// TODO Auto-generated method stub

	}
}
