package PageObject;

import org.openqa.selenium.WebDriver;

import UiStore.LiveChatUi;

public class LiveChatPage {
	
	WebDriver driver;
	
	public LiveChatPage(WebDriver driver) {
		this.driver=driver;
	}
	public void Live() {
		driver.findElement(LiveChatUi.Live).click();
	}

}
