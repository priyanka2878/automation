package org.sel;


	import java.io.File;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.By.ByXPath;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;


	public class Automation {

		public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\priyanka\\AutomationPractice\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			
//			get url
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000);
		WebElement logo = driver.findElement(By.xpath("//img[@alt=\"My Store\"]"));
		if (logo.isDisplayed()==true) {
			System.out.println("logo is displayed");
		} else {
			System.out.println("logo is not displayed");
		}
		Thread.sleep(2000);
			
		
//			mob no count
		WebElement mobno = driver.findElement(By.xpath("//strong[text()=\"0123-456-789\"]"));
		String text = mobno.getText();
		String replace = text.replace("-", "");
		int length = replace.length();
		int mob = Integer.parseInt(replace);
		System.out.println(mob);
		if (mob==(int)mob && length==10) {
			System.out.println("mob no is valid");
		} else {
			System.out.println("mob no is not valid");
		}
		Thread.sleep(2000);
		
		
//			contact us
		WebElement contactus = driver.findElement(By.xpath("//a[text()=\"Contact us\"]"));
		if (contactus.isDisplayed()==true) {
			System.out.println("contact us is displayed");
		} else {
			System.out.println("contact us is not displayed");
		}
		Thread.sleep(2000);
			
//			sign in
			WebElement signin = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
			if (signin.isDisplayed()==true) {
				System.out.println("signin is displayed");
			} else {
				System.out.println("signin is not displayed");
			}
			Thread.sleep(2000);
		
			
//			search field
			WebElement search = driver.findElement(By.xpath("//input[@placeholder=\"Search\"]"));
			if (search.isDisplayed()==true && search.isEnabled()==true) {
				System.out.println("search is displayed and enabled");
			} else {
	System.out.println("search is neither displayed nor enabled");
			}
			Thread.sleep(2000);
			
//			women
			WebElement women = driver.findElement(By.xpath("//a[text()=\"Women\"]"));
			if (women.isDisplayed()==true) {
				System.out.println("women is displayed");
			} else {
				System.out.println("women is not displayed");
			}
			Thread.sleep(2000);
			
			
//			dresses
			WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
			if (dresses.isDisplayed()==true) {
				System.out.println("dresses is displayed");
			} else {
				System.out.println("dresses is not displayed");
			}
			Thread.sleep(2000);
			
			
//			tshirts
			WebElement tshirts = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
			if (tshirts.isDisplayed()==true) {
				System.out.println("tshirts is displayed");
			} else {
				System.out.println("tshirts is not displayed");
			}
			Thread.sleep(2000);
		
		
		File des=new File("C:\\Users\\LENOVO\\priyanka\\AutomationPractice\\library\\screenshot\\img1.png");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp=ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		FileUtils.copyFile(temp, des);
			
				
//			click on signin
			WebElement sigin1 = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
			sigin1.click();
			Thread.sleep(2000);
			
//			authentication
			WebElement authentication = driver.findElement(By.xpath("//h1[text()='Authentication']"));
			if (authentication.isDisplayed()==true) {
				System.out.println("authentication is displayed");
			} else {
				System.out.println("authentication is not displayed");	}
			Thread.sleep(2000);
			
			
//			create an acc
			WebElement createanacc = driver.findElement(By.xpath("//h1[@class=\"page-heading\"]"));
			if (createanacc.isDisplayed()==true) {
				System.out.println("create acc is displyed");
			} else {
				System.out.println("create acc is not displyed");
			}
			Thread.sleep(2000);
			
			
//			already registered
			WebElement already = driver.findElement(By.xpath("//h3[text()='Already registered?']"));
			if (already.isDisplayed()==true) {
				System.out.println("already registered is displayed");
			} else {
				System.out.println("already registered is displayed");
			}
			Thread.sleep(2000);
			
			
//			get title
			String title = driver.getTitle();
			System.out.println(title);
			Thread.sleep(2000);
			
			
//			email
			WebElement email = driver.findElement(By.id("email_create"));
			email.sendKeys("minotaaar@gmail.com");
			String email1 = email.getAttribute("value");
//			int length2 = email1.length();
			System.out.println(email1);
//			System.out.println(length2);
//			String sub=email1.substring(length2-4);
//			System.out.println(sub);
			if (email1.contains("@") && email1.contains(".com")) {
				System.out.println("email is valid");
			} else {
				System.out.println("email is not valid");
			}
			Thread.sleep(2000);
			
			
//			click on create on account
			WebElement create = driver.findElement(By.name("SubmitCreate"));
			create.click();
			Thread.sleep(2000);
			
//			create an account
			WebElement createacc = driver.findElement(By.xpath("//h1[@class=\"page-heading\"]"));
			if (createacc.isDisplayed()==true) {
				System.out.println("create an account is displayed");
			} else {
				System.out.println("create an account is not displayed");
			}
			Thread.sleep(2000);
			
			
//			gender
			WebElement mr = driver.findElement(By.xpath("//label[@for='id_gender1']"));
			mr.click();
			
			
//			firstname lastname
			WebElement fn = driver.findElement(By.name("customer_firstname"));
			fn.sendKeys("xrfdjhfkj");
			String fn1 = fn.getAttribute("value");
			WebElement ln = driver.findElement(By.name("customer_lastname"));
			ln.sendKeys("yrdyjfj");
			String ln1 = ln.getAttribute("value");
		
		
			
//			passwrd
			WebElement passwrd = driver.findElement(By.id("passwd"));
			passwrd.sendKeys("gfsdga");
			
			
			
//			date drop down
			WebElement date = driver.findElement(By.id("days"));
			Select dated=new Select(date);
			dated.selectByValue("2");
							
			WebElement month = driver.findElement(By.id("months"));
			Select monthd=new Select(month);
			monthd.selectByValue("5");
					
			WebElement year = driver.findElement(By.id("years"));
			Select yeard=new Select(year);
			yeard.selectByValue("2019");
					
			
//			checkbox
			WebElement cb1 = driver.findElement(By.id("newsletter"));
			cb1.click();
			WebElement cb2 = driver.findElement(By.id("optin"));
			cb2.click();
			if (cb1.isSelected() && cb2.isSelected()) {
				System.out.println("cb is selected");
				
			} else {
				System.out.println("cb is not selected");
			}
			
			
//			check names
			WebElement fnn1 = driver.findElement(By.id("firstname"));
			String fnn = fnn1.getAttribute("value");
			System.out.println(fnn);
			WebElement lnn1 = driver.findElement(By.id("lastname"));
			String lnn = lnn1.getAttribute("value");
			if (fnn.equalsIgnoreCase(fn1) && lnn.equalsIgnoreCase(ln1)) {
				System.out.println("same f&l name");
			} else {
				System.out.println("not same f&l name");
			}
			
			
//			address
			WebElement add = driver.findElement(By.id("address1"));
			add.sendKeys("fderdctyg");
			WebElement city = driver.findElement(By.id("city"));
			city.sendKeys("hdj");
			WebElement state = driver.findElement(By.id("id_state"));
			Select states=new Select(state);
			states.selectByValue("4");
			WebElement postcd = driver.findElement(By.id("postcode"));
			postcd.sendKeys("22222");
			WebElement country = driver.findElement(By.id("id_country"));
			Select coun=new Select(country);
			coun.selectByValue("21");
		
//			mob no 
			WebElement phnn = driver.findElement(By.id("phone_mobile"));
			phnn.sendKeys("1234567890");
			 
			
//			ref add
			WebElement refadd = driver.findElement(By.id("alias"));
			refadd.sendKeys("gsdkgs");
			
			
//			clk on register
			WebElement reg = driver.findElement(By.xpath("//span[text()='Register']"));
			reg.click();
			
			
//			welcome to ur acc
			WebElement welcome = driver.findElement(By.xpath("//p[contains(text(),'Welcome to your account')]"));
			if (welcome.isDisplayed()==true) {
				System.out.println("welcome is displayed");
			} else {
				System.out.println("welcome not displayed");
			}
			Thread.sleep(3000);
			
			
			File des1=new File("C:\\Users\\LENOVO\\priyanka\\AutomationPractice\\library\\screenshot\\img2.png");
			TakesScreenshot tks2=(TakesScreenshot)driver;
			File temp1=tks2.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
			FileUtils.copyFile(temp1, des1);
			
			
		
//			mouse hover to women
			WebElement wom = driver.findElement(By.xpath("//a[text()='Women']"));
			Actions ac=new Actions(driver);
			ac.moveToElement(wom).build().perform();
			WebElement casual = driver.findElement(By.xpath("//a[text()='Casual Dresses']"));
			casual.click();
				
			
			
//			pic select
			WebElement pic = driver.findElement(By.xpath("//a[contains(text(),'Printed Dress')]"));
			Actions acs=new Actions(driver);
			acs.moveToElement(pic).build().perform();
			pic.click();
			
//			quantity
			WebElement quantity = driver.findElement(By.xpath("//i[@class='icon-plus']"));
			quantity.click();
			WebElement qty = driver.findElement(By.name("qty"));
			String qqty = qty.getAttribute("value");
			
			
//			size
			WebElement size = driver.findElement(By.id("group_1"));
			Select siz=new Select(size);
			siz.selectByValue("1");
			
//			add to cart
			WebElement addtocart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
			addtocart.click();
			Thread.sleep(2000);
			
			File dess=new File("C:\\Users\\LENOVO\\priyanka\\AutomationPractice\\library\\screenshot\\img3.png");
			TakesScreenshot tss=(TakesScreenshot)driver;
			File tempp=tss.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
			FileUtils.copyFile(tempp, dess);
		
			
//			proceed to checkout
			WebElement proceed = driver.findElement(By.xpath("//span[contains(text(),'Proceed')]"));
			proceed.click();
			
//			check quantity
			WebElement quan = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
			String qq = quan.getAttribute("value");
			if (qqty.equals(qq)) {
				System.out.println("quantity is same");
			} else {
				System.out.println("qty is not same");
			}
			
			
//			total
			WebElement total = driver.findElement(By.xpath("//td[@class='cart_total']"));
			String ttl = total.getText();
			WebElement totalproduct = driver.findElement(By.id("total_product"));
			String ttlp=totalproduct.getText();
			if (ttl.equals(ttlp)) {
				System.out.println("same total");
			} else {
				System.out.println("different total");
			}
			
			
//	 	   proceed to checkout
			WebElement proceed1 = driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]"));
			proceed1.click();
			
//			proceed to checkout
			WebElement checkout = driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]"));
			checkout.click();
			
			
			//	checkbox
			WebElement ckkb = driver.findElement(By.id("cgv"));
			ckkb.click();
			
//			   proceed to checkout
				WebElement proceed11 = driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]"));
				proceed11.click();
			
			
			
//			payment
				WebElement payment = driver.findElement(By.xpath("//a[contains(text(),'Pay by bank wire')]"));
			payment.click();
			
			
			
			
//			checkout
			WebElement checkout1 = driver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]"));
			checkout1.click();
			
			
			File desss=new File("C:\\Users\\LENOVO\\priyanka\\AutomationPractice\\library\\screenshot\\img4.png");
			TakesScreenshot tsss=(TakesScreenshot)driver;
			File temppp=tsss.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
			FileUtils.copyFile(temppp, desss);
			
			
			
			
				
			
	}
	}
	

