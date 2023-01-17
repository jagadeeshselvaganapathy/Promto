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
	
	@FindBy(id = "sidebarButton_projects")
	private WebElement projectTab;
	
	@FindBy(xpath = "//button[@id='button_toolbarCreateButton']")
	private WebElement addProjectButton;
	
	@FindBy(xpath = "//p[@class='ProjectModal_title__UZYsw']")
	private WebElement title;
	
	@FindBy(id = "button_null")
	private WebElement dropArea;
	
	@FindBy(xpath = "//span[normalize-space()='click to browse']")
	private WebElement assertDropArea;
	
	@FindBy(id = "projectTitle")
	private WebElement projectName;

	@FindBy(xpath = "//input[@placeholder='Enter an address']")
	private WebElement Assertlocation;
	
	@FindBy(xpath = "//span[normalize-space()='cancel']")
	private WebElement cancelButton;
	
	@FindBy(xpath = "//span[normalize-space()='Add project']")
	private WebElement assertAddProjectButton;
		
	
	public WebElement getProjectTab() {
		return projectTab;
	}
	
	public WebElement getAddProjectButton() {
		return addProjectButton;
	}
	
	public WebElement getTitle() {
		return title;
	}
	
	public WebElement getDropArea() {
		return dropArea;
	}

	public WebElement getAssertDropArea() {
		return assertDropArea;
	}
	
	public WebElement getProjectName() {
		return projectName;
	}

	public WebElement getAssertLocation() {
		return Assertlocation;
	}
	
	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	public WebElement getAssertAddProjectButton() {
		return assertAddProjectButton;
	}

	

	
	public void addProject() throws AWTException, InterruptedException {
		
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("arguments[0].click()", getCompanyButton());
		//clickButton(tranceButton);
		//Thread.sleep(5000);

		//clickButton(getCanadianCa());
		//Thread.sleep(4000);
		//clickButton(getRule());
		//Thread.sleep(4000);
		//clickButton(getNoRule());
		//Thread.sleep(4000);
		//clickButton(getSave());
		//Thread.sleep(4000);

	//	navigate("https://qa.eu.notabene.dev/dashboard/outgoing");
		//Thread.sleep(2000);
		
	//	JavascriptExecutor js = (JavascriptExecutor) driver;
	//	js.executeScript("arguments[0].click()", getAddProjectButton());
//		Thread.sleep(10000);
		Thread.sleep(10000);
		clickButton(getAddProjectButton());
		Thread.sleep(10000);
		
		String title2 = getAddProjectButton().getText();
		boolean contains = title2.contains("Add new project");
		Assert.assertTrue("verify title", contains);
		System.out.println("Assert verifiyed");
		
		String title3 = getAssertDropArea().getText();
		boolean contains1 = title3.contains("click to browse");
		Assert.assertTrue("verify title", contains1);
		System.out.println("Assert verifiyed");
		
		boolean enabled = getAssertDropArea().isEnabled();
		Assert.assertTrue("verify title", enabled);
		System.out.println("Assert verifiyed");
		
		boolean enabled2 = getProjectName().isEnabled();
		Assert.assertTrue("verify title", enabled2);
		System.out.println("Assert verifiyed");
		
		boolean enabled3 = getAssertLocation().isEnabled();
		Assert.assertTrue("verify title", enabled3);
		System.out.println("Assert verifiyed");
		
		boolean enabled4 = getCancelButton().isDisplayed();
		Assert.assertTrue("verify title", enabled4);
		System.out.println("Assert verifiyed");
		
		boolean enabled5 = getAssertAddProjectButton().isDisplayed();
		Assert.assertTrue("verify title", enabled5);
		System.out.println("Assert verifiyed");
		
		
	/*	clickButton(getDropArea());
		Robot rb = new Robot();
		rb.delay(2000);
		
		StringSelection ss = new StringSelection("C:\\Users\\DCKLP-060\\Desktop\\prompto.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
*/
	}

}
