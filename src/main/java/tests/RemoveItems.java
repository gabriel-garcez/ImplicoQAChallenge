package tests;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.WebDriverManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AuthenticationPage;
import pages.CartPage;
import pages.HomePage;


public class RemoveItems {
	private WebDriver driver;
	
	@Given("^user is on home page to remove itens$")
	public void user_is_on_home_page_to_remove_itens() throws Throwable {
		driver = WebDriverManager.openBrowser();
		new AuthenticationPage(driver).typeUsername();
		new AuthenticationPage(driver).typePassword();
		new AuthenticationPage(driver).clickButton();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html" );
	}

	@Given("^user adds an item to cart to check removal$")
	public void user_adds_an_item_to_cart_to_check_removal() throws Throwable {
		new HomePage(driver).addProduct();
	}

	@Given("^user go to cart to removal$")
	public void user_go_to_cart_to_removal() throws Throwable {
		new HomePage(driver).clickCart();
	}

	@When("^user click on remove itens$")
	public void user_click_on_remove_itens() throws Throwable {
		new CartPage(driver).clickRemoveItem();
	}

	@Then("^item should be removed from cart$")
	public void item_should_be_removed_from_cart() throws Throwable {
		int count = driver.findElements(By.className("cart_item")).size();
		Assert.assertEquals(count, 0);
		driver.quit();
	}

	
}
