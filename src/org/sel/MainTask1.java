package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainTask1 extends BaseClass{

	public static void main(String[] args) throws Throwable  {
		WebDriver driver;
		driver=browerlaunch("chrome", "http://automationpractice.com/index.php");

		HomePage hp=new HomePage();
		SignIn sp=new SignIn();
		MyAcc my=new MyAcc();
		Checkout ck=new Checkout();
		click(hp.getSignin());
		sendkeys(sp.getEmailenter(), "priyanka28@gmail.com");
		getText(sp.getEmailenter());
		sendkeys(sp.getPassword1(), "priyanka28");
		getText(sp.getPassword1());
		click(sp.getSignin1());
		isDisplayed(my.getSearch(), "search");
		sendkeys(my.getSearch(), "dresses");
		click(my.getSubmitClick());
		mousehover(my.getDressScroll());
		click(my.getAddToCart5());
		TakesScreenshot("ph");
		click(ck.getProceedToCheckout());
		click(ck.getProceed2());
		click(ck.getProceed3());
		click(ck.getCondition());
		click(ck.getProceed4());
		isDisplayed(ck.getPaybybank(), "Pay by bank");
		click(ck.getPaybybank());
		click(ck.getConfirmorder());
//		click(ck.getSignout());
		TakesScreenshot("photo");
		
	}}

	
