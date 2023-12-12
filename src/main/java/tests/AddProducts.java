package tests;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.WebDriverManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.AuthenticationPage;
import pages.HomePage;


public class AddProducts {
	private WebDriver driver;
	

	@Given("^user login successfully to add products$")
	public void user_login_successfully_to_add_products() throws Throwable {
		driver = WebDriverManager.openBrowser();
		new AuthenticationPage(driver).typeUsername();
		new AuthenticationPage(driver).typePassword();
		new AuthenticationPage(driver).clickButton();
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html" );
	}

	@Given("^user adds all item to cart$")
	public void user_adds_all_item_to_cart() throws Throwable {
		new HomePage(driver).addProduct();
		new HomePage(driver).addProduct2();
		new HomePage(driver).addProduct3();
		new HomePage(driver).addProduct4();
		new HomePage(driver).addProduct5();
		new HomePage(driver).addProduct6();
		
	}

	@Given("^user go to cart to check added itens$")
	public void user_go_to_cart_to_check_added_itens() throws Throwable {
		new HomePage(driver).clickCart();
	  }

	@Then("^user should see all added itens$")
	public void user_should_see_all_added_itens() throws Throwable {
		int count = driver.findElements(By.className("cart_item")).size();
		Assert.assertEquals(count, 6);
		driver.quit();	
	}

	
}
