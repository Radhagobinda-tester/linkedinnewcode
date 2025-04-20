package testScripts;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import genericLib.BaseClass1;
import pomPage.CompanyPage;
import pomPage.Login_Page;
import pomPage.MessagePage;
import pomPage.homePage;
@Test
public class ReferenceRequestScript extends BaseClass1 {

	public void ReferenceRequestScript() throws IOException, InterruptedException {
		
		 Login_Page p2 = new Login_Page(driver);
		 Thread.sleep(5000);
	        p2.Emailtextf(pdata.getPropertyfiledata("Email1"));
	        Thread.sleep(5000);
	        p2.passwordtextf(pdata.getPropertyfiledata("Password1"));
	        Thread.sleep(5000);
	        p2.loginButtn();
	        Thread.sleep(5000);
	        homePage H5 = new homePage(driver);
	        Thread.sleep(5000);
	        H5.searchBttn(pdata.getPropertyfiledata("Searchfield"));
	        Thread.sleep(5000);
	        H5.firstLink();
	        Thread.sleep(5000);
	        CompanyPage r = new CompanyPage(driver);
	        Thread.sleep(5000);
	        r.firstLink();
	        /*
	        MessagePage m = new MessagePage(driver);
	        Thread.sleep(5000);
	        
	        m.messagebutton();
	        Thread.sleep(5000);
	        
	        m.messageField(pdata.getPropertyfiledata("bodymessage"));
	        Thread.sleep(5000);
	        m.sendbutton();
	        Thread.sleep(5000); 
	        
	        */
	        
	        
	        MessagePage messagePage = new MessagePage(driver);

	        // Wait until the message buttons are loaded
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        List<WebElement> messageButtons = messagePage.getMessageButtons();

	        // Loop through each message button and send the message
	        for (WebElement button : messageButtons) {
	            try {
	                wait.until(ExpectedConditions.elementToBeClickable(button)).click();
	                Thread.sleep(5000);
	                driverutilies.smoothscrollBar(driver, button);
	                Thread.sleep(1000); 

	                // Enter the message
	                String referenceMsg = pdata.getPropertyfiledata("bodymessage");
	                messagePage.messageField(referenceMsg);
	                Thread.sleep(5000);

	                // Click the send button
	                messagePage.sendbutton();
	                Thread.sleep(5000);
	                messagePage.cancelbutton();
	                Thread.sleep(5000);

	            } catch (Exception e) {
	                System.out.println("Failed for one contact, moving to next: " + e.getMessage());
	            }
	        }
	        
	        
	}

	
	
}
