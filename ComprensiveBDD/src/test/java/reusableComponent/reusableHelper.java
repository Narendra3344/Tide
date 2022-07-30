package reusableComponent;

import java.io.File;
import org.openqa.selenium.TakesScreenshot;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.DataFormat;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

public class reusableHelper {

	public static String screenshot(WebDriver driver) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/" + dataTime() + ".png");
		try {
			FileUtils.copyFile(src, dest);
			// System.out.println("ScreenShot captured");
		} catch (Exception e) {
			System.out.println(e);

		}
		return dest.getAbsolutePath();
	}

	public static String dataTime() {
		DateFormat dt = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date date = new Date();
		return dt.format(date);
	}
}
