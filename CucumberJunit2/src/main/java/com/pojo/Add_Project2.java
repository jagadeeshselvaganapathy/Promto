package com.pojo;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.BaseClass;

public class Add_Project2 extends BaseClass {
	
	public Add_Project2() {
     PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "button_null")
	private WebElement dropArea;
	
	@FindBy(id = "projectTitle")
	private WebElement projectName1;
	
	@FindBy(xpath = "//input[@placeholder='Enter an address']")
	private WebElement Assertlocation1;
	
	@FindBy(xpath = "//span[normalize-space()='Add project']")
	private WebElement assertAddProjectButton1;
	

	public WebElement getDropArea() {
		return dropArea;
	}

	public WebElement getProjectName1() {
		return projectName1;
	}

	public WebElement getAssertlocation1() {
		return Assertlocation1;
	}

	public WebElement getAssertAddProjectButton1() {
		return assertAddProjectButton1;
	}
	
	public void addProject2() throws AWTException, InterruptedException {

		clickButton(getDropArea());
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
	/*	
		WebElement findElement = driver.findElement(By.xpath("//div[@class='sc-jlRLRk cbTvaY css-2b097c-container']"));
		findElement.click();
		Thread.sleep(10000);
		WebElement element4 = driver.findElement(By.xpath("//div[@class='sc-htJRVC iQiHOw']"));
		Select s = new Select(element4);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		System.out.println("perform");
		Thread.sleep(10000);
		System.out.println("done");
		*/
		insertText(getProjectName1(), "TEST0987");
		insertText(getAssertlocation1(), "Chennai");
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(5000);
		
		clickButton(getAssertAddProjectButton1());
		
		Thread.sleep(10000);
		
		
		
		
		
		
		
	}
	
	
	



}
