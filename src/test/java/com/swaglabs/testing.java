package com.swaglabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class testing {

	
	public static void main(String[] args) {
		String username = "standard_user";
		String password = "secret_sauce";

		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.saucedemo.com/");
		
		
		 driver.findElement(By.id("user-name")).sendKeys(username);
		 driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("login-button")).click();
		 
		 driver.findElement(By.xpath("//div[@class='bm-burger-button']")).click();
		 driver.findElement(By.id("about_sidebar_link")).click();
		 Assert.assertEquals("Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing", driver.getTitle());
		 
		 driver.navigate().back();
		 driver.findElement(By.id("react-burger-cross-btn")).click();
		 Assert.assertEquals("Swag Labs", driver.getTitle());
		 

		
		 Select dropdown = new Select(driver.findElement(By.cssSelector(".product_sort_container")));
		  dropdown.selectByVisibleText("Price (high to low)");
		  
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		  
		 
		 driver.findElement(By.xpath("//div[@class='inventory_item_name'][1]")).click();
		  driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
		  driver.findElement(By.cssSelector(".shopping_cart_link")).click();
		  driver.findElement(By.id("checkout")).click();
		  
		  driver.findElement(By.id("first-name")).sendKeys("pranav");
		  driver.findElement(By.id("last-name")).sendKeys("khurud");
		  driver.findElement(By.id("postal-code")).sendKeys("411052");
		  driver.findElement(By.id("continue")).click();
		  System.out.println(driver.findElement(By.cssSelector(".summary_info_label summary_total_label")).getText());
	}

}
