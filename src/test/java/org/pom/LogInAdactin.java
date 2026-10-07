package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.reuse.BaseClass;

public class LogInAdactin extends BaseClass {
	
	public LogInAdactin() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	private WebElement user;
	
	@FindBy(id="password")
    private WebElement pass;
	
	@FindBy (id="login")
	private WebElement BtnIn;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getBtnIn() {
		return BtnIn;
	}
	
	
	
	

}
