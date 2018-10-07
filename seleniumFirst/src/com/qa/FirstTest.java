package com.qa;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTest {

	public static void main(String[] args) {
		System.out.println("Hello Java World");
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String x = driver.getCurrentUrl();
		System.out.println(x);
		boolean b = driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).isEnabled();
		Assert.assertTrue(b);
	

	}

}
