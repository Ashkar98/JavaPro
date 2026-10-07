package org.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.reuse.BaseClass;

public class HomePage extends BaseClass {
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath=("//button[text()='Sign In / Register']"))
	private WebElement signIn;
	
	public WebElement getSignIn() {
		return signIn;
	}
	
//	@FindBy(xpath=("/html/body/div[2]/div/form/div[1]/div/input"))
//	private WebElement userName;
//	
//	public WebElement getUser() {
//		return userName;
//	}
	@FindBy(xpath=("//span[text()='Search']"))
	private WebElement srch;

	public WebElement getSrch() {
		return srch;
	}
	@CacheLookup
	@FindBy(xpath=("//input[@placeholder='Type keywords']"))
	private WebElement prdt;

	public WebElement getPrdt() {
		return prdt;
	}
	
	
	
	
	
	

}
