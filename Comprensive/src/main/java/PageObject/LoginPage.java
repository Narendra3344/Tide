package PageObject;

import org.openqa.selenium.WebDriver;

import UiStore.LoginUi;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;

	}
	
	public void register() {
		driver.findElement(LoginUi.register).click();
	}


//	public void Firstname() {
//		driver.findElement(LoginUi.Firstname).sendKeys("Narendra");
//	}
//
//	public void email() {
//		driver.findElement(LoginUi.email).sendKeys("Nari@gmail.com");
//	}
//
//	public void password() {
//		driver.findElement(LoginUi.password).sendKeys("pass@123");
//	}
//
//	public void create() {
//		driver.findElement(LoginUi.create).click();
//	}
//
//	public void Login() {
//		driver.findElement(LoginUi.Login).click();
//	}

}
