package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
	
	
	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public CartPage clickCheckout(){
		driver.findElement(By.id("checkout")).click();
		return this;
	}
	
	public CartPage clickRemoveItem(){
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		return this;
	}	
	
	public CartPage clickDetails(){
		driver.findElement(By.className("inventory_item_name")).click();
		return this;
	}	
	
	public CartPage updateQuantity(){
		driver.findElement(By.className("cart_quantity")).sendKeys("2");
		return this;
	}
	
}
