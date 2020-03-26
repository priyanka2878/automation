package org.junit;

import org.sel.BaseClass;
import org.sel.Checkout;
import org.sel.HomePage;
import org.sel.MyAcc;
import org.sel.SignIn;

public class Junit extends BaseClass{
@BeforeClass
public static void driverlaunch() throws Throwable {
	driver=browerlaunch("chrome", "http://automationpractice.com/index.php");
}
@Before
public void login() throws Throwable {
	HomePage hp=new HomePage();
	click(hp.getSignin());
	SignIn sp=new SignIn();
	sendkeys(sp.getEmailenter(), "priyanka28@gmail.com");
	getText(sp.getEmailenter());
	sendkeys(sp.getPassword1(), "priyanka28");
	getText(sp.getPassword1());
	click(sp.getSignin1());
	TakesScreenshot("img1");
}
@Test
public void test1() throws Throwable {
	MyAcc my=new MyAcc();
	isDisplayed(my.getMyAcc(),"Myacc");
	isDisplayed(my.getOrderHistory(), "order history");
	isDisplayed(my.getWishList(),"wishlist");
	mousehover(my.getDresses());
	click(my.getEvngDrss());
	TakesScreenshot("img2");
	mousehover(my.getQuickbox());
	click(my.getAddtocart1());
	TakesScreenshot("img3");
	Checkout ck=new Checkout();
	click(ck.getProceedToCheckout());
	click(ck.getProceed2());
	click(ck.getProceed3());
	click(ck.getCondition());
	click(ck.getProceed4());
	click(ck.getPaybybank());
	click(ck.getConfirmorder());
	TakesScreenshot("img4");
}
@Test
public void test2() throws Throwable {
	MyAcc my=new MyAcc();
	isDisplayed(my.getSearch(), "search");
	sendkeys(my.getSearch(), "printed");
	click(my.getSubmitClick());
	TakesScreenshot("img2");
	mousehover(my.getDressScroll());
	click(my.getAddToCart5());
	TakesScreenshot("img3");
	Checkout ck=new Checkout();
	click(ck.getProceedToCheckout());
	click(ck.getProceed2());
	click(ck.getProceed3());
	click(ck.getCondition());
	click(ck.getProceed4());
	isDisplayed(ck.getPaybybank(), "Pay by bank");
	click(ck.getPaybybank());
	click(ck.getConfirmorder());
	TakesScreenshot("img4");

}
@After
public void logout() {
	Checkout ck=new Checkout();
	click(ck.getSignout());
}
@AfterClass
public static void driverqiut() {
	driver.quit();

}

}
