package PageObjectClasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CheckoutPage {
	  private WebDriver driver;
	    
	    private By checkoutButton = By.id("checkout");

	    public CheckoutPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void clickCheckoutButton() {
	        driver.findElement(checkoutButton).click();
	    }
	    
	    public void checkoutDetails() {
	    driver.findElement(By.id("first-name")).sendKeys("pranav");
		  driver.findElement(By.id("last-name")).sendKeys("khurud");
		  driver.findElement(By.id("postal-code")).sendKeys("411052");
		  driver.findElement(By.id("continue")).click();
		  System.out.println(driver.findElement(By.cssSelector(".summary_info_label summary_total_label")).getText());
	}
}


