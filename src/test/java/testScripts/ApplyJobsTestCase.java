package testScripts;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import genericLib.BaseClass1;
import pomPage.AutomationJobPage;
import pomPage.Jobs;
import pomPage.Login_Page;
import pomPage.homePage;


@Test(invocationCount =1)
public class ApplyJobsTestCase extends BaseClass1 {


	 public void  ApplyJobsTestCase() throws IOException, InterruptedException, Throwable, Throwable{
		 
		 WebDriverWait wait = new WebDriverWait(driver, 20);
	 Login_Page p2 = new Login_Page(driver);
	 Thread.sleep(5000);
        p2.Emailtextf(pdata.getPropertyfiledata("Email1"));
        Thread.sleep(5000);
        p2.passwordtextf(pdata.getPropertyfiledata("Password1"));
        Thread.sleep(5000);
        p2.loginButtn();
        Thread.sleep(5000);
        homePage H5 = new homePage(driver);
        // click the jobs option on the header
        H5.job();
        Thread.sleep(5000);
        Jobs j2 = new Jobs(driver);
       // j2.autoMationJobs();
        j2.autoMationsearchfield(pdata.getPropertyfiledata("searchjobtitle"));
        WebDriverWait wait1 = new WebDriverWait(driver, 20);  // Selenium 3 syntax
        WebElement button = wait1.until(ExpectedConditions.visibilityOf(j2.firstbutton()));
        Thread.sleep(5000);

        button.click();  // Now click safely after waiting


        System.out.println(" successfully!");

        Thread.sleep(10000);
        // Tapping on automation link

    //j2.autoMationJobs();
    //Thread.sleep(5000);




AutomationJobPage a = new AutomationJobPage(driver);
 Thread.sleep(20000);
        // Open the "Date posted" filter
        wait.until(ExpectedConditions.elementToBeClickable(a.getPostshortButton1()));
        a.postshortButton();
        Thread.sleep(10000);

        // Re-locate the "Past 24 hours" radio button to avoid stale reference
        WebElement past24hrsButton = a.getPast24hrs();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", past24hrsButton);  // Scroll the "Past 24 hours" radio button into view
        past24hrsButton.click(); // Click the radio button
        
/*
        // Get the count of job listings
        int jobCount = driver.findElements(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[4]/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[2]/button[2]/span[1]")).size();
        System.out.println("Total job listings found: " + jobCount);

        WebDriverWait wait23 = new WebDriverWait(driver, 20); // No Duration in Selenium 3

        WebElement jobListing = wait23.until(ExpectedConditions.visibilityOf(a.getResultButton())); // Fix: Correct ExpectedCondition

        // Scroll to the element
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", jobListing);
        Thread.sleep(2000);

        // Click using JS Executor
        try {
            jobListing.click();
        } catch (Exception e) {
            System.out.println("Normal click failed, trying JavaScript click.");
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", jobListing);
        }

      */
        Thread.sleep(10000);

        a.resultButton();



        Thread.sleep(15000);
       // a.resultButton();

        Thread.sleep(10000);
        // Iterate through the jobs and perform actions
       


        int totalLinks = a.getTotalJobLinks();

        System.out.println("Total job links found: " + totalLinks);

        for (int i = 0; i < totalLinks; i++) {
            try {
                a.clickJobLinkByIndex(i);  // Click on job link (e.g., job 1)
                Thread.sleep(5000); 
            
                    
                    // Continue with the form
                    a.easyJobButton();
                    
               
        
        	System.out.print("Easy button is clickable");

        		a.Next1Button();
        		System.out.print("Next button is clickable");


        try {
            a.Next2Button();
        } catch (Exception e) {
            System.out.println("An error occurred in Next2Button: " + e.getMessage());
        }

        // ============================Handling all drop downs==============================================
        try {
            // Define dropdown elements
            List<WebElement> dropdownElements = Arrays.asList(
                a.getInput1fornextbutton3DD1(),
                a.getInput3fornextbutton3DD3(),
                a.getInput4fornextbutton3DD4(),
                a.getInput5fornextbutton3DD5(),
                a.getInput6fornextbutton3DD6(),
                a.getInput5fornextbutton3DD7(),
                a.getInput5fornextbutton3DD8()
            );

            boolean isAnyDropdownHandled = false;

            // Iterate over dropdown elements
            for (WebElement dropdownElement : dropdownElements) {
                try {
                    // Check if the dropdown element is present, displayed, and enabled
                    if (dropdownElement != null && dropdownElement.isDisplayed() && dropdownElement.isEnabled()) {
                        Select select = new Select(dropdownElement);
                        select.selectByVisibleText("Yes");
                        System.out.println("Selected 'Yes' for dropdown: " + dropdownElement);
                        isAnyDropdownHandled = true;
                    } else {
                        System.out.println("Dropdown is not present or not interactable. Moving to the next.");
                    }
                } catch (NoSuchElementException nse) {
                    System.out.println("The option 'Yes' is not available in the dropdown. Skipping to the next.");
                } catch (Exception e) {
                    System.out.println("An error occurred while handling the dropdown: " + e.getMessage());
                    e.printStackTrace(); // Optional for detailed debugging
                }
            }

            if (!isAnyDropdownHandled) {
                System.out.println("No dropdowns were handled. Either no dropdowns were present, or none were interactable.");
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred in Next2Button: " + e.getMessage());
            e.printStackTrace(); // Optional for detailed debugging
        }

        //------------------------Next3 button header one code  ---------------------------
        try {
            // Define headers and input fields dynamically
            List<Supplier<String>> headerSuppliers = Arrays.asList(
                () -> a.getTextheader1().getText(),
                () -> a.getTextheader2().getText(),
                () -> a.getTextheader3().getText(),
                () -> a.getTextheader4().getText(),
                () -> a.getTextheader5().getText()
            );

            List<Supplier<WebElement>> inputFieldSuppliers = Arrays.asList(
                a::FirstInputField,
                a::SecondInputField,
                a::ThirdInputField,
                a::ForthInpitField,
                a::FifthInpitField
            );

            // Iterate over headers and fields
            for (int i1 = 0; i1 < headerSuppliers.size(); i1++) {
                try {
                    String headerText = headerSuppliers.get(i1).get();
                    WebElement inputField = inputFieldSuppliers.get(i1).get();

                    if (inputField == null) {
                        System.out.println("Input field " + (i1 + 1) + " is not present. Skipping...");
                        continue;
                    }

                    // Clear the input field before entering new value
                    inputField.clear();

                    if (headerText.contains("How many years")) {
                        inputField.sendKeys("2");
                    } else if (headerText.contains("what is")) {
                        inputField.sendKeys("7"); // Adjust values based on the example
                    } else if (headerText.contains("How much")) {
                        inputField.sendKeys("4");
                    } else if (headerText.contains("notice period")) {
                        inputField.sendKeys("14");
                    } else {
                        System.out.println("No matching header text found for header " + (i1 + 1));
                    }
                } catch (NullPointerException npe) {
                    System.out.println("Header or input field " + (i1 + 1) + " is missing. Skipping...");
                } catch (Exception e) {
                    System.out.println("An error occurred while processing header " + (i1 + 1) + ": " + e.getMessage());
                }
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace(); // Optional for debugging
        }

        try {
            a.ReviewButton();
        } catch (Exception e) {
            System.out.println("An error occurred in ReviewButton: " + e.getMessage());
        }
        Thread.sleep(10000);
        try {
            a.ReviewButton();
        } catch (Exception e) {
            System.out.println("An error occurred in ReviewButton: " + e.getMessage());
        }
        Thread.sleep(10000);

        try {
            a.SubmitButton();
        } catch (Exception e) {
            System.out.println("An error occurred in SubmitButton: " + e.getMessage());
        }
        try {
            a.SubmitButton();
        } catch (Exception e) {
            System.out.println("An error occurred in SubmitButton: " + e.getMessage());
        }
        Thread.sleep(10000);

        a.popUpCloseButton();
        Thread.sleep(10000);
        
                
      
            } catch (Exception e) {
                System.out.println("Issue on job link " + (i + 1) + ": " + e.getMessage());
                continue;
            }
  

        }
        
	 }
}
	 
















