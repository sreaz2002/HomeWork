package com.Generic.code;



import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.config.BaseConfig;
import com.page.object.model.LoginPage;
import com.util.HeighLight;
import com.util.TakeAppScreenShot;



public class AutomationPractice {

	public static void login() throws Throwable {
		//http://automationpractice.com/index.php
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	
	
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		
		WebDriver driver=new ChromeDriver();
		//maximize screen
		
		LoginPage login=new LoginPage(driver); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//driver.get("http://automationpractice.com/index.php");
		 driver.get(BaseConfig.getconfig("URL"));
		 TakeAppScreenShot.captureScreenShot(driver, "Home Page");
		System.out.println("Title of Page:"+driver.getTitle());//Home page
		
		HeighLight.getcolor(driver,login.getLogin());
		login.getLogin().click();
		
		TakeAppScreenShot.captureScreenShot(driver, "Login Page");
		System.out.println("Title of Page:"+driver.getTitle());//Login Page
		
		
		//WebElement email= driver.findElement(By.xpath("//*[@id='email']"));
		login.getEmail().sendKeys(BaseConfig.getconfig("email"));
		new HeighLight().getcolor(driver, login.getEmail(), "green");
		
		
		//WebElement pass= driver.findElement(By.xpath("//*[@id='passwd']")); 
		login.getPass().sendKeys(BaseConfig.getconfig("pass"));
		HeighLight.getcolor(driver, login.getPass());
		
		
		//WebElement loginBtn = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));	
		HeighLight.getcolor(driver, login.getLoginBtn());
		login.getLoginBtn().click();
		TakeAppScreenShot.captureScreenShot(driver, " Login Sussess");
			System.out.println(driver.getTitle());// after Login done 
	
	}

}
