package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		  features="Features"  ,             //location where our feature files are 
		  glue="stepDefinations"   ,   //location where is the code 
		  dryRun=false,            //dry To check steps are properly mapped with the code
		  plugin= {"pretty","html:target/cucumberRepots.html","json:target/jsonReport.json"},
		  monochrome=true
		  
		 
		)
public class Testss {

}
