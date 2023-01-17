package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features",glue = "com.stepdefinition", dryRun = true
,monochrome = true,tags = {"@tag"},
 snippets = SnippetType.CAMELCASE )
public class TestRunner {
	

}
 

