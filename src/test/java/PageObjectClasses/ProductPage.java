package PageObjectClasses;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ProductPage {
	

	    private WebDriver driver;

	    // Add locators and methods as needed
	    
	    public ProductPage(WebDriver driver2) {
			// TODO Auto-generated constructor stub
		}

		// Example method to get the highest priced product
	    public void selectHighestPricedItem() {
	    	 Select dropdown = new Select(driver.findElement(By.cssSelector(".product_sort_container")));
			  dropdown.selectByVisibleText("Price (high to low)");
			  
			  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			  
			 
			 driver.findElement(By.xpath("//div[@class='inventory_item_name'][1]")).click();
	    }
	}


