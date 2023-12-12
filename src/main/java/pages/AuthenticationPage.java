package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage extends BasePage {

	public AuthenticationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public AuthenticationPage typeUsername(){
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    return this;
	}
	
	public AuthenticationPage typePassword(){
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    return this;
	}
	
	public AuthenticationPage clickButton(){
		driver.findElement(By.id("login-button")).click();
		return this;
	}
	
	
	
	
	
}
