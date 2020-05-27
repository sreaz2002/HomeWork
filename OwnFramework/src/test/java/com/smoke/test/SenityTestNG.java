package com.smoke.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Generic.code.AddCard;
import com.Generic.code.BaseLogin;
import com.Generic.code.GetProduct;
import com.Generic.code.Payment;

public class SenityTestNG {  
	   
	  WebDriver driver;
	
	 @BeforeTest 
	  public void setup() throws Throwable {
       
	 driver=BaseLogin.getLogin();

}
	 @Test
	void sanity1() throws Throwable{
		 
		 GetProduct obj=new GetProduct();
			obj.getDress(driver);
			//new GetProduct().getDress(driver);	
	}
	 @Test
	 void sanity2(){
		 AddCard obj2= new AddCard();
			obj2.card(driver);
			//new AddCard().card(driver); 
	 }
	 
	 @Test
	 void sanity3(){
		 Payment obj3=new Payment();
			obj3.getPayment(driver);
			//new Payment().getPayment(driver); 
	 }
	
	 @AfterTest
	void tearDown(){
		
		driver.quit();
		
		
	}
}