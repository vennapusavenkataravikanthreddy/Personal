package com.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleTests {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "src//test//resources//chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.google.com/");
	 
	 String title =driver.getTitle();
	 if(title.equals("Google"))
		System.out.println("page loaded");
	else
		System.out.println("Page not loaded");
	 Thread.sleep(10000);
	 driver.findElement(By.partialLinkText("ma")).click();
	// driver.findElement(By.linkText("Gmail")).click();
	 
	 String url = driver.getCurrentUrl();
	 System.out.println(url);
	 if(url.contains("gmail"))
		 System.out.println("URL changed - pass");
	 else
		 System.out.println("Nothing happened -fail");
	 driver.findElement(By.name("q")).sendKeys("hp laptop");
	 
	 Thread.sleep(3000);
	 
	 driver.findElement(By.name("btnK")).click();
	 driver.close();
	}
}
