package pomPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutomationJobPage {

	//button[text()='Easy Apply']

	@FindBy(xpath="//button[text()='Easy Apply']")
	private WebElement Easyapply;

	@FindBy(xpath = "//button[@id='searchFilter_timePostedRange']")
	private WebElement postshort;

	//---------------------------Easy button-----------------------------------//
   @FindBy(xpath = "//span[@class='artdeco-button__text' and text()='Easy Apply'][1]")
	private WebElement easy;
   //------------------------------First Next button-------------------------------///
   @FindBy(xpath = "(//span[@class='artdeco-button__text'][normalize-space()='Next'])[1]")
	private WebElement Next1;

   // -----------------------------------Location Header--------------------------------------//
   @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/div[2]/form/div/div/div[7]/div/div[1]/label/span[1]")
	private WebElement Locationhead;
   //---------------------------------Location input --------------------------------------//
   @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/div[2]/form/div/div/div[7]/div/div[1]/div/input")
	private WebElement Locationin;
//--------------location dd click -----------------------------
   @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/div[2]/form/div/div/div[7]/div/div/div/div[2]/div/div[1]/div/span/span")
  	private WebElement LocationAhmedbad;

   //----------------------------------------- Second next button---------------------------//
   @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/footer[1]/div[2]/button[2]/span[1]")
    private WebElement Next2;


   //---------------------------------- Third next button--------------------------------//
    @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/footer[1]/div[2]/button[2]/span[1]")
   private WebElement Next3;

    //---------------------------------- Third next button--------------------------------//
   @FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/footer[1]/div[2]/button[2]/span[1]")
   private WebElement Review;

   //---------------------------------- Submit button--------------------------------//

   ///html[1]/body[1]/div[4]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/footer[1]/div[3]/button[2]/span[1]
	@FindBy(xpath ="(//span[normalize-space()='Submit application'])[1]")
		   private WebElement Submit;

	///html[1]/body[1]/div[4]/div[1]/div[1]/button[1]/*[name()='svg'][1]/*[name()='use'][1]

	//-------------------------------------To close the popup-----------------------------------------//

	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[1]/button[1]/*[name()='svg'][1]/*[name()='use'][1]")
		   private WebElement popUpClose;

   // -------------------------------To click on first link -----------------------------------------//
	   @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[4]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]/strong[1]")
	   private WebElement Clickonfirst1;

	   @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[4]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]/strong[1]")
	   private WebElement Clickonfirst2;

	   @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[4]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]/strong[1]")
	   private WebElement Clickonfirst3;

	   @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[4]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]/strong[1]")
	   private WebElement Clickonfirst4;

	   @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[4]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[5]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]/strong[1]")
	   private WebElement Clickonfirst5;

	   @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[4]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[6]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]/strong[1]")
	   private WebElement Clickonfirst6;

	   @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[4]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[7]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]/strong[1]")
	   private WebElement Clickonfirst7;

	   @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[4]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[8]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]/strong[1]")
	   private WebElement Clickonfirst8;

	   @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[4]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[9]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]/strong[1]")
	   private WebElement Clickonfirst9;

	   @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[4]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[10]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]/strong[1]")
	   private WebElement Clickonfirst10;

	   @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[4]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[11]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]/strong[1]")
	   private WebElement Clickonfirst11;

	   @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[4]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[12]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]/strong[1]")
	   private WebElement Clickonfirst12;

	   @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[4]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[13]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]/strong[1]")
	   private WebElement Clickonfirst13;

	   @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[4]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[14]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]/strong[1]")
	   private WebElement Clickonfirst14;

	   @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[4]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[15]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]/strong[1]")
	   private WebElement Clickonfirst15;

	   @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[4]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[16]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]/strong[1]")
	   private WebElement Clickonfirst16;

	   @FindBy(xpath = "/html[1]/body[1]/div[6]/div[3]/div[4]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[17]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]/span[1]/strong[1]")
	   private WebElement Clickonfirst17;



	// -------------------------------shorting by the past 24 hours  -----------------------------------------//
	@FindBy(xpath = "//label[@for='timePostedRange-r86400']")
	private WebElement past24hrs;
	//------------------------------------Result button --------------------------------------------//
	//(//span[@class='artdeco-button__text'][normalize-space()='Show 222 results'])[1]
	//button[contains(@aria-label, 'Apply current filter to show')][1]
	//button[contains(@aria-label, 'Apply current filter to show')])[2]
	//button[starts-with(@aria-label, 'Apply current filter')]
	//button[starts-with(@aria-label, 'Apply current filter') and @type='button']
	//By.xpath("//button[contains(@class,'artdeco-button') and contains(.,'Show') and contains(.,'results')]")
	//html[1]/body[1]/div[6]/div[3]/div[4]/section[1]/div[1]/section[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[2]/button[2]/span[1]
	@FindBy(xpath="//button[contains(@class,'artdeco-button') and contains(.,'Show') and contains(.,'results')]")
			private WebElement resultbtn;
	//------------------------------------Next1 button first field webelement --------------------------------------------//

	@FindBy(xpath="/html/body/div[4]/div/div/div[2]/div/div[2]/form/div/div/div[1]/div/div/div[1]/div/label")
	private WebElement  textheader1;
	//html/body/div[4]/div/div/div[2]/div/div[2]/form/div/div/div[1]/div/div/label/span[1]
	// First text input field
	@FindBy(xpath="(//input[@id='single-line-text-form-component-formElement-urn-li-jobs-applyformcommon-easyApplyFormElement-4116361016-13917033860-numeric'])[1]")
	private WebElement  input1;

	@FindBy(xpath="(//input[starts-with(@id, 'single-line-text-form-component')])[1]")
	private WebElement  input1fornextbutton3;

	// Second text field
	@FindBy(xpath="/html/body/div[4]/div/div/div[2]/div/div[2]/form/div/div/div[2]/div/div/div[1]/div/label")
	private WebElement  textheader2;

	// Second text input field
			@FindBy(xpath="(//input[@id='single-line-text-form-component-formElement-urn-li-jobs-applyformcommon-easyApplyFormElement-4116361016-13917033908-numeric'])[1]")
			private WebElement  input2;

           @FindBy(xpath="(//input[starts-with(@id, 'single-line-text-form-component')])[2]")
			private WebElement  input2fornextbutton3;
	// Third text field
	@FindBy(xpath="/html/body/div[4]/div/div/div[2]/div/div[2]/form/div/div/div[3]/div/div/div[1]/div/label")
	private WebElement  textheader3;

	// ------------------Third text input field-----------------------
			@FindBy(xpath="(//input[@id='single-line-text-form-component-formElement-urn-li-jobs-applyformcommon-easyApplyFormElement-4116361016-13917033900-numeric'])[1]")
			private WebElement  input3;

			@FindBy(xpath="(//input[starts-with(@id, 'single-line-text-form-component')])[3]")
			private WebElement  input3fornextbutton3;
	// -------------------Forth textfield--------------

	@FindBy(xpath="/html/body/div[4]/div/div/div[2]/div/div[2]/form/div/div/div[5]/div/div/div[1]/div/label")
	private WebElement  textheader4;


	// Forth text input field
			@FindBy(xpath="(//input[starts-with(@id, 'single-line-text-form-component')])[4]")
			private WebElement  input4fornextbutton3;
			  // --------------------------------Fifth text field-------------------------------------------------

         	@FindBy(xpath="/html/body/div[4]/div/div/div[2]/div/div[2]/form/div/div/div[6]/div/div/div[1]/div/label")
         	private WebElement  textheader5;


                    @FindBy(xpath="/html/body/div[4]/div/div/div[2]/div/div[2]/form/div/div/div[6]/div/div/div[1]/div/input")
         			private WebElement  input5fornextbutton3;
//--------------------------------- if contains 1st text field  dropdown-----------------------------------------

			@FindBy(xpath="/html/body/div[4]/div/div/div[2]/div/div[2]/form/div/div/div[1]/div/div/label/span[1]")
			private WebElement  textheader1fornextbutton3DD1;
			// input DD
            @FindBy(xpath="(//select[starts-with(@id, 'text-entity-list-form-component')])[1]")
					private WebElement  input1fornextbutton3DD1;



         // -----------------------if contains 2nd dropdown-------------------------------------

         			@FindBy(xpath="/html/body/div[4]/div/div/div[2]/div/div[2]/form/div/div/div[8]/div/div/label/span[1]")
         			private WebElement textheader2fornextbutton3DD2;


					// input DD
                     @FindBy(xpath="(//select[starts-with(@id, 'text-entity-list-form-component')])[2]")
         					private WebElement  inputfornextbutton3DD2;
                  // -----------------------if contains 3rd dropdown -------------------------------------

                     @FindBy(xpath="/html/body/div[4]/div/div/div[2]/div/div[2]/form/div/div/div[3]/div/div/label/span[1]")
         			private WebElement  textheader3fornextbutton3DD3;
         			// input DD
                     @FindBy(xpath="(//select[starts-with(@id, 'text-entity-list-form-component')])[3]")
         					private WebElement  input3fornextbutton3DD3;
 // -----------------------if contains 4th number dropdown -------------------------------------

                     @FindBy(xpath="/html/body/div[4]/div/div/div[2]/div/div[2]/form/div/div/div[4]/div/div/label/span[1]")
         			private WebElement  textheader4fornextbutton3DD1;
         			// input DD
                     @FindBy(xpath="(//select[starts-with(@id, 'text-entity-list-form-component')])[4]")
         					private WebElement  input4fornextbutton3DD1;
// -----------------------if contains 5th number dropdown -------------------------------------

                     @FindBy(xpath="/html/body/div[4]/div/div/div[2]/div/div[2]/form/div/div/div[5]/div/div/label")
         			private WebElement  textheader5fornextbutton3DD5;
         			// input DD
                     @FindBy(xpath="(//select[starts-with(@id, 'text-entity-list-form-component')])[5]")
         					private WebElement  input5fornextbutton3DD5;


  //--------------------------------------- rest all drop downs -------------------------------------------------

                     @FindBy(xpath="(//select[starts-with(@id, 'text-entity-list-form-component')])[6]")
  					private WebElement  input6fornextbutton3DD6;

                     @FindBy(xpath="(//select[starts-with(@id, 'text-entity-list-form-component')])[7]")
  					private WebElement  input7fornextbutton3DD7;

                     @FindBy(xpath="(//select[starts-with(@id, 'text-entity-list-form-component')])[8]")
   					private WebElement  input8fornextbutton3DD8;
                     @FindBy(xpath="(//select[starts-with(@id, 'text-entity-list-form-component')])[9]")
   					private WebElement  input9fornextbutton3DD9;



	public AutomationJobPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void postshortButton() {
		postshort.click();
	}
// By getters we can open the date and post sort Drop down

	public WebElement postshortButton1() {
		return postshort;
	}

	public void clickEasyApplyIfEnabled() {
	    WebElement easyButton = Easyapply; // Locate the button
	    if (easyButton.isEnabled()) {
	        System.out.println("Easy Apply button is enabled. Clicking it...");
	        easyButton.click(); // Perform the click
	    } else {
	        System.out.println("Easy Apply button is not enabled. Skipping the action.");
	    }
	}
//--------------------DD inputs---------------------
	public WebElement getInput1fornextbutton3DD1() {
		return input1fornextbutton3DD1;
	}

	public WebElement getInput4fornextbutton3DD4() {
		return input4fornextbutton3DD1;
	}
	public WebElement getInput3fornextbutton3DD3() {
		return input3fornextbutton3DD3;
	}
	public WebElement getInput5fornextbutton3DD5() {
		return input5fornextbutton3DD5;
	}
	public WebElement getInput6fornextbutton3DD6() {
		return input6fornextbutton3DD6;
	}
	public WebElement getInput5fornextbutton3DD7() {
		return input7fornextbutton3DD7;
	}
	public WebElement getInput5fornextbutton3DD8() {
		return input8fornextbutton3DD8;
	}
	// --------DD header --------------------------------------
	public WebElement get4header3DD4() {
		return textheader4fornextbutton3DD1;
	}

	public WebElement get1header3DD1() {
		return textheader1fornextbutton3DD1;
	}
	public WebElement get3header3DD3() {
		return textheader3fornextbutton3DD3;
	}

	public WebElement get5header3DD5() {
		return textheader5fornextbutton3DD5;
	}
	public void resultButton() {
		resultbtn.click();
	}
	public void past24hrstButton() {
		past24hrs.click();
	}
	public WebElement getPostshortButton1() {
	    return postshort;
	}

	public WebElement getPast24hrs() {
	    return past24hrs;
	}

	public WebElement getResultButton() {
	    return resultbtn;
	}

	public By easyJobButton() {
		easy.click();
		return By.id("//span[@class='artdeco-button__text' and text()='Easy Apply'][1]");
	}


	public void Next1Button() {
		Next1.click();
	}
	//------Location declaration -----------------//

	public WebElement getlocationheader() {
		return Locationhead;
	}
	public WebElement LocationInput() {
		Locationin.click();
		return Locationin;
	}
	public WebElement Ahmedabadlink() {
		LocationAhmedbad.click();
		return LocationAhmedbad;
	}


	public void Next2Button() {
		Next2.click();
	}


	public WebElement FirstInputField() {

		return input1fornextbutton3;

	}

	public WebElement getTextheader1() {
		return textheader1;
	}

	public WebElement getTextheader2() {
		return textheader2;
	}

	public WebElement getTextheader3() {
		return textheader3;
	}
	public WebElement SecondInputField() {

		return input2fornextbutton3;
	}

	public WebElement ThirdInputField() {

		return input3fornextbutton3;
	}


	public WebElement getTextheader4() {
		return textheader4;
	}
	public WebElement getTextheader5() {
		return textheader5;
	}
	public WebElement ForthInpitField() {

		return input4fornextbutton3;
	}
	public WebElement FifthInpitField() {

		return input5fornextbutton3;
	}


	public void Next3Button() {
		Next3.click();
	}
	public void ReviewButton() {
		Review.click();
	}

	public void SubmitButton() {
		Submit.click();
	}
	public void popUpCloseButton() {
		popUpClose.click();
	}
//------------------------------------Click on links for applying job --------------------------------------------
	public void ClickonfirstLink1() {
		Clickonfirst1.click();
	}

public void ClickonfirstLink2() {
    Clickonfirst2.click();
}

public void afterClickonfirstLink2() {
    // Code for after the click action
}

public void ClickonfirstLink3() {
    Clickonfirst3.click();
}

public void afterClickonfirstLink3() {
    // Code for after the click action
}

public void ClickonfirstLink4() {
    Clickonfirst4.click();
}

public void afterClickonfirstLink4() {
    // Code for after the click action
}

public void ClickonfirstLink5() {
    Clickonfirst5.click();
}

public void afterClickonfirstLink5() {
    // Code for after the click action
}

public void ClickonfirstLink6() {
    Clickonfirst6.click();
}

public void afterClickonfirstLink6() {
    // Code for after the click action
}

public void ClickonfirstLink7() {
    Clickonfirst7.click();
}

public void afterClickonfirstLink7() {
    // Code for after the click action
}

public void ClickonfirstLink8() {
    Clickonfirst8.click();
}

public void afterClickonfirstLink8() {
    // Code for after the click action
}

public void ClickonfirstLink9() {
    Clickonfirst9.click();
}

public void afterClickonfirstLink9() {
    // Code for after the click action
}

public void ClickonfirstLink10() {
    Clickonfirst10.click();
}

public void afterClickonfirstLink10() {
    // Code for after the click action
}

public void ClickonfirstLink11() {
    Clickonfirst11.click();
}

public void afterClickonfirstLink11() {
    // Code for after the click action
}

public void ClickonfirstLink12() {
    Clickonfirst12.click();
}

public void afterClickonfirstLink12() {
    // Code for after the click action
}

public void ClickonfirstLink13() {
    Clickonfirst13.click();
}

public void afterClickonfirstLink13() {
    // Code for after the click action
}

public void ClickonfirstLink14() {
    Clickonfirst14.click();
}

public void afterClickonfirstLink14() {
    // Code for after the click action
}

public void ClickonfirstLink15() {
    Clickonfirst15.click();
}

public void afterClickonfirstLink15() {
    // Code for after the click action
}

public void ClickonfirstLink16() {
    Clickonfirst16.click();
}

public void afterClickonfirstLink16() {
    // Code for after the click action
}

public void ClickonfirstLink17() {
    Clickonfirst17.click();
    
    
}


@FindBy(xpath = "//ul/li//strong")
private List<WebElement> jobLinks;

// Click job link by index (0-based)
public void clickJobLinkByIndex(int index) {
    jobLinks.get(index).click();
}

// Return total number of links
public int getTotalJobLinks() {
    return jobLinks.size();
}
                }




