package PageObject;

import org.openqa.selenium.WebDriver;

import UiStore.Our_CommitmentUi;

public class Our_CommitmentPage {
	
	WebDriver driver;
	
	public Our_CommitmentPage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void Our() {
		driver.findElement(Our_CommitmentUi.Our).click();
	}

}
