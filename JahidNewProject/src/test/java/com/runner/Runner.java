package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources",
		glue= {"com.stepDef"},
		tags= {"@smokeTest"},
		plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/reports.html"},
		
		
		monochrome= true,
		strict= true
		
		)
public class Runner {

}
