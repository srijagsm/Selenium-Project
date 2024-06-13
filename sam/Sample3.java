package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {
	public static void main(String[] args) throws InterruptedException {

		// Challenge 5 : URL : https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI
		// Note : Enter the userId password and Click login button
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kalai\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");

		driver.manage().window().maximize();
		
		
		WebElement d = driver.findElement(By.id("DUMMY1"));
		d.click();
		
		WebElement userId = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		userId.sendKeys("2465484");
		
		WebElement pass = driver.findElement(By.xpath("(//input[@type='password'])[4]"));
		pass.sendKeys("5454456");
		
		WebElement logIn = driver.findElement(By.xpath("(//input[@type='Submit'])[1]"));
		logIn.click();
		
		}
}
