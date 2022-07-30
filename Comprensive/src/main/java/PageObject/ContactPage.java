package PageObject;

import org.openqa.selenium.WebDriver;

import UiStore.ContactUi;

public class ContactPage {

	WebDriver driver;
	public ContactPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void contact() {
		driver.findElement(ContactUi.contact).click();
		
	}
}
