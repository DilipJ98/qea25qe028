package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.externalfiles.ReadDataXl;

public class LoginTest  {
	
	ThreadLocal<WebDriver> drivers = new ThreadLocal<>();
		
	public WebDriver driver() {
		return drivers.get();
	}
	
	@BeforeMethod
	public void method() {
		drivers.set(new FirefoxDriver());
	}

	@DataProvider(name = "credentials", parallel = true)
	public Object[][] dataProducer() throws IOException {
		ReadDataXl xl = new ReadDataXl();
		return xl.readData();
	}


	@AfterMethod
	public void quitM() {
		driver().close();
	}
	
	@Test(dataProvider = "credentials")
	public void loginTest(String username, String password, String expectedRes) throws InterruptedException, IOException {
		
		FileInputStream input = new FileInputStream("test-resources/config.properties");
		Properties props = new Properties();
		props.load(input);
		
		driver().get("https://training-support.net/webelements/login-form");
		driver().findElement(By.id("username")).sendKeys(username);
		driver().findElement(By.id("password")).sendKeys(password);
		driver().findElement(By.xpath("//button[text() = 'Submit']")).click();
		Thread.sleep(2000);
		String actualText;
		
		if (username.equals(props.getProperty("username")) && password.equals(props.getProperty("password"))) {
			actualText = driver().findElement(By.tagName("h2")).getText();
		} else {
			actualText = driver().findElement(By.id("subheading")).getText();
		}
		Assert.assertEquals(actualText, expectedRes);
	}
}
