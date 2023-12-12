package tests;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import support.NameGenerator;
import support.Screenshot;
import support.WebDriverManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.AuthenticationPage;
import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;


public class Checkout {
	private WebDriver driver;
	
	@Given("^user is in home page to checkout$")
	public void user_is_in_home_page_to_checkout() throws Throwable {
		driver = WebDriverManager.openBrowser();
		new AuthenticationPage(driver).typeUsername();
		new AuthenticationPage(driver).typePassword();
		new AuthenticationPage(driver).clickButton();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html" );
	}

	@Given("^user adds an item to the cart to checkout$")
	public void user_adds_an_item_to_the_cart_to_checkout() throws Throwable {
		new HomePage(driver).addProduct();
	}

	@Given("^user navigate to cart to checkout$")
	public void user_navigate_to_cart_to_checkout() throws Throwable {
		new HomePage(driver).clickCart();
	}

	@Given("^user navigates to checkout page$")
	public void user_navigates_to_checkout_page() throws Throwable {
		new CartPage(driver).clickCheckout();
	}

	@Given("^user complete the informations$")
	public void user_complete_the_informations() throws Throwable {
		new CheckoutPage(driver).typeFirstName();
		new CheckoutPage(driver).typeLastName();
		new CheckoutPage(driver).typePostalCode();
	}

	@Given("^user clicks on continue$")
	public void user_clicks_on_continue() throws Throwable {
		new CheckoutPage(driver).clickContinue();
	}

	@Given("^user clicks in finish$")
	public void user_clicks_in_finish() throws Throwable {
		new CheckoutPage(driver).clickFinish();
	}

	@Then("^order should be completed$")
	public void order_should_be_completed() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/checkout-complete.html");
		Screenshot.take(driver, "src/main/resources/prints/" +NameGenerator.GerarNome()+".png");
		driver.quit();
	}
	
	
}
