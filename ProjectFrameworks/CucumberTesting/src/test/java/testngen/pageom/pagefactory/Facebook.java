package testngen.pageom.pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testngen.pageom.basepackage.BaseClass;

public class Facebook {

	public Facebook()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	@FindBy(id="APjFq")
	public static WebElement googleSearch;
	@FindBy(xpath="(//*[@class='gNO89b'])[2]")
	public static WebElement searchButton;
	@FindBy(className = "I6TXqe")
	public static WebElement metaDiv;
	

}
