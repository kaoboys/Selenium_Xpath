package Selenium_webD_PK;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium 4.6.0\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.zara.com/in/en/search");
		
		//maximize web page
		driver.manage().window().maximize();
		
		//id locator
		//WebElement searchbox=driver.findElement(By.id("search-products-form-combo-input"));
		//driver.findElement(By.partialLinkText("MAN")).click();
		//searchbox.sendKeys("Coat");
		
		//for search button click
		//driver.findElement(By.name("submit_search")).click();
		
		
		//link text locator
		//driver.findElement(By.className("class=\"media-image__image media__wrapper--media\"")).click();
		
		driver.findElement(By.xpath("//input[@id='search-products-form-combo-input']")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("//button[]@name='submit_search']")).click();
		
		
		
	
	
		
		
		
	}

}
