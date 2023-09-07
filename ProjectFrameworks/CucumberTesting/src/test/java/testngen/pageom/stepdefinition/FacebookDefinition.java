package testngen.pageom.stepdefinition;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testngen.pageom.basepackage.BaseClass;
import testngen.pageom.pagefactory.Facebook;

public class FacebookDefinition {

	@Given("Launch the {string} url")
	public void launchUrl(String url) {
		BaseClass.chromeDriverLaunch();
		BaseClass.launchUrl(url);
	}

	@When("Search the {string} in the search bar")
	public void searchBar(String facebook) {
	    Facebook fb = new Facebook();
		BaseClass.pageWaitBasedOnDomLoad(5000);
		BaseClass.typeWrite(fb.googleSearch, facebook);
		BaseClass.clickElement(fb.searchButton);
	}

	@When("click search button, Validate Meta Data Section will be displayed.")
	public void validateIfMetaDisplayed() {
		  Facebook fb = new Facebook();
		BaseClass.pageWaitBasedOnDomLoad(5000);
		Assert.assertTrue(fb.metaDiv.isDisplayed());
	}

	@Then("Close the browser.")
	public void quit() {
		BaseClass.closeEntireDriver();
	}

}
