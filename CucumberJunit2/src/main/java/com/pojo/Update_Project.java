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

public class Update_Project extends BaseClass{
	public Update_Project() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath = "//input[@id='searchField']")
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
	
	@FindBy(xpath = "//span[normalize-space()='click to browse']")
	private WebElement dropArea;
	

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
	
	
	public void updateProject() throws AWTException, InterruptedException {
		
	
		insertText(getSearchTab(), "TEST0987");
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		String text = getSearchProject().getText();
		if (text.equals("TEST0987")) {
		//	WebElement element3 = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", getEditProject());
			Thread.sleep(5000);
		//	getEditProject().click();
			Thread.sleep(10000);
			clickButton(getEditProject2());
		//	driver.findElement(By.xpath("//div[@class='sc-lcDUFh MmbNG']//*[name()='svg']")).click();
			Thread.sleep(5000);
			clickButton(getDropArea());
		//	Robot rb = new Robot();
			rb.delay(2000);
			
			StringSelection ss = new StringSelection("C:\\Users\\DCKLP-060\\Desktop\\prompto2.png");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_V);
			rb.delay(2000);
			
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_V);
			
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(10000);
			clickButton(getProjectName());
	//		driver.findElement(By.id("projectTitle")).click();
		//	Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_A);
			rb.delay(2000);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_A);
			rb.delay(2000);
			rb.keyPress(KeyEvent.VK_BACK_SPACE);
			rb.keyRelease(KeyEvent.VK_BACK_SPACE);
			insertText(getProjectName(), "TEST6543");
	//		driver.findElement(By.id("projectTitle")).sendKeys("uk1");
			Thread.sleep(5000);
			clickButton(getAddress());
	//		driver.findElement(By.xpath("//input[@placeholder='Enter an address']")).click();
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_A);
			rb.delay(2000);
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_A);
			rb.delay(2000);
			rb.keyPress(KeyEvent.VK_BACK_SPACE);
			rb.keyRelease(KeyEvent.VK_BACK_SPACE);
			insertText(getAddress(), "Adyar");
	//		driver.findElement(By.xpath("//input[@placeholder='Enter an address']")).sendKeys("Adyar");
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(10000);
            clickButton(getUpdateProjectButton());	
			//		driver.findElement(By.xpath("//span[normalize-space()='Update project']")).click();
			Thread.sleep(10000);
			System.out.println("donne");
			driver.findElement(By.xpath("//button[@id='sidebarButton_projects']//*[name()='svg']")).click();
			Thread.sleep(15000);
			System.out.println("update completed");
			
			
		} else {
			
			System.out.println("not added");

		}
		
		
		
		
	}
	
	

}
