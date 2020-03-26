package org.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sel.BaseClass;

public class hotel extends BaseClass {
@FindBy(xpath="//input[@name=\"location_0\"]")
private WebElement location1;
@FindBy (id="cancel")
private WebElement cancel;
@FindBy(xpath="//a[text()=\"Logout\"]")
private WebElement logout;
@FindBy(name="radiobutton_0")
private WebElement selectbutton;


@FindBy (id="continue")
private WebElement con;
@FindBy(id="arr_date_0")
private WebElement arrivaldate;
@FindBy(id="dep_date_0")
private WebElement departuredate;
@FindBy (id="rooms_0")
private WebElement roomnos1;
@FindBy(id="room_type_0")
private WebElement roomtype1;
@FindBy(id="price_night_0")
private WebElement pricepernight;
@FindBy (id="no_days_0")
private WebElement noofdays;
@FindBy(id="total_price_0")
private WebElement totalprice;
@FindBy (id="hotel_name_0")
private WebElement hotelname;

public WebElement getHotelname() {
	return hotelname;
}

public WebElement getTotalprice() {
	return totalprice;
}


public WebElement getCon() {
	return con;
}


public WebElement getSelectbutton() {
	return selectbutton;
}

public WebElement getLogout() {
	return logout;
}


public WebElement getNoofdays() {
	return noofdays;
}


public WebElement getPricepernight() {
	return pricepernight;
}


public void setPricepernight(WebElement pricepernight) {
	this.pricepernight = pricepernight;
}


public WebElement getRoomtype1() {
	return roomtype1;
}


public WebElement getRoomnos1() {
	return roomnos1;
}


public WebElement getArrivaldate() {
	return arrivaldate;
}


public WebElement getDeparturedate() {
	return departuredate;
}


public WebElement getCancel() {
	return cancel;
}


public WebElement getLocation1() {
	return location1;
}


public hotel() {

	PageFactory.initElements(driver, this);
}
}
