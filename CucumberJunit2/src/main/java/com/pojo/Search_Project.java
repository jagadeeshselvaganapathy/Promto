package com.pojo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Search_Project extends BaseClass{
	public Search_Project() {
		PageFactory.initElements(driver, this);
		}
	
	
	@FindBy(id = "searchField")
	private WebElement searchTab;
	
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]")
	private WebElement searchProject;

	public WebElement getSearchProject() {
		return searchProject;
	}
	
	public WebElement getSearchTab() {
		return searchTab;
	}
	
	public void projectSearch() throws AWTException, InterruptedException {
		
		insertText(getSearchTab(), "TEST0987");
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
        
		String text = getSearchProject().getText();
		if (text.equals("TEST0987")) {
			System.out.println("project added");
		} else {
			System.out.println("project not added");
			driver.quit();

		}
		
		Thread.sleep(5000);
		getSearchTab().click();
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_A);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_A);
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_BACK_SPACE);
		rb.keyRelease(KeyEvent.VK_BACK_SPACE);
		System.out.println("Taken");
		Thread.sleep(5000);

		
	}
	
	


	

}
