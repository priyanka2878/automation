package org.sel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInfo extends BaseClass{
	@FindBy(name="id_gender")
	private WebElement gender;
	@FindBy(name="customer_firstname")
	private WebElement firstname;
	@FindBy(name="customer_lastname")
	private WebElement lastname;
	@FindBy(name="passwd")
	private WebElement password;
	@FindBy(id="days")
	private WebElement day;
	@FindBy(id="months")
	private WebElement month;
	@FindBy(id="years")
	private WebElement year;
	@FindBy(name="newsletter")
	private WebElement check;
	@FindBy(name="optin")
	private WebElement check2;
	@FindBy(name="address1")
	private WebElement address;
	@FindBy(name="city")
	private WebElement city;
	@FindBy(name="id_state")
	private WebElement state;
	@FindBy(name="postcode")
	private WebElement postcode;
	@FindBy(id="id_country")
	private WebElement country;
	@FindBy(name="phone_mobile")
	private WebElement mobno;
	@FindBy(name="alias")
	private WebElement anotheradd;
	@FindBy(name="submitAccount")
	private WebElement register;
	public WebElement getGender() {
		return gender;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYear() {
		return year;
	}
	public WebElement getCheck() {
		return check;
	}
	public WebElement getCheck2() {
		return check2;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getPostcode() {
		return postcode;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getMobno() {
		return mobno;
	}
	public WebElement getAnotheradd() {
		return anotheradd;
	}
	public WebElement getRegister() {
		return register;
	}
	public PersonalInfo() {
		PageFactory.initElements(driver, this);
	}
}
