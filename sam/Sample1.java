package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	public static void main(String[] args) {

		// Frames
		// Challenge 1 - URL : https://netbanking.hdfcbank.com/netbanking/
		// Note - Print all the options in year using getAttirubute() method.

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kalai\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		// 2.Launch the browser
		WebDriver driver = new ChromeDriver();
		// 3.Launch the Url
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		// 4.Maximize window size
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.xpath("//input[@type='text']"));
		e.sendKeys("257814");
		
	}
}
