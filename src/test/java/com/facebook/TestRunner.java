package com.facebook;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\test\\resources",
				glue = "com.facebook",
				tags= {"@s2,@s3"},
				monochrome= true,
				dryRun = false,
				plugin = {"html:target","json:target/reports.json"})

public class TestRunner {

}
