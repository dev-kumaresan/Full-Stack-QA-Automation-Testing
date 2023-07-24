package maven.test.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchUrl {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.github.com/dev-kumaresan");
		
	}

}
