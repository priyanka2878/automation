package org.makemytrip;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sel.BaseClass;

public class makemytrip1 extends BaseClass{
	 public static void main(String[] args) throws Throwable {
		 browerlaunch("chrome", "https://www.makemytrip.com/flights/?gclid=Cj0KCQjw9ZzzBRCKARIsANwXaeKfsaIUidn3FFDRQYtAp0G9K66RvGjn9G3TSSGfSq-eGSDz5Nxv1MIaArq2EALw_wcB&cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|162031058804&s_kwcid=AL!1631!3!162031058804!e!!g!!make%20my%20trip&ef_id=Cj0KCQjw9ZzzBRCKARIsANwXaeKfsaIUidn3FFDRQYtAp0G9K66RvGjn9G3TSSGfSq-eGSDz5Nxv1MIaArq2EALw_wcB:G:s");
			WebElement oneway = driver.findElement(By.xpath("//li[text()='Oneway']"));
			click(oneway);
			WebElement from = driver.findElement(By.xpath("//span[text()='From']"));
			click(from);
			WebElement fromm = driver.findElement(By.xpath("//input[@placeholder='From']"));
			Actions ac=new Actions(driver);
			ac.sendKeys("chennai").build().perform();
			Thread.sleep(3000);
			ac.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();
//			WebElement chennai = driver.findElement(By.xpath("//p[text()='Chennai, India']"));
//			click(chennai);
			WebElement to = driver.findElement(By.xpath("//input[@placeholder='To']"));
			sendkeys(to, "delhi");
			WebElement del = driver.findElement(By.xpath("//div[text()='DEL']"));
			click(del);
			List<WebElement> date = driver.findElements(By.xpath("//div[@class='DayPicker-Month'][1]//div[3]//p"));
			for (WebElement d : date) {
//				System.out.println(d.getText());
			if (d.getText().equals("29")) {
				click(d);
				break;
			}
			}
			WebElement retu = driver.findElement(By.xpath("//span[text()='RETURN']"));
			click(retu);
			List<WebElement> re = driver.findElements(By.xpath("(//div[@class='DayPicker-Month'])[2]//div[3]//p"));
			for (WebElement r : re) {
//			System.out.println(r.getText());
			if (r.getText().equals("5")) {
				click(r);
				break;
			}
			}
			
			Thread.sleep(2000);
			WebElement ser = driver.findElement(By.xpath("//a[text()='Search']"));
			Thread.sleep(1000);
			click(ser);
			
			
			
			
}}
