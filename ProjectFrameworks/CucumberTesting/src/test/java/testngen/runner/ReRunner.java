package testngen.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/rerun.txt",
				 glue={"testngen.pageom.stepdefinition","testngen.hooks"},
                 monochrome=true,
                 dryRun=true,
                 plugin={"html:Reports/reports.html","json:Reports/reports.json",
                		 "junit:Reports/reports.xml","rerun:target/rerun.txt"})
public class ReRunner {

}
