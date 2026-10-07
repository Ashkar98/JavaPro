package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.reuse.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepdefinitionClass extends BaseClass{
	
	@Given("User has to Launch Browser and url")
	public void user_has_to_Launch_Browser_and_url() {
	    
	}

	@When("User clicks on the Login link")
	public void user_clicks_on_the_Login_link() throws InterruptedException {
		driver.findElement(By.xpath("//span[text()='Accept all']")).click();
	    driver.findElement(By.xpath("(//span[@class='css-4q75oe e16qa5781'])[3]")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//span[text()='Log in'])[1]")).click();
		   
	}

	@Then("User should be navigated to the Login page")
	public void user_should_be_navigated_to_the_Login_page() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//input[@placeholder='Email address']"));
		e.sendKeys("narasingam.as98@gmail.com");
		Thread.sleep(2000);
		WebElement w = driver.findElement(By.xpath("(//input[@name='password'])[1]"));
		w.sendKeys("Ashkar@as");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()='Log in']")).click();
	
		
	}
 
	@Given("User launches the Otrium website")
	public void user_launches_the_Otrium_website() {
	   
	}

	@When("User enters Dresses in the search field")
	public void user_enters_Dresses_in_the_search_field() {
		WebElement s = driver.findElement(By.xpath("//input[contains(@class,'css-kib610')]"));
		s.sendKeys("t-shirt");
	   
	}

	@When("User clicks on the search button")
	public void user_clicks_on_the_search_button() {
	    
	}

	@Then("Search results related to Dresses should be displayed")
	public void search_results_related_to_Dresses_should_be_displayed() {
	   
	}



	
	
	
	
}
