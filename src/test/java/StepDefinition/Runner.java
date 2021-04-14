package StepDefinition;





import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.*;

 

@RunWith(Cucumber.class)

@CucumberOptions(

 features = "C:\\Users\\Apple\\eclipse-workspace\\CucumberPrgms\\src\\test\\resources\\Features\\CucumTestng1.feature",
 glue={"runner"},
		 plugin= {"json:target/Json_Output/cucumber.json"},

// "json:target/Json_Output/cucumber.json"},
 tags = "not Skip"

 )

public class Runner {

}