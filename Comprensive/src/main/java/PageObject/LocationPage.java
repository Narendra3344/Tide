package PageObject;

import org.openqa.selenium.WebDriver;

import UiStore.LocationUi;

public class LocationPage {

	WebDriver driver;

	public LocationPage(WebDriver driver) {
		this.driver = driver;
	}
public void Location() {

		driver.findElement(LocationUi.Location).click();
	}

	public void USEnglish() {
		driver.findElement(LocationUi.USEnglish).click();
	}

}
