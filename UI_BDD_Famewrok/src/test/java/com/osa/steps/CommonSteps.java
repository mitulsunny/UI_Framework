package com.osa.steps;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.osa.common.Browser;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CommonSteps extends Browser {
	WebDriver dr;
	@Given("^I open the browser$")
	public void i_open_the_browser() throws Throwable {
		System.out.println("Testing");
		 dr=Browser.openBrowser();
		dr.get("https://www.osaconsultingtech.com");
	  // List<List<String>> dt=data.raw();
	  // dr.get(dt.get(0).get(1));
		System.out.println("Testing");
	}
	@When("^I have matches the value$")
	public void i_have_matches_the_value() throws Throwable {
	dr.close();
	}

}
