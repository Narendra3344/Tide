package Runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PageObject.ShopProductPage;
import ResuableComponenet.BaseClass;
import Utilities.log;

public class ShopProductTestRunner extends BaseClass {
	//WebDriver driver;
	log l=new log();
	log k=new log();
	log s=new log();
	log n=new log();
	log d=new log();
@Test
	
	public void Shop() {
//		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
//		 driver=new ChromeDriver();
//		 driver.get("https://tide.com/en-us");
//		
		 ShopProductPage ks=new ShopProductPage(driver);
		 ks.Shop();
		 ks.liquid();
		// driver.close();
		 l.info("Contact Test Pass");
		 l.warn("display warn message");
		 l.fatal("its display");
		 l.error(" display errors");
		 l.debug("debug");

		 k.info("Contact Test Pass");
		 k.warn("display warn message");
		 k.fatal("its display");
		 k.error(" display errors");
		 k.debug("debug");

		 s.info("Contact Test Pass");
		 s.warn("display warn message");
		 s.fatal("its display");
		 s.error(" display errors");
		 s.debug("debug");

		 n.info("Contact Test Pass");
		 n.warn("display warn message");
		 n.fatal("its display");
		 n.error(" display errors");
		 n.debug("debug");

		 d.info("Contact Test Pass");
		 d.warn("display warn message");
		 d.fatal("its display");
		 d.error(" display errors");
		 d.debug("debug");

}
}
