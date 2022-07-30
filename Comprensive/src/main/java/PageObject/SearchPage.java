package PageObject;

import org.openqa.selenium.WebDriver;

import UiStore.SearchUi;

public class SearchPage {
	
	WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver=driver;
	}

	public void search() {
		driver.findElement(SearchUi.search).sendKeys("Tide Hygienic clean");
	}
	public void submit() {
		driver.findElement(SearchUi.submit).click();
	}
}
