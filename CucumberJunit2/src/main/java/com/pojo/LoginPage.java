package com.pojo;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;


public class LoginPage extends BaseClass {
	
	public LoginPage() {
    PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	private WebElement txtusername;
	
	@FindBy(id = "password")
	private WebElement txtpassword;
	
	@FindBy(id = "button_signInButton")
	private WebElement signInButton;
	
	
	
		

	public WebElement getTxtusername() {
		return txtusername;
	}


	public WebElement getTxtPassword() {
		return txtpassword;
	}

	
	public WebElement getSignInButton() {
		return signInButton;
	}


//	public WebElement getCompanyButton() {
//		return companyButton;
//	}


	//public WebElement getTranceButton() {
//		return tranceButton;
	//}
	
/*	public WebElement getCanadianCa() {
		return canadianCa;
	}

	public WebElement getRule() {
		return rule;
	}

	public WebElement getNoRule() {
		return noRule;
	}

	public WebElement getSave() {
		return save;
	}*/


	//public WebElement getCreateButton() {
	//	return createButton;
	//}


	public void login(String username, String password) throws InterruptedException, IOException {
		

		insertText(getTxtusername(), username);
		insertText(getTxtPassword(), password);
		clickButton(getSignInButton());
		
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click()", getCompanyButton());
	//	clickButton(tranceButton);
	//	Thread.sleep(5000);*/
	//	clickButton(createButton);
		/*clickButton(getCanadianCa());
		Thread.sleep(4000);
		clickButton(getRule());
		Thread.sleep(4000);
		clickButton(getNoRule());
		Thread.sleep(4000);
		clickButton(getSave());
		Thread.sleep(4000);
		navigate("https://qa.eu.notabene.dev/dashboard/outgoing");*/
		
		
	}

}
