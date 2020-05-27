package com.Generic.code;

import org.openqa.selenium.WebDriver;

import com.page.object.model.ProductPage;
import com.util.HeighLight;

public  class GetProduct {
	//WebDriver driver;
	public  WebDriver getDress(WebDriver driver) throws Throwable{
		
		   
		 ProductPage pf=new ProductPage(driver);
		 HeighLight.getcolor(driver, pf.getDresses());
		 pf.getDresses().click();
		 
		int TotalNumber= pf.getDressesCount().size();
		System.out.println("Total Dress Count:"+TotalNumber);
		
		
		//Get All Dress Name
		for(int i=0;i<pf.getDressesName().size();i++) {
			
			
			System.out.println("Find Dress Name=  "+ pf.getDressesName().get(i).getText());
		}
		
        //		list.foreach(e->e){});
		
		
       	//	pf.getDressesName().forEach(Name->{
		//	System.out.println("Dress Name=  "+ Name.getText());
		//});
		
		//Get All Dress Price
		/*for(int i=0;i<pf.getDressesPrice().size();i++) {
			
			
			System.out.println("Find The Dress Price=  "+ pf.getDressesPrice().get(i).getText());
		}*/
			pf.getDressesPrice().forEach(Price->{
				
				System.out.println("Find The Dress Price=  "+ Price.getText());
				
			});
		
			//	Check the 5TH dress
			 HeighLight.getcolor(driver,pf.getDressesName().get(4));
        	pf.getDressesName().get(4).click();
        
		
		
		
		
		
		return driver;
	}

}
