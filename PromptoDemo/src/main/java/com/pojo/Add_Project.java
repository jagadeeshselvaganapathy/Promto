package com.pojo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;



public class Add_Project extends BaseClass {

	public Add_Project() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[@id='button_toolbarCreateButton']")
	private WebElement addProjectButton;
	
	@FindBy(xpath = "(//button[@id='button_null'])[2]")
	private WebElement cancelButton;
	
	
	@FindBy(xpath = "//span[normalize-space()='Settings']")
	private WebElement settingButton;
	
	@FindBy(xpath = "//p[normalize-space()='Team']")
	private WebElement teamButton;
	
	@FindBy(xpath = "//span[@class='Button_button__label__1h86U Button_spanStyle__2u_Xo']")
	private WebElement addMemberButton;
	
	@FindBy(xpath = "//span[normalize-space()='invite']")
	private WebElement inviteButton;
	
	@FindBy(xpath = "//span[normalize-space()='cancel']")
	private WebElement cancelMemberButton;
		
	
	
	public WebElement getAddProjectButton() {
		return addProjectButton;
	}
	
	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	public WebElement getSettingButton() {
		return settingButton;
	}

	public WebElement getteamButton() {
		return teamButton;
	}
	
	public WebElement getAddMemberButton() {
		return addMemberButton;
	}

	public WebElement getInviteButton() {
		return inviteButton;
	}
	
	public WebElement getcancelMemberButton() {
		return cancelMemberButton;
	}
	
	
	
	public void addProject() throws AWTException, InterruptedException {
		

		
		clickButton(getAddProjectButton());
		
		clickButton(getCancelButton());
		
		clickButton(getSettingButton());
		
		clickButton(getteamButton());
		
		clickButton(getAddMemberButton());
		
		clickButton(getInviteButton());
		
		clickButton(getcancelMemberButton());
		
		
	}

}
