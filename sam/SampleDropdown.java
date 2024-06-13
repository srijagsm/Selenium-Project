package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleDropdown {
	public static void main(String[] args) throws InterruptedException {

		// Frames
		//Challenge 2 : URL : https://netbanking.canarabank.in/entry/ENULogin.jsp
		//Note : Click sign in without enter the user id and print text appear and handle pop-up.

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kalai\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.canarabank.com/net-banking");

		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement e = driver.findElement(By.xpath("(//a[@target='_blank'])[12]"));
		js.executeScript("arguments[0].click()", e);
		
		Thread.sleep(2000);
		WebElement c = driver.findElement(By.xpath("(//div[@data-bind='click:$component.closePopup'])[2]"));
		c.click();
		
		Thread.sleep(2000);
		WebElement e1 = driver.findElement(By.id("login_username|input"));
		js.executeScript("arguments[0].setAttribute('value','srija7')", e1);
		Thread.sleep(2000);
		WebElement e2 = driver.findElement(By.name("password"));
		js.executeScript("arguments[0].setAttribute('value','251990')", e2);
	}

}
