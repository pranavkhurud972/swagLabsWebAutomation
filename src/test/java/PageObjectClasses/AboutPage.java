package PageObjectClasses;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class AboutPage {
	
	


	    private WebDriver driver;

	    private By openMenuButton = By.id("react-burger-menu-btn");
	    private By aboutLink = By.id("about_sidebar_link");

	    public AboutPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void openMenu() {
	        driver.findElement(openMenuButton).click();
	    }

	    public void selectAbout() {
	        driver.findElement(aboutLink).click();
	    }
	    
	   
	}

