package com.facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.baseclass.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp {
	BaseClass ba = new BaseClass();
	
	@Given("User create a new account")
	public void user_create_a_new_account() {
	  ba.browserLaunch("https://www.facebook.com");
	  WebElement account = ba.driver.findElement(By.xpath("//a[text()='Create new account']"));
	  ba.button(account);
	   
	}

	@When("user enters firstname")
	public void user_enters_firstname() {
		WebElement firstname = ba.driver.findElement(By.xpath("//input[@name='firstname']"));
		ba.button(firstname);
		ba.sendText(firstname, "anbu");
	}

	@When("User enters lastname")
	public void user_enters_lastname() {
		WebElement lastname = ba.driver.findElement(By.xpath("//input[@name='lastname']"));
		ba.button(lastname);
		ba.sendText(lastname, "marvel");
	}

	@When("User enters emailId")
	public void user_enters_email_id() {
	  
	}

}


