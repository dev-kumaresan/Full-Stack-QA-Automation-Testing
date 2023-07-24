package base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestBase {

	public static void main(String[] args) throws IOException, InterruptedException {
		SeleniumPackages.setSystemEnvironment("chrome", "drivers/chromedriver");
		SeleniumPackages.chromeDriverLaunch();
		SeleniumPackages.launchUrl("https://www.facebook.com/");
		WebElement email = SeleniumPackages.locator(By.id("email"));
		

		

	}

}
