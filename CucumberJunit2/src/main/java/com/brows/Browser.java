package com.brows;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) throws InterruptedException, AWTException {
		  WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://devapp.prompto.com/en/projects/mP6KrpvAs5/projectShowcase");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	
			driver.findElement(By.id("username")).sendKeys("wario");
			driver.findElement(By.id("password")).sendKeys("test");
			driver.findElement(By.id("button_signInButton")).click();
			WebElement element = driver.findElement(By.xpath("(//div[@class='CardOverlay_hoverBackground__1Rp_v'])[8]"));
	        	
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", element);
			Thread.sleep(5000);
			WebElement element3 = driver.findElement(By.xpath("(//p[@class='sc-iNpzLj hJqPdl'])[1]"));
			js.executeScript("arguments[0].click()", element3);
			
			driver.findElement(By.xpath("//div[normalize-space()='Image tour']")).click();
			Thread.sleep(5000);
			
		    
		    driver.findElement(By.xpath("(//div[@class='sc-cnHmbd cEBtfL'])[2]")).click();
			Thread.sleep(5000);
			WebElement LocatorFrom = driver.findElement(By.xpath("(//div[@class='Image_image__1oFbA sc-inrDdN jwaFk'])[1]"));
			
			Thread.sleep(3000);
			System.out.println("done");
			WebElement dst = driver.findElement(By.xpath("//div[@class='react-transform-component TransformComponent-module_container__3NwNd ']"));
			WebElement element2 = dst.findElement(By.xpath("//div[@class='react-transform-element TransformComponent-module_content__TZU5O ']"));
			WebElement LocatorTo = element2.findElement(By.xpath("//img[@alt='lazyload image']"));
			
			Thread.sleep(3000);
/*			
			String xto=Integer.toString(LocatorTo.getLocation().x);
			String yto=Integer.toString(LocatorTo.getLocation().y);
			
			 
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
		  
	*/		
					
			Thread.sleep(5000);
			Actions a = new Actions(driver);
			System.out.println("donedone");
		//	JavascriptExecutor js = (JavascriptExecutor) driver;
			Object script = js.executeScript("arguments[0].click()", LocatorTo);
			a.clickAndHold(LocatorFrom).moveToElement(LocatorTo).release().build().perform();
	//		a.clickAndHold(src).moveToElement(element3, 50, 30).release().click().build().perform();
			Thread.sleep(5000);
			a.moveByOffset(50, 30).contextClick().perform();

	//		a.moveToElement(src, 90, 90);
			
			Thread.sleep(5000);
			
			System.out.println("dopne");
	//	    driver.quit();
			
	}}
