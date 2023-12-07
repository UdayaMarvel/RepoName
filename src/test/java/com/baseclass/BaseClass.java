package com.baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public void browserLaunch(String url){
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	public void browserClose(){
		driver.close();
	}
	
	public void sendText(WebElement e, String value){
		e.sendKeys(value);
	}
	
	public void button(WebElement ele){
		ele.click();
	}
	
	
}
