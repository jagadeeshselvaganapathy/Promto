package com.pojo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Field_Builder extends BaseClass{
		public Field_Builder() {
			PageFactory.initElements(driver, this);
		}
		
		
		@FindBy(xpath = "//p[normalize-space()='Field Builder']")
		private WebElement fieldBuilderButton;

		@FindBy(xpath = "(//div[@class='sc-lkLEyH sc-erhTAi eAFceX cmsnTA'])[3]")
		private WebElement visibilityIcon;
		
		@FindBy(xpath = "//p[normalize-space()='Number of bathrooms']")
		private WebElement bathRoom;
		
		@FindBy(xpath = "(//div[@class='Checkbox_checkboxWrapper__1IzUm sc-hJPGqI hqKkDL'])[1]")
		private WebElement bathRoomCheckBox;
		
		@FindBy(xpath = "//button[@class='sc-VmyFz sc-frexfW lgLZnZ kwVmvx']")
		private WebElement saveButton;
		
		@FindBy(xpath = "//button[@class='sc-dsHFrD krVIdV']")
		private WebElement customField;
		
		@FindBy(xpath = "//span[@class='Button_button__label__1h86U Button_spanStyle__2u_Xo']")
		private WebElement addCustomField;
		
		@FindBy(xpath = "//input[@id='customFieldName']")
		private WebElement nameCustomField;
		
		@FindBy(xpath = "(//div[@class='sc-eNuVKJ eeqjWF css-2b097c-container'])[2]")
		private WebElement fieldIcon;
		
		@FindBy(xpath = "//input[@id='localizedFieldName']")
		private WebElement fieldLable;
		
		@FindBy(xpath = "//input[@id='localizedFieldInstructions']")
		private WebElement fieldInstruction;
		
		@FindBy(xpath = "//button[@class='sc-cUpCTh sc-cvQHKT byLdHC fUNKaW']")
		private WebElement createButton;
		
		@FindBy(xpath = "//input[@id='searchField']")
		private WebElement searchField;
		
		@FindBy(xpath = "//p[normalize-space()='Units']")
		private WebElement unitButton;
		
		@FindBy(xpath = "//button[@class='sc-ttenJ fobWv']")
		private WebElement unitTypeButton;
		
		@FindBy(xpath = "//button[@id='button_toolbarCreateButton']")
		private WebElement addUnitTypeButton;
		
		@FindBy(xpath = "(//input[@id='searchField'])[2]")
		private WebElement searchField2;
		
		@FindBy(xpath = "//div[@class='Checkbox Checkbox_checkbox__2pNqg unchecked']")
		private WebElement unitCheckBox;
		
		@FindBy(xpath = "//button[@class='sc-kgwdDA sc-hkbsXB fxRLSd slaiR']")
		private WebElement unitCreateChanges;
		
		
		
		@FindBy(xpath = "//p[normalize-space()='Showcase Editor']")
		private WebElement showCaseEditor;
		
		@FindBy(xpath = "//div[normalize-space()='Image tour']")
		private WebElement imageTour;
		
		@FindBy(xpath = "(//div[@class='sc-cnHmbd cEBtfL'])[5]")
		private WebElement unit;
		
		@FindBy(xpath = "(//div[@class='sc-iEhLsB fDZSoP'])[2]")
		private WebElement LocatorFrom;
		
		@FindBy(xpath = "//div[@class='sc-jMdqlH fSTNlp']")
		private WebElement LocatorTo;
		
		@FindBy(xpath = "//div[contains(text(),'mountains')]")
		private WebElement mountainDropDown;
		
		@FindBy(xpath = "//input[@id='name']")
		private WebElement unitTypeName;
		
		@FindBy(xpath = "//div[@class='sc-eJPtCf iyiKjE']")
		private WebElement color;
		
		@FindBy(xpath = "(//div[@class='sc-eJPtCf guAnpA'])[1]")
		private WebElement colorGreen;
		
		@FindBy(xpath = "(//div[@class='sc-jTeSNw hQTuWu'])[1]")
		private WebElement unitTypeOne;
		
		@FindBy(xpath = "(//input[@id='searchField'])[2]")
		private WebElement unitTypeOneSearch;

		@FindBy(xpath = "//div[@class='Checkbox Checkbox_checkbox__2pNqg checked']")
		private WebElement unitTypeOneSearchCheckBox;
		
		@FindBy(xpath = "//button[@class='sc-kgwdDA sc-hkbsXB fxRLSd slaiR']")
		private WebElement unitTypeOneSave;
		
		@FindBy(xpath = "(//div[@class='sc-kbFMom sc-kzEFrI iyvNDe iQNUjg'])[1]")
		private WebElement fieldDelete;
		
		@FindBy(xpath = "//span[normalize-space()='continue']")
		private WebElement fieldContinue;
		
		
		public WebElement getFieldContinue() {
			return fieldContinue;
		}
		
		public WebElement getFieldDelete() {
			return fieldDelete;
		}
		
		public WebElement getUnitTypeOneSave() {
			return unitTypeOneSave;
		}
		
		
		public WebElement getUnitTypeOneSearchCheckBox() {
			return unitTypeOneSearchCheckBox;
		}
		
		public WebElement getUnitTypeOneSearch() {
			return unitTypeOneSearch;
		}
		
		public WebElement getUnitTypeOne() {
			return unitTypeOne;
		}
		
		public WebElement getColorGreen() {
			return colorGreen;
		}
		
		public WebElement getColor() {
			return color;
		}
		
		public WebElement getUnitTypeName() {
			return unitTypeName;
		}
		
		public WebElement getMountainDropDown() {
			return mountainDropDown;
		}
		
		public WebElement getFieldBuilderButton() {
			return fieldBuilderButton;
		}
		
		public WebElement getVisibilityIcon() {
			return visibilityIcon;
		}

		public WebElement getBathRoom() {
			return bathRoom;
		}

		public WebElement getBathRoomCheckBox() {
			return bathRoomCheckBox;
		}
		
		public WebElement getSaveButton() {
			return saveButton;
		}
		
		public WebElement getCustomField() {
			return customField;
		}
		
		public WebElement getAddCustomField() {
			return addCustomField;
		}
		
		public WebElement getNameCustomField() {
			return nameCustomField;
		}
		
		public WebElement getFieldIcon() {
			return fieldIcon;
		}
		
		public WebElement getFieldLable() {
			return fieldLable;
		}
		
		public WebElement getFieldInstruction() {
			return fieldInstruction;
		}
		
		public WebElement getCreateButton() {
			return createButton;
		}
		
		public WebElement getSearchField() {
			return searchField;
		}
		
		public WebElement getUnitButton() {
			return unitButton;
		}
		
		public WebElement getUnitTypeButton() {
			return unitTypeButton;
		}
		
		public WebElement getAddUnitTypeButton() {
			return addUnitTypeButton;
		}
		
		public WebElement getSearchField2() {
			return searchField2;
		}
		
		public WebElement getUnitCheckBox() {
			return unitCheckBox;
		}
		
		public WebElement getUnitCreateChanges() {
			return unitCreateChanges;
		}
		
		public WebElement getShowCaseEditor() {
			return showCaseEditor;
		}
		
		public WebElement getImageTour() {
			return imageTour;
		}
		
		public WebElement getUnit() {
			return unit;
		}
		
		
		
		
		
	public void fieldBuilder() throws InterruptedException {

		clickButton(getFieldBuilderButton());
		clickButton(getVisibilityIcon());
		clickButton(getBathRoom());
		clickButton(getBathRoomCheckBox());
		clickButton(getSaveButton());
		Thread.sleep(5000);
		clickButton(getCustomField());
		Thread.sleep(5000);
		clickButton(getAddCustomField());
		insertText(getNameCustomField(), "tstwind");
		Thread.sleep(5000);
	    clickButton(getFieldIcon());	
	    Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", getMountainDropDown());
		insertText(getFieldLable(), "tstwind");
		insertText(getFieldInstruction(), "yyyyy");
		clickButton(getCreateButton());
		Thread.sleep(10000);
		insertText(getSearchField(), "tstwind");
		Thread.sleep(15000);
		clickButton(getUnitButton());
		clickButton(getUnitTypeButton());
		Thread.sleep(15000);
		clickButton(getAddUnitTypeButton());
		insertText(getSearchField2(), "tstwind");
		Thread.sleep(15000);
		clickButton(getUnitCheckBox());
		clickButton(getUnitCreateChanges());
		insertText(getUnitTypeName(), "test link");
		clickButton(getUnitCreateChanges());
		Thread.sleep(15000);
/*		clickButton(getShowCaseEditor());
		clickButton(getImageTour());
		clickButton(getUnit());
		WebElement LocatorFrom = driver.findElement(By.xpath("(//div[@class='sc-UMyrj ceieNI'])[1]"));
		WebElement LocatorTo = driver.findElement(By.xpath("//img[@alt='lazyload image']"));
//		Actions a = new Actions(driver);
//		a.dragAndDrop(src, dst).perform();
		Thread.sleep(3000);

//		a.clickAndHold(src).moveToElement(dst).release().build().perform();
//		 JavascriptExecutor js = (JavascriptExecutor) driver;	
		  js.executeScript("function createEvent(typeOfEvent) {\n" + "var event =document.createEvent(\"CustomEvent\");\n"
	                + "event.initCustomEvent(typeOfEvent,true, true, null);\n" + "event.dataTransfer = {\n" + "data: {},\n"
	                + "setData: function (key, value) {\n" + "this.data[key] = value;\n" + "},\n"
	                + "getData: function (key) {\n" + "return this.data[key];\n" + "}\n" + "};\n" + "return event;\n"
	                + "}\n" + "\n" + "function dispatchEvent(element, event,transferData) {\n"
	                + "if (transferData !== undefined) {\n" + "event.dataTransfer = transferData;\n" + "}\n"
	                + "if (element.dispatchEvent) {\n" + "element.dispatchEvent(event);\n"
	                + "} else if (element.fireEvent) {\n" + "element.fireEvent(\"on\" + event.type, event);\n" + "}\n"
	                + "}\n" + "\n" + "function simulateHTML5DragAndDrop(element, destination) {\n"
	                + "var dragStartEvent =createEvent('dragstart');\n" + "dispatchEvent(element, dragStartEvent);\n"
	                + "var dropEvent = createEvent('drop');\n"
	                + "dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n"
	                + "var dragEndEvent = createEvent('dragend');\n"
	                + "dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" + "}\n" + "\n"
	                + "var source = arguments[0];\n" + "var destination = arguments[1];\n"
	                + "simulateHTML5DragAndDrop(source,destination);", LocatorFrom, LocatorTo);
		
		Thread.sleep(15000);
*/		 
		clickButton(getFieldBuilderButton());
		clickButton(getCustomField());
		insertText(getSearchField(), "tstwind");
		
		Thread.sleep(30000);
		boolean enabled = getColorGreen().isEnabled();
		System.out.println(enabled);
		Thread.sleep(3000);
		
		clickButton(getUnitButton());
		clickButton(getUnitTypeButton());
		Thread.sleep(15000);
		clickButton(getUnitTypeOne());
		insertText(getUnitTypeOneSearch(), "tstwind");
		Thread.sleep(5000);
		clickButton(getUnitTypeOneSearchCheckBox());
		clickButton(getUnitTypeOneSave());
		clickButton(getFieldBuilderButton());
		clickButton(getCustomField());
		insertText(getSearchField(), "tstwind");
		
		Thread.sleep(15000);
		
		clickButton(getFieldDelete());
		Thread.sleep(10000);
		clickButton(getFieldContinue());
		Thread.sleep(10000);
		insertText(getSearchField(), "tstwind");
		
		
		
		
       
		
		
		
		
	}
		
		

}
