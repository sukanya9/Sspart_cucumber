package com.sspart.mar_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
//import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonTestCases {
	static WebDriver driver = null;
	@Given("^Opened Browser$")
	public void opened_browser() throws Throwable {
	  		if(driver==null) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\welcome\\Downloads\\chromedriver_win32\\chromedriver.exe");
    		driver = new ChromeDriver();
		}
	}
	

	@Given("^I am in Amazon Home Page$")
	public void i_am_in_Amazon_Home_Page() throws Throwable {
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
	}
	
	@Then("^I am in Search Field$")
	public void i_am_in_Search_Field() throws Throwable {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("Search performed");
		Thread.sleep(3000);
	}
	
	@When("^iphones displayed$")
	public void iphones_displayed() throws Throwable {
	   System.out.println("List of iphones displayed");
	}
	
	@And("^Close Browser$")
	public void close_Browser() throws Throwable {
	    System.out.println("Test case executed");
	}

	@Given("^I am in Amazon Home$")
	public void i_am_in_Amazon_Home() throws Throwable {
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
	    
	}
	
	@Then("^I am Selecting Amazon Pay$")
	public void i_am_Selecting_Amazon_Pay() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(),'Amazon Pay')]")).click();
		Thread.sleep(3000);
		}
	
	@When("^Display Amazon Pay Page$")
	public void display_Amazon_Pay_Page() throws Throwable {
		System.out.println(" selected amazon pay");
	}
	
	@And("^Executed successfully$")
	public void executed_successfully() throws Throwable {
		System.out.println("ClickAmazonPay - Test Case is executed successfully");
	}
	
	@Given("^I am in Amazon$")
	public void i_am_in_Amazon() throws Throwable {
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
	}

	@Then("^I am selecting Electronics$")
	public void i_am_selecting_Electronics() throws Throwable {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Select dropdown = new Select(driver.findElement(By.id("searchDropdownBox")));
		dropdown.selectByVisibleText("Electronics");
		System.out.println("Selcted by visible text");
		Thread.sleep(2000);
	}

	@When("^Select Dropdown text is Electronics$")
	public void select_Dropdown_text_is_Electronics() throws Throwable {
		System.out.println("Dropdown selected");
	}

	@And("^Test case executed$")
	public void test_case_executed() throws Throwable {
		System.out.println("Selected dropdown - Test Case is executed successfully");
	}
}
