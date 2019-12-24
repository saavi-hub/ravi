package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\pdc3b-training.pdc3b\\eclipse-saavi\\CasestudyCucumber\\Myfeatures\\TestMe.feature" , glue="cstudy1",
tags= {"@Sanity"})
public class Runners {

}
