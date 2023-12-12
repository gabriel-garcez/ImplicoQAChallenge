package tests;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.WebDriverManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.AuthenticationPage;
import pages.CartPage;
import pages.HomePage;


public class UpdateQuantity {
	private WebDriver driver;
	

@Given("^user is in home page to update items$")
public void user_is_in_home_page_to_update_items() throws Throwable {
	driver = WebDriverManager.openBrowser();
	new AuthenticationPage(driver).typeUsername();
	new AuthenticationPage(driver).typePassword();
	new AuthenticationPage(driver).clickButton();
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html" );
}

@Given("^user adds an item to cart to update items$")
public void user_adds_an_item_to_cart_to_update_items() throws Throwable {
	new HomePage(driver).addProduct();
}

@Given("^user navigates to cart to update items$")
public void user_navigates_to_cart_to_update_items() throws Throwable {
	new HomePage(driver).clickCart();
}

@Given("^user change the item quantity$")
public void user_change_the_item_quantity() throws Throwable {
	new CartPage(driver).updateQuantity();
 }

@Then("^user should see the quantity and price updated$")
public void user_should_see_the_quantity_and_price_updated() throws Throwable {
	String quantity = driver.findElement(By.className("cart_quantity")).getText();
	Assert.assertEquals(quantity, "2");
	
	String price = driver.findElement(By.className("inventory_item_price")).getText();
	Assert.assertEquals(price, "$59.95");
	
	driver.quit();
	
}
	
}
