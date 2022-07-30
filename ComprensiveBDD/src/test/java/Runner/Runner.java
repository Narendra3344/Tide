package Runner;

import java.io.ObjectInputFilter.Config;

import java.lang.reflect.Method;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.NoInjection;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import PageObject.LoginPage;
import reusableComponent.reusableHelper;

public class Runner {

	public static WebDriver driver;
	
	public static org.apache.logging.log4j.Logger logger = LogManager.getLogger(Runner.class);
	ExtentReports extent;
	ExtentTest test;

	@BeforeMethod
	public void before1() throws Exception {
		driver.get("http://www.Tide.com/");
	}

	@BeforeSuite
	public void beforesuite() {
		extent = new ExtentReports("Report.html");

	}

	@Test(priority = 1)

	public void searchFunctionality(WebDriver driver) {
		driver.get("https://www.tide.com");
	//	LoginPage hpu = new LoginPage();
//		hpu.Register(driver);
//		logger.info("searchFunctionality successfully completed");

	}
//	@Test(priority=2)
//	public void products() {
//		productPageObj ppo=new productpageObj();
//		ppo.productpageDemo(driver);
//		logger.info("products successfully completed");
//	}

	@AfterMethod
	public void tearDownMethod(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			reusableHelper.screenshot(driver);
		}
	}

	@AfterTest
	public void quit() throws InterruptedException {

		extent.endTest(test);
		extent.flush();
		driver.close();

	}

	
}
