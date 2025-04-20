package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {
	@FindBy(xpath="//span[contains(@title,'My Network')]")
	private WebElement Mynetwork;
	@FindBy(xpath="//span[contains(@title,'Jobs')]")
	private WebElement jobs;
	//input[contains(@class,'basic-input search-global-typeahead__input search-global-typeahead__input--nile-background')]
	@FindBy(xpath="//input[contains(@class,'basic-input search-global-typeahead__input search-global-typeahead__input--nile-background')]")
	private WebElement Search;
	//span[contains(@class,'search-global-typeahead-hit__text t-16 t-black')][1]
	@FindBy(xpath="//span[contains(@class,'search-global-typeahead-hit__text t-16 t-black')][1]")
	private WebElement First;
	// initialization

	public homePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		//Declaration

		public void Myntwrk() {
			Mynetwork.click();
		}

		//span[normalize-space(text())='MyNetwork']
		public void job() {
			jobs.click();
		}
		public void searchBttn(String key) {
			Search.sendKeys(key);
		}
		public void firstLink() {
			First.click();
		}

}
