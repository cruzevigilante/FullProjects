package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\adact.features"},glue= {"org.stepdef"},monochrome=true,
plugin= {"pretty","html:C:\\Users\\subas\\eclipse-workspace\\SampleJavaProject\\CucumAdactinOne\\target","json:C:\\Users\\subas\\eclipse-workspace\\SampleJavaProject\\CucumAdactinOne\\target"})
public class TestRunner {
	
	

}
//"json:C:\\\\Users\\\\subas\\\\eclipse-workspace\\\\SampleJavaProject\\\\CucumAdactinOne\\\\target"