package com.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.BaseClass;
import com.pojo.Add_Project;
import com.pojo.Add_Project2;
import com.pojo.Archive_Project;
import com.pojo.Field_Builder;
import com.pojo.LoginPage;
import com.pojo.Order;
import com.pojo.Search_Project;
import com.pojo.Search_Project2;
import com.pojo.Update_Project;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class NoRuleSingleFlow extends BaseClass {
	
	@Given("user goes to prompto portal")
	public void userGoesToPromptoPortal() {
		
	
	
	}

	@When("user with valid credentials they login")
	public void userWithValidCredentialsTheyLogin() throws InterruptedException, IOException {

		LoginPage l = new LoginPage();
		l.login(valueFromProperty("username"), valueFromProperty("password"));

	
	}

	@Then("user add new project")
	public void userAddNewProject() throws InterruptedException, AWTException {
/*		Thread.sleep(20000);

		
		Add_Project a = new Add_Project();
		a.addProject();
		
		
		
*/	
	}

	@When("user fill all the fields with valid data")
	public void userFillAllTheFieldsWithValidData() throws AWTException, InterruptedException {
/*		
		Add_Project2 a1 = new Add_Project2();
				a1.addProject2();

*/	
	}

	@Then("user add image")
	public void userAddImage() {

	
	}

	@When("user check if your project is added")
	public void userCheckIfYourProjectIsAdded() throws AWTException, InterruptedException {
/*		
		Search_Project s = new Search_Project();
		s.projectSearch();

*/	
	}

	@Then("user update the project")
	public void userUpdateTheProject() throws AWTException, InterruptedException {
/*		
		Update_Project u = new Update_Project();
		u.updateProject();
		Search_Project2 s = new Search_Project2();
		s.projectSearch();

*/	
	}

	@When("user Archive a Project")
	public void userArchiveAProject() throws AWTException, InterruptedException {
/*		
		Archive_Project a = new Archive_Project();
		a.archiveProject();

*/	
	}

	@Then("user check the project is Archived or not")
	public void userCheckTheProjectIsArchivedOrNot() throws AWTException, InterruptedException {
/*		
		Search_Project2 s = new Search_Project2();
		s.projectSearch();
		WebElement element = driver.findElement(By.xpath("//p[@class='EmptyListIcon_emptyListText__2Kwk2']"));
		String text2 = element.getText();
		System.out.println(text2);
		s.getSearchTab().click();
		Robot rb = new Robot();
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

*/
	  
		
		
		
		
		
		
		
		
	}
	
	@Then("user use sort to display the project in ascending and descending order")
	public void userUseSortToDisplayTheProjectInAscendingAndDescendingOrder() throws InterruptedException {
/*		
		Thread.sleep(50000);
		driver.findElement(By.xpath("//button[@aria-label='is sort ascending']")).click();
		System.out.println("Ascending");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@aria-label='is sort ascending']")).click();
		System.out.println("descending");
		Thread.sleep(10000);
		System.out.println("next");
*/
//	Order o = new Order();
//	o.orderExecution();
	}
	
	@Then("user upload the file in media")
	public void userUploadTheFileInMedia() throws InterruptedException, AWTException {
		
		WebElement element2 = driver.findElement(By.xpath("(//div[@class='CardOverlay_hoverBackground__1Rp_v'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element2);
		Thread.sleep(10000);
/*		driver.findElement(By.xpath("//span[normalize-space()='Add media']")).click();
		System.out.println("done");
		
		WebElement element = driver.findElement(By.xpath("//span[normalize-space()='Upload files']"));
		
		js.executeScript("arguments[0].click()", element);
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
		System.out.println("done");
		Thread.sleep(10000);

	*/	
		
	}
	
	@Then("user click action button and perform any method")
	public void userClickActionButtonAndPerformAnyMethod() throws InterruptedException {
/*		
		driver.findElement(By.xpath("//div[@class='sc-eySxxw eOJAae']")).click();
		System.out.println("done1");
		WebElement element = driver.findElement(By.xpath("//p[normalize-space()='Archive']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		System.out.println("done2");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[normalize-space()='confirm']")).click();
		System.out.println("done3");
		Thread.sleep(10000);

		//div[@class='sc-eicpiI ggkKCc']
		driver.findElement(By.xpath("//div[@class='sc-eicpiI ggkKCc']")).sendKeys("Project added");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[normalize-space()='save']")).click();
		Thread.sleep(10000);
*/	
	}
	
	@Then("user click usp and cancel it edit it and add it and also check the checkbox")
	public void userClickUspAndCancelItEditItAndAddItAndAlsoCheckTheCheckbox() throws InterruptedException {
		
/*		driver.findElement(By.id("tmc_USPs")).click();
		Thread.sleep(10000);
		System.out.println("done");
		WebElement element = driver.findElement(By.xpath("//p[@class='EmptyListIcon_emptyListText__2Kwk2']"));
		String text = element.getText();
		boolean contains = text.contains("Oops! We didn't find any USPs.");
		Assert.assertTrue("verify the msg", contains);
		System.out.println("done");
		
		WebElement element2 = driver.findElement(By.id("button_toolbarCreateButton"));
//		element2.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element2);
		Thread.sleep(5000);
		System.out.println("done1");
		driver.findElement(By.id("headline")).sendKeys("abc");
		Thread.sleep(5000);
		System.out.println("done1,1");
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("testmethod");
		Thread.sleep(5000);
		System.out.println("done1,2");
		driver.findElement(By.xpath("//button[@class='sc-biTvug sc-jBUund eurffU hBhQZL']")).click();
		Thread.sleep(5000);
		System.out.println("done1,3");

		
		WebElement element3 = driver.findElement(By.id("button_toolbarCreateButton"));
		
		js.executeScript("arguments[0].click()", element3);
		Thread.sleep(5000);
		System.out.println("done2");
		driver.findElement(By.id("headline")).sendKeys("cde");
		Thread.sleep(5000);
		System.out.println("done2,1");
		driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("testmethod1");
		Thread.sleep(5000);
		System.out.println("done2,2");
		driver.findElement(By.xpath("//button[@class='sc-biTvug eurffU']")).click();
		Thread.sleep(5000);
		System.out.println("done2,3");
		
		
		driver.findElement(By.xpath("//div[@class='sc-dZkiqo dhyDtT']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@role='checkbox'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@role='checkbox'])[2]")).click();
		Thread.sleep(5000);
	*///	driver.findElement(By.xpath("//button[@class='sc-biTvug sc-jBUund eurffU hBhQZL']")).click();
	//	Thread.sleep(5000);
		
		// doubt on drag and droup
/*		
		driver.findElement(By.xpath("(//div[@class='sc-fezjOJ izaHeS'])[1]")).click();
		Thread.sleep(5000);
		System.out.println("done1");
		driver.findElement(By.xpath("//div[normalize-space()='Image tour']")).click();
		Thread.sleep(5000);
		System.out.println("done1");
		driver.findElement(By.xpath("(//div[@class='sc-cnHmbd cEBtfL'])[6]")).click();
		Thread.sleep(5000);
		System.out.println("done1");
		WebElement src = driver.findElement(By.xpath("//div[@class='sc-bsmJhz gFSFYF']"));
		WebElement dst = driver.findElement(By.xpath("(//img[@src='https://devimagecdn.prompto.com/q=80:h=1200/vaults/h5zNR5hVnf/project/mP6KrpvAs5/collection/o7LeuPTfBA/ca4682ce-27e5-4abe-bbba-c7db85f8a1a1.png'])[1]"));
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dst).perform();

		Thread.sleep(10000);
	*/	
		// ** doubt on drag and droup **
		
		
	/*	
		driver.findElement(By.id("tmc_USPs")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[@class='sc-BYrfn eVqFFr'])[1]")).click();
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Duplicate')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//div[@class='sc-BYrfn eVqFFr'])[2]")).click();
		WebElement element2 = driver.findElement(By.xpath("//div[contains(text(),'Delete')]"));
		js.executeScript("arguments[0].click()", element2);
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[normalize-space()='continue']")).click();
		Thread.sleep(10000);
		*/
	}
	
	@Then("verifing turntable")
	public void verifingTurntable() throws AWTException, InterruptedException, UnsupportedFlavorException, IOException {
		
//		driver.findElement(By.xpath("//p[normalize-space()='Turntables']")).click();
//		List<WebElement> list1 = driver.findElements(By.xpath("//div[@class='sc-itwjeH XAyMp']"));
		
	/*	
		
			System.out.println("done list");
			WebElement element = driver.findElement(By.xpath("//p[@class='EmptyListIcon_emptyListText__2Kwk2']"));
			String text1 = element.getText();
			boolean contains = text1.contains("Oops! We didn't find any turntables.");
			Assert.assertTrue("verified", contains);
			System.out.println("done");
			
			driver.findElement(By.id("button_toolbarCreateButton")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class='Checkbox Checkbox_checkbox__2pNqg checked'])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//div[@class='Checkbox Checkbox_checkbox__2pNqg unchecked'])[2]")).click();
			
	        WebElement element1 = driver.findElement(By.xpath("//div[@class='sc-rmxtG gyoLHr']"));
	        JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", element1);
			Robot rb = new Robot();
			rb.delay(2000);
			
			
            
			
	//		StringSelection ss = new StringSelection("C:\\Users\\DCKLP-060\\Desktop\\prompto.png");
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	//		clipboard.getData(DataFlavor.stringFlavor);
			
			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			rb.delay(2000);
			
			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			rb.delay(2000);
			
			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			rb.delay(2000);
			
			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			rb.delay(2000);
			
			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			rb.delay(2000);
			
			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			rb.delay(2000);
			
			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			rb.delay(2000);
			
			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			rb.delay(2000);
			
			rb.keyPress(KeyEvent.VK_TAB);
			rb.keyRelease(KeyEvent.VK_TAB);
			rb.delay(2000);
			
			rb.keyPress(KeyEvent.VK_RIGHT);
			rb.keyRelease(KeyEvent.VK_RIGHT);
			rb.delay(2000);
			
			rb.keyPress(KeyEvent.VK_RIGHT);
			rb.keyRelease(KeyEvent.VK_RIGHT);
			rb.delay(2000);
			
			rb.keyPress(KeyEvent.VK_RIGHT);
			rb.keyRelease(KeyEvent.VK_RIGHT);
			rb.delay(2000);
			
			rb.keyPress(KeyEvent.VK_RIGHT);
			rb.keyRelease(KeyEvent.VK_RIGHT);
			rb.delay(2000);
			
			rb.keyPress(KeyEvent.VK_RIGHT);
			rb.keyRelease(KeyEvent.VK_RIGHT);
			rb.delay(2000);
			
			rb.keyPress(KeyEvent.VK_RIGHT);
			rb.keyRelease(KeyEvent.VK_RIGHT);
			rb.delay(2000);
			
			rb.keyPress(KeyEvent.VK_DOWN);
			rb.keyRelease(KeyEvent.VK_DOWN);
			rb.delay(2000);
			
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			rb.delay(2000);
			
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_A);
			rb.delay(2000);
			
			rb.keyRelease(KeyEvent.VK_CONTROL);
			rb.keyRelease(KeyEvent.VK_A);
			rb.delay(2000);
				
			rb.keyPress(KeyEvent.VK_ENTER);
			rb.keyRelease(KeyEvent.VK_ENTER);
			System.out.println("done");
			Thread.sleep(10000);
			
			WebElement element2 = driver.findElement(By.xpath("//span[normalize-space()='continue']"));
			js.executeScript("arguments[0].click()", element2);
			Thread.sleep(5000);
			WebElement element3 = driver.findElement(By.xpath("//span[normalize-space()='continue']"));
			js.executeScript("arguments[0].click()", element3);
			Thread.sleep(15000);
*//*			
			driver.findElement(By.xpath("//p[normalize-space()='Showcase Editor']")).click();
			Thread.sleep(5000);
			System.out.println("done1");
			driver.findElement(By.xpath("//div[normalize-space()='Image tour']")).click();
			Thread.sleep(5000);
			System.out.println("done1");
			driver.findElement(By.xpath("(//div[@class='sc-cnHmbd cEBtfL'])[2]")).click();
			Thread.sleep(5000);
			System.out.println("done1");
			WebElement LocatorFrom = driver.findElement(By.xpath("(//div[@class='Image_image__1oFbA sc-inrDdN jwaFk'])[1]"));
			WebElement LocatorTo = driver.findElement(By.xpath("//div[@class='sc-jMdqlH fSTNlp']"));
			Actions a = new Actions(driver);
//			a.dragAndDrop(src, dst).perform();
			Thread.sleep(7000);

//			a.clickAndHold(src).moveToElement(dst).release().build().perform();
			 JavascriptExecutor js = (JavascriptExecutor) driver;	
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
			
			
			
			
			Thread.sleep(3000);
			
	       driver.findElement(By.id("presentProject")).click();
	       
	       
	       WebElement element = driver.findElement(By.xpath("(//div[@class='sc-jMxyCG dnA-dIp'])[1]"));
	       String text = element.getText();
	       System.out.println(text);
//	       JavascriptExecutor js = (JavascriptExecutor) driver;
//	       js.executeScript("arguments[0].click()", element);
	       Thread.sleep(3000);
	       WebElement button = driver.findElement(By.xpath("//div[@class='sc-pIMVb sc-pZExJ cnyReO']"));
	        for (int i = 0; i < 10; i++) {
	        	button.click();
	        	Thread.sleep(3000);
				
			}
	        Thread.sleep(5000);
		
			System.out.println("done list2");
			
//			List<WebElement> list = driver.findElements(By.xpath("//body/div[@id='root']/div[@class='PrivateRoute_Dashboard__3i61E']/div[@class='ContentPage_pageContent__1dYkF']/div[@class='sc-loWEzq hnflJ']/div[@class='sc-fQFhuG dPdYJL']/div[@class='sc-gMDBGq fiEXOW']/div[@class='sc-itwjeH XAyMp']/div[@class='sc-lVTEl gaprho sc-iOaVNQ erHRgy']/div/div/div"));
			
//			for (int i = 0; i < list.size(); i++) {
//				WebElement element3 = list.get(i);
				
//				System.out.println(element3);		
//				}
			
*/		
		
		
		}
	
	
	@Then("Verify Field builder")
	public void verifyFieldBuilder() throws InterruptedException {

	
		Field_Builder f = new Field_Builder();
		f.fieldBuilder();
		
		
	
		
	
	
	
	}
	
	
	
	
	
	}
	

	


