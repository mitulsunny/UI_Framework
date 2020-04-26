package com.osa.runner;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
 features = "src/test/java"
 ,glue={"com.osa.steps"}
 )
public class Somke extends AbstractTestNGCucumberTests{


}
