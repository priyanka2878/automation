package com.practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
public static void main(String[] args) throws Throwable {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\priyanka\\AutomationPractice\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	
//	total height
//	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//	Thread.sleep(2000);
//	js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	
	
	
//	pixcel
//	js.executeScript("window.scrollTo(0,1000)");
//	Thread.sleep(3000);
//	js.executeScript("window.scrollTo(0,-300)");
	
	
	
//	by webelement
//	js.executeScript(arg0, arg1)
	
	
	
}}
