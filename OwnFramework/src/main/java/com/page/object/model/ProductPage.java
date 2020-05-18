package com.page.object.model;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	public ProductPage(WebDriver driver){
		
		PageFactory.initElements(driver,this);// remove null value.special for Selenium
		
	} 
	
		
		
	@FindBy(xpath="(//*[@title='Dresses'])[2]")	
	private WebElement Dresses;
	
	
	@FindBy(xpath="//*[@class='left-block']")
	private List<WebElement> DressesCount;
    
	
	
	@FindBy(xpath="//*[@class='right-block']//*[@class='product-name']")//5
	private List<WebElement> DressesName;
	
	
	@FindBy(xpath="//*[@class='right-block']//*[@itemprop='price']")//5
	private List<WebElement> DressesPrice;

	
	@FindBy(xpath="//*[@class='icon-plus']")	
	private WebElement AddquantityBtn;
	
	
	@FindBy(xpath="//*[@name='group_1']")	
	private WebElement SizedropDownBtn;
	
	
	@FindBy(xpath="//*[@id='add_to_cart']")	
	private WebElement addCardBtn;
	
	
	@FindBy(xpath="//*[@class='btn btn-default button button-medium']")	
	private WebElement porocedBtn;
	
	public WebElement getporocedBtn() {
		return porocedBtn;
	}

	
	public WebElement getaddCardBtn () {
		return addCardBtn;
	}
	
	

	public WebElement getSizedropDownBtn() {
		return SizedropDownBtn;
	}
	
	
	
	public WebElement getquantityBtn() {
		return AddquantityBtn;
	}
	
	
	

	public List<WebElement> getDressesPrice() {
		return DressesPrice;
	} 
	
	public List<WebElement> getDressesName() {
		return DressesName;
	} 
	
	public List<WebElement> getDressesCount() {
		return DressesCount;
	} 
	
	public WebElement getDresses() {
		return Dresses;
	} 
	
		
	}


