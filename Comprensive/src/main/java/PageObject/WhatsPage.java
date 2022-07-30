package PageObject;

import org.openqa.selenium.WebDriver;

import UiStore.WhatsUi;

public class WhatsPage {
	WebDriver driver;
	
	public WhatsPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void whats() {
		driver.findElement(WhatsUi.What).click();
	}

}
