package testngen.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/home/kumaresan/git/Full-Stack-QA-Automation-Testing/ProjectFrameworks/CucumberTesting/src/test/resources/Features/FacebookDefinition.feature",
				 glue={"testngen.pageom.stepdefinition","testngen.hooks"},
                 monochrome=true,
                 dryRun=true,
                 plugin={"html:Reports/reports.html","json:Reports/reports.json",
                		 "junit:Reports/reports.xml"})
public class Runner {

}
