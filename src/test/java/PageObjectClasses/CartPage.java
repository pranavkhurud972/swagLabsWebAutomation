package PageObjectClasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CartPage {

	    private WebDriver driver;
	    
	    private By cartButton = By.id("shopping_cart_container");

	    public CartPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void clickCartButton() {
	        driver.findElement(cartButton).click();
	    }
	    
	   
	}

