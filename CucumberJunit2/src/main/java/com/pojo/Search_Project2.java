package com.pojo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Search_Project2 extends BaseClass{
	public Search_Project2() {
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
		
		insertText(getSearchTab(), "TEST6543");
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
        
		String text = getSearchProject().getText();
		if (text.equals("TEST6543")) {
			System.out.println("updated project added");
		} else {
			System.out.println("project not added");
			
		}
		Thread.sleep(5000);
	
		
		
		
	}
	
	


	

}
