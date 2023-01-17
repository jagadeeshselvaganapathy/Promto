package com.pojo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Archive_Project extends BaseClass{
	public Archive_Project() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(id = "searchField")
	private WebElement searchTab;
	
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]")
	private WebElement searchProject;
	
	@FindBy(xpath = "//div[@class='ProjectCardList_cards__1zYbn']//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]")
	private WebElement editProject;
	
	@FindBy(xpath = "//div[@class='sc-lcDUFh MmbNG']//*[name()='svg']")
	private WebElement editProject2;
	
	@FindBy(id = "projectTitle")
	private WebElement projectName;
	
	@FindBy(xpath = "//input[@placeholder='Enter an address']")
	private WebElement Address;
	
	@FindBy(xpath = "//span[normalize-space()='Update project']")
	private WebElement updateProjectButton;
	
	@FindBy(id = "button_null")
	private WebElement dropArea;
	
	@FindBy(xpath = "//span[normalize-space()='Archive']")
	private WebElement archiveButton;
	
	@FindBy(xpath = "//div[@class='sc-jHkVzv dZffGd']")
	private WebElement archivePopup;
	

	public WebElement getSearchTab() {
		return searchTab;
	}

	public WebElement getSearchProject() {
		return searchProject;
	}

	public WebElement getEditProject() {
		return editProject;
	}

	public WebElement getEditProject2() {
		return editProject2;
	}

	public WebElement getProjectName() {
		return projectName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getUpdateProjectButton() {
		return updateProjectButton;
	}
	
	public WebElement getDropArea() {
		return dropArea;
	}
	
	public WebElement getArchiveButton() {
		return archiveButton;
	}
	
	public WebElement getArchivePopup() {
		return archivePopup;
	}
	
	
	public void archiveProject() throws AWTException, InterruptedException {

		insertText(getSearchTab(), "TEST6543");
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		String text = getSearchProject().getText();
		if (text.equals("TEST6543")) {
		//	WebElement element3 = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", getEditProject());
			Thread.sleep(10000);
			clickButton(getEditProject2());
		//	driver.findElement(By.xpath("//div[@class='sc-lcDUFh MmbNG']//*[name()='svg']")).click();
			Thread.sleep(5000);
			clickButton(getArchiveButton());
			Thread.sleep(5000);
			String text2 = getArchivePopup().getText();
			if (text2.equals("Archive project")) {
				driver.findElement(By.xpath("//span[normalize-space()='Archive project']")).click();
				Thread.sleep(10000);
				System.out.println("Archived successfully");
				
			} else {
				System.out.println("Not Archived successfully");
				driver.quit();

			}
			
		
			System.out.println("donne");
			
			
		} else {
			
			System.out.println("not added");
			driver.quit();

		}
		
		Thread.sleep(5000);
		
		
	}
	
	

}
