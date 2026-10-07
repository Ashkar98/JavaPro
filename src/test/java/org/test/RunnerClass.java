package org.test;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JvmReportingClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\acer\\youtube-workspace\\OtriumCucumber\\src\\test\\resources\\Feature\\Myaccount.feature",
           glue = "org.stepdefinition",monochrome=true,dryRun=false,strict=true,
                   tags="@login",plugin={"pretty",
                   "html:C:\\Users\\acer\\youtube-workspace\\OtriumCucumber\\Reports\\html",
                   "json:C:\\Users\\acer\\youtube-workspace\\OtriumCucumber\\Reports\\json\\Otrium.json",
                   "junit:C:\\Users\\acer\\youtube-workspace\\OtriumCucumber\\Reports\\junit\\Otrium.xml"})


public class RunnerClass extends JvmReportingClass { 
	
	@AfterClass
	public static void executeJVM() {
		jvmReport("C:\\Users\\acer\\youtube-workspace\\OtriumCucumber\\Reports\\json\\Otrium.json");
		
		

	
}

}
