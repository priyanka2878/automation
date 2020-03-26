package org.sel;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	// browser launch
	public static WebDriver browerlaunch(String browsername,String url) throws Throwable {
		if (browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browsername.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browsername.equalsIgnoreCase("internetexplorer")) {
			System.setProperty("webdriver.internetexplorer.driver",
					System.getProperty("user.dir") + "\\driver\\internetexplorer.exe");
			driver = new InternetExplorerDriver();
		}

		else {
			throw new Exception();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		driver.get(url);
		return driver;
	}
	
	
	public static void waitforvisibility(WebElement element) {
		WebDriverWait ws = new WebDriverWait(driver, 60);
		ws.until(ExpectedConditions.visibilityOf(element));
	}

	// is displayed
	public static String isDisplayed(WebElement element, String text) {
		
		if (element.isDisplayed() == true) {
			System.out.println(text + "   present");
		} else {
			System.out.println(text + "  not present");
		}
		return text;
	}

	// is enabled
	public static boolean isEnabled(WebElement element, String text1) {
		boolean enabled = element.isEnabled();
		if (enabled == true) {
			System.out.println(text1 + "    is enabled");
		} else {
			System.out.println(text1 + "   is not enabled");
		}
		return enabled;
	}

	// is selected
	public static boolean isSelected(WebElement element, String text3) {
		boolean selected = element.isSelected();
		if (selected == true) {
			System.out.println(text3 + "    is selected");
		} else {
			System.out.println(text3 + "    is not selected");
		}
		return selected;
	}
	// send keys

	public static void sendkeys(WebElement element, String text) {
		waitforvisibility(element);
		element.sendKeys(text);
	}

	// click
	public static void click(WebElement element) {
		waitforvisibility(element);
		element.click();
	}
	
	//	clear
	public static void clear(WebElement element) {
		element.clear();
	}

	// screenshot
	public static void TakesScreenshot(String filename) throws Throwable {
		File des = new File(System.getProperty("user.dir") + "\\screenshot\\" + filename + " .png");
		org.openqa.selenium.TakesScreenshot ts = (org.openqa.selenium.TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		FileUtils.copyFile(temp, des);
		System.out.println(filename + "Screen is captured");

		}
					//scroll
		
	   public static void scroll(WebElement element,String text) 
	   {
		JavascriptExecutor js=(JavascriptExecutor) driver; 
		js.executeScript("arguments[0].ScrollIntoView(): ",element);
		System.out.println(text +"   screen is scrolled ");
	   }	
	   public static void scrollUsingPixel(int a,int b) 
	   {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.ScrollTo(a,b)");
		js.executeScript("window.ScrollTo(a,-b)");
	   }
	   
	   public static void scrollToTopAndBottom()
	   {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.ScrollBy(0,document.body.scrollHeight)");
		js.executeScript("window.ScrollBy(0,-document.body.scrollHeight)");
		  
	   }
	   				//drag and drop
	   public static void dragAndDrop(WebElement dragelement,WebElement dropelement,String text) 
	   {
		Actions ac =new Actions(driver);
		ac.dragAndDrop(dragelement,dropelement).build().perform();;
		System.out.println(text +"    is droped");
	   }
	   				//double click
	   public static void doubleClick(WebElement element,String text) 
	   {
		   Actions ac=new Actions(driver);
		   ac.doubleClick(element).build().perform();
		   System.out.println(text +"    is clicked");
	   } 	
	   				//right click
	   public static  void rightClick(WebElement element,String text) {
		   Actions ac=new Actions(driver);
		   ac.contextClick(element).build().perform();
		   System.out.println(text +"    is clicked");
	   }
	   
	   
//	   mousehover
	   public static void mousehover(WebElement element) {
		   Actions ac=new Actions(driver);
		   ac.moveToElement(element).build().perform();
	}
	   				//alert
//	   public static void alert(WebElement element,String type) {
//		click(element);
//		Alert alert=driver.switchTo().alert();
//		if (type.equalsIgnoreCase("simple")) 
//		{
//				alert.accept();
//		}
//		driver.switchTo().defaultContent();
//		}
//	   public static void confirmAlert(WebElement element,String type) {
//		click(element);
//		Alert alert=driver.switchTo().alert();
//				
//		if(type.equalsIgnoreCase("confirm"))
//		{
//			alert.accept();
//		}		
//		else  {
//
//			alert.dismiss();
//		}
//		}
//	   
//		public static void promptAlert(WebElement element,String type) {
//		click(element);
//		Alert alert=driver.switchTo().alert();	
//		sendkeys(element,"prompt alert");
//		if(type.equalsIgnoreCase("prompt"))
//			{
//			alert.accept();
//			}else 
//			{
//			alert.dismiss();
//			}
//		}
					//gettext
		public static  String getText(WebElement element) 
		{
		String  text = element.getText();
				return text;
		}
				//getattribute
		public static String getAttribute(WebElement element) 
		{
		String attribute = element.getAttribute("value");
				return attribute;
		}
		
				//navigation
		public static void navigationToElement(String txt) 
		{
		if (txt.equalsIgnoreCase("forward")) 
		{
			driver.navigate().forward();
			
		} else if(txt.equalsIgnoreCase("refresh"))
		{
			driver.navigate().refresh();
		}else if(txt.equalsIgnoreCase("back"))
		{
			driver.navigate().back();
		}else if(txt.contains("http"))
		{
			driver.navigate().to(txt);
		}
		
		}		// dropdown
		public static void dropDown(WebElement element,String option,String type)
		{
		Select sc=new Select(element);
		if (type.equalsIgnoreCase("value"))
		{
			sc.selectByValue(option);	
		} 
		else if(type.equalsIgnoreCase("string")) 
		{
			sc.selectByVisibleText(option);
		}
		else if(type.equalsIgnoreCase("index")) 
		{
			sc.deselectByIndex(Integer.parseInt(option));
		}
		
		
			
			
		
		
		
		
		
		
	

	}

}


