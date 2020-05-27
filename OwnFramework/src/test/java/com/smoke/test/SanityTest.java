package com.smoke.test;

import org.openqa.selenium.WebDriver;

import com.Generic.code.AddCard;
import com.Generic.code.BaseLogin;
import com.Generic.code.GetProduct;
import com.Generic.code.Payment;

public class SanityTest {
     static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		//before Test
		driver=BaseLogin.getLogin();
		
		GetProduct obj=new GetProduct();
		obj.getDress(driver);
		//new GetProduct().getDress(driver);
		
		AddCard obj2= new AddCard();
		obj2.card(driver);
		//new AddCard().card(driver);
		
		Payment obj3=new Payment();
		obj3.getPayment(driver);
		//new Payment().getPayment(driver);
		 
		//after Test
		
		driver.quit();

	}

}
