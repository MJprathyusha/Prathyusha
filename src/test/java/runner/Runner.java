package runner;





import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.*;

 

@RunWith(Cucumber.class)

@CucumberOptions(

 features = "C:\\Users\\Apple\\eclipse-workspace\\CucumberPrgms\\src\\test\\resources\\Features\\New.feature"

 ,glue={"runner"},
 plugin= {"html:target/cucumber-reports/output.html",

 "json:target/Json_Output/cucumber.json"}

 )

public class Runner {

}
