package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage {
	
	@FindBy(xpath="//h2[contains(@class,'t-black--light link-without-visited-state text-body-small-bold')]")
	private WebElement workshere;
	
	public CompanyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void firstLink() {
		workshere.click();
	}
}
