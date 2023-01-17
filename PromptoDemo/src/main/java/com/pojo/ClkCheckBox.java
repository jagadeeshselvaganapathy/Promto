package com.pojo;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ClkCheckBox extends BaseClass{
	public ClkCheckBox() {
		PageFactory.initElements(driver, this);
	}
	

	
	
	@FindBy(xpath = "//button[@id='sidebarButton_settings']")
	private WebElement settingTab;
	
	@FindBy(xpath = "//p[normalize-space()='Portal']")
	private WebElement portalTab;
	
	
	@FindBy(xpath = "(//div[@role='checkbox'])[1]")
	private WebElement checkBox;
	
	@FindBy(xpath = "(//div[@class='Checkbox Checkbox_checkbox__2pNqg checked'])[1]")
	private WebElement unCheckBox;
	
	@FindBy(xpath = "(//input[@id='checkbox'])[2]")
	private WebElement checkBox2;
	
	@FindBy(xpath = "(//input[@id='checkbox'])[2]")
	private WebElement uncheckBox2;
	
	@FindBy(xpath = "//button[@id='sidebarButton_projects']")
	private WebElement projectTab;
	
	@FindBy(xpath = "(//p[contains(text(),'Open project')])[1]")
	private WebElement projectOpen;
	
	@FindBy(xpath = "//p[normalize-space()='Showcase Editor']")
	private WebElement showCaseEditor;
	
	@FindBy(xpath = "//div[normalize-space()='Settings']")
	private WebElement settingsTab;
	
	@FindBy(xpath = "(//div[@role='checkbox'])[1]")
	private WebElement uncheckBox3;
	
	@FindBy(xpath = "//p[normalize-space()='USPs']")
	private WebElement upsTab;
	
	@FindBy(xpath = "//span[@class='Button_button__label__1h86U Button_spanStyle__2u_Xo']")
	private WebElement addNewUps;
	
	@FindBy(xpath = "(//div[@class='Checkbox Checkbox_checkbox__2pNqg unchecked'])[1]")
	private WebElement uspCheckBox;
	
	@FindBy(xpath = "(//div[@role='checkbox'])[1]")
	private WebElement uspUncheckBox;
	
	@FindBy(xpath = "//p[normalize-space()='Turntables']")
	private WebElement turnTableTab;
	
	@FindBy(xpath = "//span[@class='Button_button__label__1h86U Button_spanStyle__2u_Xo']")
	private WebElement addNewTurnTable;
	
	@FindBy(xpath = "(//div[@class='Checkbox Checkbox_checkbox__2pNqg checked'])[1]")
	private WebElement checkTurnTable;
	
	
	
	public WebElement getSettingTab() {
		return settingTab;
	}

	public WebElement getPortalTab() {
		return portalTab;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getUnCheckBox() {
		return unCheckBox;
	}

	public WebElement getCheckBox2() {
		return checkBox2;
	}

	public WebElement getUncheckBox2() {
		return uncheckBox2;
	}

	public WebElement getProjectTab() {
		return projectTab;
	}

	public WebElement getProjectOpen() {
		return projectOpen;
	}

	public WebElement getShowCaseEditor() {
		return showCaseEditor;
	}

	public WebElement getSettingsTab() {
		return settingsTab;
	}

	public WebElement getUncheckBox3() {
		return uncheckBox3;
	}

	public WebElement getUpsTab() {
		return upsTab;
	}

	public WebElement getAddNewUps() {
		return addNewUps;
	}

	public WebElement getUspCheckBox() {
		return uspCheckBox;
	}

	public WebElement getUspUncheckBox() {
		return uspUncheckBox;
	}

	public WebElement getTurnTableTab() {
		return turnTableTab;
	}

	public WebElement getAddNewTurnTable() {
		return addNewTurnTable;
	}

	public WebElement getCheckTurnTable() {
		return checkTurnTable;
	}

	public void clkCheckBox() throws AWTException, InterruptedException {
		
	clickButton(getSettingTab());
	clickButton(getPortalTab());
	clickButton(getCheckBox());
	clickButton(getUnCheckBox());
	clickButton(getCheckBox2());
	clickButton(getUncheckBox2());
	
	clickButton(getProjectTab());
	clickButton(getProjectOpen());
	clickButton(getShowCaseEditor());
	clickButton(getSettingsTab());
	clickButton(getUncheckBox3());
	clickButton(getUncheckBox3());
	
	clickButton(getUpsTab());
	clickButton(getAddNewUps());
	clickButton(getUspCheckBox());
	clickButton(getUspUncheckBox());
	
	clickButton(getTurnTableTab());
	clickButton(getAddNewTurnTable());
	clickButton(getCheckTurnTable());
			
	
	
	
	
	
	
	
	
			
	}
	
	

}
