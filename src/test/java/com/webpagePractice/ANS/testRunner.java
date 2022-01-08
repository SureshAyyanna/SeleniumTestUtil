package com.webpagePractice.ANS;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {},
		glue = {"stepDefenations" }, 
		monochrome = true, 
		dryRun = false,
		publish = true, 
		tags = "", 
		plugin = { "pretty",
				"json:target/MyReports/report.json", 
				"junit:target/MyReports/report.xml" })

public class testRunner {

}
