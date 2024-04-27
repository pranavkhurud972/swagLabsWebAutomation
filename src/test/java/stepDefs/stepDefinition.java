package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjectClasses.AboutPage;
import PageObjectClasses.CartPage;
import PageObjectClasses.CheckoutPage;
import PageObjectClasses.LoginPage;
import PageObjectClasses.ProductPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class stepDefinition {

	    private WebDriver driver;
	    private LoginPage loginPage;
	    private AboutPage aboutPage;
	    private ProductPage productPage;
	    private CartPage cartPage;
	    private CheckoutPage checkoutPage;

	    @Given("I am on the Sauce Demo login page")
	    public void i_am_on_the_sauce_demo_login_page1() {
	    	// System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		        driver = new ChromeDriver();
		        loginPage = new LoginPage(driver);
		        aboutPage = new AboutPage(driver);
		        productPage = new ProductPage(driver);
		        cartPage = new CartPage(driver);
		        checkoutPage = new CheckoutPage(driver);
		        driver.get("https://www.saucedemo.com/");
	    }
	    @When("I log in with username {string} and password {string}")
	    public void i_log_in_with_username_and_password1(String username, String password) {
	    	 loginPage.login(username, password);
	    }
	    @When("I click on the Open Menu button")
	    public void i_click_on_the_open_menu_button1() {
	    	aboutPage.openMenu();
	    }
	    @When("I select 'About'")
	    public void i_select(String string) {
	    	 aboutPage.selectAbout();
	    }
	    @Then("I should be redirected to the Sauce Labs website")
	    public void i_should_be_redirected_to_the_sauce_labs_website() {
	       
	    }
	    @When("I navigate back")
	    public void i_navigate_back() {
	    	 driver.navigate().back();
			 driver.findElement(By.id("react-burger-cross-btn")).click();
			 Assert.assertEquals("Swag Labs", driver.getTitle());
	    }
	    @Then("I should be on the saucedemo PRODUCTS page")
	    public void i_should_be_on_the_saucedemo_products_page() {
	       
	    }
	    @When("I select the highest priced item")
	    public void i_select_the_highest_priced_item() {
	    	productPage.selectHighestPricedItem();
	    }
	    @When("I click on the Cart button")
	    public void i_click_on_the_cart_button() {
	    	cartPage.clickCartButton();
	    }
	    @Then("I should be on the YOUR CART page")
	    public void i_should_be_on_the_your_cart_page() {
	       
	    }
	    @When("I proceed to checkout")
	    public void i_proceed_to_checkout() {
	    	checkoutPage.clickCheckoutButton();
	    }
	    @Then("I should be on the CHECKOUT: YOUR INFORMATION page")
	    public void i_should_be_on_the_checkout_your_information_page() {
	       
	    }
	    @When("I enter my details and click continue")
	    public void i_enter_my_details_and_click_continue() {
	    	checkoutPage.checkoutDetails();
	    }
	    @Then("I should be on the CHECKOUT: OVERVIEW & Total Price is shown in $xx.yy format")
	    public void i_should_be_on_the_checkout_overview_total_price_is_shown_in_$xx_yy_format() {
	       
	    }



	    @After
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}
