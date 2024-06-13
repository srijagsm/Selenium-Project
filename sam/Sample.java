package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sample {
	
	public static void main(String[] args) throws InterruptedException {

		// Challenge 3 :URL : https://www.homedepot.com/
		// Note :Search ceiling fan. Click 1st fan and click the remote control included

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kalai\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.homedepot.com/");

		driver.manage().window().maximize();

		WebElement searchBox = driver.findElement(By.xpath("//input[@type='search']"));
		searchBox.sendKeys("ceiling fan");

		Thread.sleep(3000);
		WebElement searchButton = driver.findElement(By.xpath("//button[@aria-label='Search Field Icon']"));
		searchButton.click();

		Thread.sleep(3000);
		WebElement fan = driver.findElement(By.xpath("//a[text()='Shop All Ceiling Fans']"));
		fan.click();

		Thread.sleep(4000);
		WebElement ceilingFan = driver.findElement(By.xpath("(//div[@data-testid='product-header'])[1]"));
		ceilingFan.click();
		

	}

}
