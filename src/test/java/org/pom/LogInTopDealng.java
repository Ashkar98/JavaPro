package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.reuse.BaseClass;

public class LogInTopDealng  extends BaseClass{
	
	public LogInTopDealng() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//button[@aria-hidden='true']")
	private WebElement signIn;
	
	
	public WebElement getSignIn() {
		return signIn;
	}
	
	
	

}
