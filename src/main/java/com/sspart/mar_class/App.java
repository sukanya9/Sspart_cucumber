package com.sspart.mar_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class App 
{
	static WebDriver driver = null;
	
	@Given("^I am in background step$")
	public void i_am_in_background_step() throws Throwable {
	  		if(driver==null) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\Downloads\\chromedriver_win32\\chromedriver.exe");
    		driver = new ChromeDriver();
		}
	}
	
	@Given("^I am in given step$")
	public void i_am_in_given_step() throws Throwable {
		System.out.println("I am in given step");
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
	}

	@Then("^I am in then step$")
	public void i_am_in_then_step() throws Throwable {
		System.out.println("I am in Then step");
	}
	
	@When("^I am in when Step$")
	public void i_am_in_when_Step() throws Throwable {
	    System.out.println("I am in when step");
	}
	
	@But("^I am in but step$")
	public void i_am_in_but_step() throws Throwable {
	    System.out.println("I am in but step");
	}
}
