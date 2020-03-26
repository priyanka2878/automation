package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainTask extends BaseClass{
	public static void main(String[] args) throws Throwable {
		WebDriver driver;
	driver=browerlaunch("chrome","http://automationpractice.com/index.php");
	HomePage hp=new HomePage();
	SignIn sp=new SignIn();
	PersonalInfo ps=new PersonalInfo();
	MyAcc my=new MyAcc();
	Checkout ck=new Checkout();

	isDisplayed(hp.getLogin(),"logo");
	isDisplayed(hp.getContact(), "contact");
	isDisplayed(hp.getSearch(), "search");
	isDisplayed(hp.getWomen(),"women");
	isDisplayed(hp.getDresses(),"dresses");
	isDisplayed(hp.getTshirts(), "T-shirt");
	TakesScreenshot("img1");
	click(hp.getSignin());
		sendkeys(sp.getEmail(),"kafrai94@gmail.com");
	click(sp.getCreateanacc());
	click(ps.getGender());
	sendkeys(ps.getFirstname(), "pk");
	sendkeys(ps.getLastname(), "d");
	sendkeys(ps.getPassword(),"12345abcde");
	dropDown(ps.getDay(),"28", "value");
	dropDown(ps.getMonth(), "7", "value");
	dropDown(ps.getYear(), "1998", "value");
	click(ps.getCheck());
	click(ps.getCheck2());
	sendkeys(ps.getAddress(), "rangasayee atreet");
	sendkeys(ps.getCity(), "chennai");
	dropDown(ps.getState(), "5","value");
	sendkeys(ps.getPostcode(),"64562");
	dropDown(ps.getCountry(), "United States", "text");
	sendkeys(ps.getMobno(), "1234567890");
	sendkeys(ps.getAnotheradd(), "ertyuop");
	click(ps.getRegister());
	TakesScreenshot("img2");
	isDisplayed(my.getMyAcc(),"Myacc");
	isDisplayed(my.getOrderHistory(), "order history");
	isDisplayed(my.getWishList(),"wishlist");
	mousehover(my.getDresses());
	click(my.getEvngDrss());
	mousehover(my.getQuickbox());
	click(my.getAddtocart1());
	//click(my.getQuickView());
	TakesScreenshot("img3");
	//doubleClick(my.getQuantity(), "size");;
	//dropDown(my.getSize(), "1", "value");
	//click(my.getColour());
	//click(my.getAddToCart());
	TakesScreenshot("img4");
	click(ck.getProceedToCheckout());
	click(ck.getProceed2());
	click(ck.getProceed3());
	click(ck.getCondition());
	click(ck.getProceed4());
	click(ck.getPaybybank());
	click(ck.getConfirmorder());
	TakesScreenshot("img5");
//	click(ck.getSignout());
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

	
}
