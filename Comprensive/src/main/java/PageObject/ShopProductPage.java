package PageObject;

import org.openqa.selenium.WebDriver;

import UiStore.ShopProductUi;

public class ShopProductPage {
	
	WebDriver driver;
	
	public ShopProductPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void Shop() {
		driver.findElement(ShopProductUi.shop).click();
	}
	public void liquid() {
		driver.findElement(ShopProductUi.liquid).click();
	}

}
