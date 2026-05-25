package com.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleTests {

	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver", "src//test//resources//chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.google.com/");
	 driver.quit();
	}
}
