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

public  class BaseLogin { 
	
	protected static WebDriver driver;
	public static  WebDriver getLogin() throws Throwable    {
		
	
	

			
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF); 
		
		
		 driver=new ChromeDriver();
		LoginPage login=new LoginPage(driver);
		//maximize screen
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//implicit wait
		
		//driver.get(BaseConfig.getconfig("URL"));
		driver.get(BaseConfig.getconfig("URL"));
		//driver.get("http://automationpractice.com/index.php");
		System.out.println("Title of Page:"+driver.getTitle());//Home page
		
		
			HeighLight.getcolor(driver,login.getLogin());
		
		TakeAppScreenShot.captureScreenShot(driver," This is Login Page" );
		login.getLogin().click();
		System.out.println("Title of Page:"+driver.getTitle());//Login Page
		
		
		new HeighLight().getcolor(driver,login.getEmail(), "red");
		
		login.getEmail().sendKeys(BaseConfig.getconfig("email"));
		
		HeighLight.getcolor(driver, login.getPass());
		login.getPass().sendKeys(BaseConfig.getconfig("pass"));
	     
	     //WebElement loginBtn = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
	     
	
		HeighLight.getcolor(driver, login.getLoginBtn());
	    
		login.getLoginBtn().click();
			
		TakeAppScreenShot.captureScreenShot(driver, "Login Success");
	     System.out.println(driver.getTitle());// after Login done  
	     
	    // driver.quit();
	     
	     return driver;
		}

	}



