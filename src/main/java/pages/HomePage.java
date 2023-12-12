package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
	
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public HomePage addProduct(){
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		return this;
	}
	
	public HomePage addProduct2(){
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		return this;
	}
	
	public HomePage addProduct3(){
		driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
		return this;
	}
	
	public HomePage addProduct4(){
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		return this;
	}
	
	public HomePage addProduct5(){
		driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
		return this;
	}
	
	public HomePage addProduct6(){
		driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
		return this;
	}
	
	public HomePage clickCart(){
		driver.findElement(By.id("shopping_cart_container")).click();
		return this;
	}	

}
