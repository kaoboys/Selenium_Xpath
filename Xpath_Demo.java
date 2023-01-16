package Selenium_RN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://utkarshaaacademy.com/");
		
		driver.manage().window().maximize();
		
		//Relative path
		//Syntax
		//tagname[@attribute='attribute value']
		
		driver.findElement(By.xpath("//nav//a[@title='Automation Practice']")).click();
		
		driver.findElement(By.xpath("//input[@id='name-firstname']")).sendKeys("Software");
		
		driver.findElement(By.xpath("//input[@id='name-lastname']")).sendKeys("Tester");
		
		driver.findElement(By.xpath("//input[@name='field-phone[value]']")).sendKeys("9876543210");
		
		driver.findElement(By.xpath("//input[@class='coblocks-field coblocks-field--email']")).sendKeys("testerIT@Automation.com");
		
		driver.findElement(By.xpath("//input[@id='date']")).sendKeys("25-07-2022");
		
		driver.findElement(By.xpath("//input[@id='time-morning']")).click();
		
		driver.findElement(By.xpath("//textarea[@id='special-notes']")).sendKeys("Xpath");
		
		driver.findElement(By.xpath("//button[@class='wp-block-button__link']")).click();
		
		driver.close();
		
		
		
		
		
		
		
		

	}

}
