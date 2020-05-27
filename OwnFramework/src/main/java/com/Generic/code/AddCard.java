package com.Generic.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.page.object.model.ProductPage;
import com.util.HeighLight;

public class AddCard {
	
public  	WebDriver card(WebDriver driver){
		
	ProductPage pf=new ProductPage(driver);
	//Actions act = new Actions(driver);
	//act.moveToElement(pf.getquantityinputbox()).click().perform();
	HeighLight.getcolor(driver,pf.getquantityBtn());
  pf.getquantityBtn().click();
  
 // pf.getSizedropDownBtn().click();
  
 Select select=new Select(pf.getSizedropDownBtn());
 // System.out.println(select.getOptions());

 select.selectByIndex(2); 

 HeighLight.getcolor(driver,pf.getaddCardBtn());
	pf.getaddCardBtn().click();
	

	
	
		return driver;
	}

}
