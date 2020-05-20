package com.Generic.code;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.page.object.model.ProductPage;

public class DressSelectionPage extends BaseLogin {
	public static void main(String[] args) throws Throwable {
		//BaseLogin.getLogin();
		 getLogin();//by using inheritance connection with login page
		
	
		 ProductPage pf=new ProductPage(driver);
		
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
        	pf.getDressesName().get(4).click();
        	
        	
        	//Actions act = new Actions(driver);
        	//act.moveToElement(pf.getquantityinputbox()).click().perform();
        	
          pf.getquantityBtn().click();
          
         // pf.getSizedropDownBtn().click();
          
         Select select=new Select(pf.getSizedropDownBtn());
         // System.out.println(select.getOptions());
          select.selectByIndex(2);
		
			
			pf.getaddCardBtn().click();
			
			pf.getporocedBtn().click();
			
			pf.getsummeryProcessBtn().click();
			
		     pf.getprocessAddressBtn().click();
		    
		     pf.getcheckInBtn().click();
		    
		     pf.getshippingBtn().click();
		    
		     pf.getpaymentBtn().click();
		    
		     pf.getconfirmOrderBtn().click();
		
		
		
	
		     
	
	
	
	
	} 

}
