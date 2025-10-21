//package com.test;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
//import org.testng.SkipException;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;
//
//public class GoogleTest {
//
//	
//	@Test
//	public void googleTest() {
//		driver.get("https://www.google.com/");
//		SoftAssert soft = new SoftAssert();
//		soft.assertEquals(driver.getTitle(), "Google");
//		soft.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
//		WebElement searchEle = driver.findElement(By.id("APjFqb"));
//		soft.assertTrue(searchEle.isDisplayed());
//		soft.assertAll();		
//	}	
//}
