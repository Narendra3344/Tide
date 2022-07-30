package PageObject;

import org.openqa.selenium.WebDriver;

import UiStore.How_To_Wash_ClothesUi;

public class How_To_Wash_ClothesPage {

	WebDriver driver;

	public How_To_Wash_ClothesPage(WebDriver driver) {
		this.driver = driver;
	}

	public void Wash() {
		driver.findElement(How_To_Wash_ClothesUi.Wash).click();
	}

}
