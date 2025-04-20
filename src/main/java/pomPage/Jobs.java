package pomPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jobs {

	@FindBy(css= "span.jobs-home-job-search-history__title--truncated-text")
	private WebElement jobautomation;

	// automation search field

	@FindBy(xpath = "//input[@aria-label='Search by title, skill, or company']")
	private WebElement searchinput;

	// clicking on fist matching element

	@FindBy(xpath= "//span[text()='automation test engineer']")
	private WebElement firstelement;



	// place search field
	@FindBy(xpath = "//input[@aria-label='City, state, or zip code']")
	private WebElement location;

	//search button
	@FindBy(xpath = "//button[text()='Search']")
	private WebElement searchbttn;

	public Jobs(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement autoMationJobs() {
		jobautomation.click();
		return jobautomation;
	}

	public void autoMationsearchfield(String key) {
		searchinput.sendKeys(key);
	}



	public WebElement firstbutton() {
	    return firstelement;  // Return the WebElement without clicking
	}


	public void locationsearchfieldclear() {
		location.clear();
	}

	public void locationsearchfield(String key) {
		location.sendKeys(key);
	}

	public void locationsearchfieldclick() {
		location.click();
	}

	public void searchButton() {
		searchbttn.click();
	}
}
