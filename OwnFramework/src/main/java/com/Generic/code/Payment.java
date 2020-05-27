package com.Generic.code;

import org.openqa.selenium.WebDriver;

import com.page.object.model.ProductPage;
import com.util.HeighLight;

public class Payment {
	
	//WebDriver driver;
	public WebDriver getPayment(WebDriver driver){
		ProductPage pf=new ProductPage(driver);
		
		pf.getporocedBtn().click();
		
		pf.getsummeryProcessBtn().click();
		
	     pf.getprocessAddressBtn().click();
	    
	     pf.getcheckInBtn().click();
	    
	     pf.getshippingBtn().click();
	    
	     pf.getpaymentBtn().click();
	    
	     pf.getconfirmOrderBtn().click(); 
	     
	     HeighLight.getcolor(driver,pf.getprintConfirmPage());
	     System.out.println(pf.getprintConfirmPage().getText());
	
	
	 

		
		
		
		
		
		return driver;
	}

}
