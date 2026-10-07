package org.stepdefinition;

import org.reuse.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{
	@Before
	public void precond()  {
		browserLaunch();
		launchurl("https://www.otrium.com/women");
		maxbrowser();
		

	}
	
	@After(order=1)
	public void postCond() {
		driver.close();

	}
	@After(order=2)
	public void postCond2() {
		driver.close();
		
		if (s.isFailed()) {
			
		}

	
	
	

	
	

}
