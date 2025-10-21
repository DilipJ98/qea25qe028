package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class CommonClass {
	
	WebDriver driver;
	
//	@Parameters({"browsername"})
	@BeforeClass
	public void beforeSuiteMethod(String browserName) {
//		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
//		} else {
//			driver = new FirefoxDriver();
//		}	
	}
	
//	@AfterClass
//	public void tearDown() {
//		driver.quit();
//	}
}
