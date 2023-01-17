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


	public void login(String username, String password) throws InterruptedException, IOException {
		

		insertText(getTxtusername(), username);
		insertText(getTxtPassword(), password);
		clickButton(getSignInButton());
		
		
		
	}

}
