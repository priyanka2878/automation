package org.makemytrip;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.sel.BaseClass;

public class MakeMyTrip extends BaseClass{
    public static void main(String[] args) throws Throwable {
	 browerlaunch("chrome", "https://www.makemytrip.com/flights/?gclid=Cj0KCQjw9ZzzBRCKARIsANwXaeKfsaIUidn3FFDRQYtAp0G9K66RvGjn9G3TSSGfSq-eGSDz5Nxv1MIaArq2EALw_wcB&cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|162031058804&s_kwcid=AL!1631!3!162031058804!e!!g!!make%20my%20trip&ef_id=Cj0KCQjw9ZzzBRCKARIsANwXaeKfsaIUidn3FFDRQYtAp0G9K66RvGjn9G3TSSGfSq-eGSDz5Nxv1MIaArq2EALw_wcB:G:s");
		WebElement multicity = driver.findElement(By.xpath("//li[text()='Multi City']"));
		click(multicity);
		WebElement dep = driver.findElement(By.id("anotherDeparture 0"));
		click(dep);
	
		
		
		WebElement from = driver.findElement(By.xpath("//span[text()='From']"));
		click(from);
		WebElement fromm = driver.findElement(By.xpath("//input[@placeholder='From']"));
		sendkeys(fromm, "chennai");
		WebElement chennai = driver.findElement(By.xpath("//p[text()='Chennai, India']"));
		click(chennai);
		WebElement to = driver.findElement(By.xpath("//input[@placeholder='To']"));
		sendkeys(to, "Bangkok, Thailand");
		WebElement bkk = driver.findElement(By.xpath("//div[text()='BKK']"));
		click(bkk);
		WebElement date = driver.findElement(By.xpath("//p[text()='20']"));
		click(date);
		WebElement traveller = driver.findElement(By.xpath("//span[text()='Travellers & CLASS']"));
		click(traveller);
		WebElement adults = driver.findElement(By.xpath("//li[text()='2']"));
		click(adults);
		WebElement firstclass = driver.findElement(By.xpath("//li[text()='Economy']"));
		click(firstclass);
		WebElement apply = driver.findElement(By.xpath("//button[text()='APPLY']"));
		click(apply);
		WebElement from1 = driver.findElement(By.id("fromAnotherCity1"));
		click(from1);
		WebElement delhi = driver.findElement(By.xpath("//input[@aria-controls='react-autowhatever-1']"));
		sendkeys(delhi, "delhi");
		WebElement chennaii = driver.findElement(By.xpath("//p[text()='Delhi, India']"));
		click(chennaii);
		WebElement to1 = driver.findElement(By.xpath("//input[@placeholder='To']"));
		sendkeys(to1, "Bangkok, Thailand");
		WebElement bkk1 = driver.findElement(By.xpath("//div[text()='BKK']"));
		click(bkk1);
		WebElement date1 = driver.findElement(By.xpath("//p[text()='20']"));
		click(date1);
		WebElement search = driver.findElement(By.xpath("//a[text()='Search']"));
		click(search);
		
		
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='actual-price']"));
		
		
		
		List<String> amount=new ArrayList<String>();
		
		for (int i = elements.size()-1; i >=0; i--) {
			System.out.println(elements.get(i).getText());
		}
		
//			System.out.println(amount);
//		for (int i = amount.size(); i < args.length; i++) {
//			
//		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
