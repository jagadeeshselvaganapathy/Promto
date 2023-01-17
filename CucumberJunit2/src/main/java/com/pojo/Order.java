package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Order  extends BaseClass{
	public Order() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@aria-label='is sort ascending']")
	private WebElement ascendingOrder;
	
	@FindBy(xpath = "//button[@aria-label='is sort ascending']")
	private WebElement descendingOrder;

	public WebElement getAscendingOrder() {
		return ascendingOrder;
	}

	public void setAscendingOrder(WebElement ascendingOrder) {
		this.ascendingOrder = ascendingOrder;
	}

	public WebElement getDescendingOrder() {
		return descendingOrder;
	}

	public void setDescendingOrder(WebElement descendingOrder) {
		this.descendingOrder = descendingOrder;
	}
	
	public void orderExecution() throws InterruptedException {

		clickButton(getAscendingOrder());
		Thread.sleep(3000);
		clickButton(getDescendingOrder());
		Thread.sleep(3000);
		
		
		
		
		
	}
	
	
	
}