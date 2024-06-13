package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicprogram {
	public static void main(String[] args) {

		// Challenge 12 - URL : https://www.google.com/
		// Note : Search “Inmakes learning hub” and click first link
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kalai\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");

		// 2.Launch the browser
		WebDriver driver = new ChromeDriver();

		// 3.Launch the Url
		driver.get("https://www.google.com/");

		// 4.Maximize window size
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		element.sendKeys("Inmakes learning hub");
		
		WebElement element2 = driver.findElement(By.xpath("(//li[@data-view-type='1'])[1]"));
		element2.click();
	}
}
