package org.sam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserAutomation {
	public static void main(String[] args) throws InterruptedException {

		//Challenge 1 :URL : http://demo.guru99.com/test/drag_drop.html
		//Note :
		//Drag and drop bank in Account, 5000 in amount at debt side.
		//Drag and drop sales in Account, 5000 in amount at credited side.
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kalai\\eclipse-workspace\\SeleniumProject\\driver\\chromedriver.exe");
		// 2.Launch the browser
		WebDriver driver = new ChromeDriver();
		// 3.Launch 
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		// 4.Maximize window size
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		WebElement bankSource = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement debitSide = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(bankSource, debitSide).perform();
		
		Thread.sleep(2000);
		WebElement salesSource = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		
		WebElement creditSide = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		a.dragAndDrop(salesSource, creditSide).perform();
		
		Thread.sleep(2000);
		WebElement bankAmt = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		
		WebElement bankAcc = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		a.dragAndDrop(bankAmt, bankAcc).perform();
		
		Thread.sleep(2000);
		WebElement salesAmt = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement salesAcc = driver.findElement(By.xpath("//li[@class='placeholder']"));
		a.dragAndDrop(salesAmt, salesAcc).perform();
	
	}

}
