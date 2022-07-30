package Utilities;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Screenshot  {
	@Test
	public void f() {

		System.setProperty("WebDriver.Chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tide.com/");
		TakesScreenshot hs = (TakesScreenshot) driver;
		File file = hs.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Nari.png");

		try {
			Files.copy(file.toPath(), dest.toPath());
		} catch (IOException e) {
			e.getStackTrace();
		}
		System.out.println("Narendra");

	}

}
