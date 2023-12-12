package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage {
	
	
	public CheckoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public CheckoutPage typeFirstName(){
		driver.findElement(By.id("first-name")).sendKeys("John");
		return this;
	}
	
	public CheckoutPage typeLastName(){
		driver.findElement(By.id("last-name")).sendKeys("Smith");
		return this;
	}
	
	public CheckoutPage typePostalCode(){
		driver.findElement(By.id("postal-code")).sendKeys("12136");
		return this;
	}
	
	public CheckoutPage clickContinue(){
		driver.findElement(By.id("continue")).click();
		return this;
	}
	
	public CheckoutPage clickFinish(){
		driver.findElement(By.id("finish")).click();
		return this;
	}
	
	public CheckoutPage validate(){
		driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).click();
		return this;
	}
	

}
