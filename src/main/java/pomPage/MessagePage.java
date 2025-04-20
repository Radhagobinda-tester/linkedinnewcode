package pomPage;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagePage {
	/*
	@FindBy(xpath="(//button[contains(@aria-label, 'Message')])[1]")
	private WebElement message;
	*/
	@FindBy(xpath = "//button[starts-with(@aria-label, 'Message ')]")
    private List<WebElement> messageButtons;
	
    @FindBy(xpath="//div[@aria-label='Write a message…']//p")
	private WebElement messagefied;
 
    @FindBy(xpath="//button[text()='Send']")
    private WebElement send;
  
    
    @FindBy(xpath=" //*[name()='use' and contains(@href,'#close-sma')]")
    private WebElement cancel;
    
	public MessagePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		

	}/*
	public void messagebutton() {
		message.click();
	}
	*/
	
	public List<WebElement> getMessageButtons() {
        return messageButtons;
    }
   public void messageField(String key) {
	   messagefied.sendKeys(key);
   }
   public void sendbutton() {
		send.click();
	}
   
   public void cancelbutton() {
		cancel.click();
	}
}
