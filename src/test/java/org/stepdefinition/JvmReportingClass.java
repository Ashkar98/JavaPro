package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReportingClass {
	
	public static void jvmReport(String jsonPath) {
		File f = new File("C:\\Users\\acer\\youtube-workspace\\OtriumCucumber\\Reports\\jvmreport");
		
		Configuration c = new  Configuration(f, "otrium");
		c.addClassifications("Platform", "windows");
		c.addClassifications("Launguage", "Java");
		c.addClassifications("Sprint", "Agile");
		
		List<String> li = new ArrayList<String>();
		li.add(jsonPath);
		
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();
		
		
		
		

	}

}
