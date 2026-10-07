package org.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.reuse.BaseClass;

public class HomeOtrium extends BaseClass{
	
	public HomeOtrium() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[@class='css-4q75oe e16qa5781'])[4]")
	private WebElement Loginbtn;

	public WebElement getLoginbtn() {
		return Loginbtn;
	}

	
	
	

}
