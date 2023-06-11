package selenium.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTests {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/home/kumaresan/eclipse-workspace/SeleniumTesting/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement link = driver.findElement(By.id("APjFqb"));
        Thread.sleep(3000);
        link.sendKeys("dev kumaresan on github");
        Thread.sleep(3000);
        link.submit();
        WebElement link2 = driver.findElement(By.className("LC20lb"));
        Thread.sleep(3000);
        link2.click();
       
        
    }
}