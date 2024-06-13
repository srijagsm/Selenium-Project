package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	public static void main(String[] args) throws InterruptedException {

		// Windows Handling
		// Challenge 5 :URL : https://www.flipkart.com/
		// Note :Search mask and click any mask. Enter delivery pincode.

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kalai\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.name("q"));
		e.sendKeys("mask");
		
		WebElement e1 = driver.findElement(By.xpath("//button[@type='submit']"));
		e1.click();
		
		WebElement e2 = driver.findElement(By.xpath("(//img[@loading='eager'])[1]"));
		e2.click();
		
		Thread.sleep(3000);
		WebElement e3 = driver.findElement(By.xpath("//input[@class='_36yFo0']"));
		e3.sendKeys("637212");
		
	}
}
