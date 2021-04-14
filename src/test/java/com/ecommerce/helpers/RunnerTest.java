package com.ecommerce.helpers;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
	        retryCount = 0,
	        detailedReport = true,
	        detailedAggregatedReport = true,
	        overviewReport = true,
	        coverageReport = true,
	        jsonUsageReport = "target/cucumber-usage.json",
	        //usageReport = true,
	        toPDF = true,
	        outputFolder = "target/cucumber/extend")

@CucumberOptions(plugin = {"pretty", "html:target/cucumber/html","json:target/cucumber.json"},
tags = {"@searchtwo"},
       features = "classpath:com/features/trip",
       glue = "com.steps.flight")

public class RunnerTest {
	
	public static void main(String[] args) {

		DateFormat dateFormat = new SimpleDateFormat(Constants.DATE_FORMAT);
        System.out.println("SERVICE SUPPORT VERSI : 9.0.32");
        System.out.println("SERVICE UPDATING TO...: 9.0.62");
        System.out.println("-----SERVICE START UP TIME : " + dateFormat.format(new Date()));

        String sStartupCheck = "";

        if (!sStartupCheck.isEmpty()) {
            System.out.println("---->"+sStartupCheck);
            System.exit(0);
        } else {
            JUnitCore.main("com.ecommerce.helpers.RunnerTest");
            WebDriverInitializer wdi = new WebDriverInitializer();
            wdi.getDriver().close();
            wdi.getDriver().quit();
            System.out.println("-----SERVICE END TIME :-----------" + dateFormat.format(new Date()));
        }

	}

}
