package tests;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import support.WebDriverManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.AuthenticationPage;
import pages.CartPage;
import pages.HomePage;


public class ItemDetails {
	private WebDriver driver;
	
	@Given("^user is in home page to check details$")
	public void user_is_in_home_page_to_check_details() throws Throwable {
		driver = WebDriverManager.openBrowser();
		new AuthenticationPage(driver).typeUsername();
		new AuthenticationPage(driver).typePassword();
		new AuthenticationPage(driver).clickButton();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html" );
	}

	@Given("^user adds an item to cart to check details$")
	public void user_adds_an_item_to_cart_to_check_details() throws Throwable {
		new HomePage(driver).addProduct();
	}

	@Given("^user go to cart to check details$")
	public void user_go_to_cart_to_check_details() throws Throwable {
		new HomePage(driver).clickCart();
	}

	@Given("^user click to see item detail$")
	public void user_click_to_see_item_detail() throws Throwable {
		new CartPage(driver).clickDetails();
	}

	@Then("^user should see item detail page$")
	public void user_should_see_item_detail_page() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory-item.html?id=4" );
		driver.quit();
	}

	
}
