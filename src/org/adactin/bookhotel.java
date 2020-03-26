package org.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sel.BaseClass;

public class bookhotel extends BaseClass{
@FindBy(id="hotel_name_dis")
private WebElement hotelname1;
@FindBy (id="location_dis")
private WebElement location2;
@FindBy(id="room_type_dis")
private WebElement roomtype2;
@FindBy (id="room_num_dis")
private WebElement roomnos2;
@FindBy (id="total_days_dis")
private WebElement noofdays1;
@FindBy(id="price_night_dis")
private WebElement pricepernight1;
@FindBy (name="total_price_dis")
private WebElement totalprice1;
@FindBy(id="first_name")
private WebElement firstname;
@FindBy(id="last_name")
private WebElement lastname;
@FindBy(id="address")
private WebElement address;
@FindBy(id="cc_num")
private WebElement creditcardno;
@FindBy(id="cc_type")
private WebElement cardtype;
@FindBy(id="cc_exp_month")
private WebElement cardmonth;
@FindBy (id="cc_exp_year")
private WebElement cardyear;
@FindBy(id="cc_cvv")
private WebElement ccv;
@FindBy(id="book_now")
private WebElement booknow;


public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCreditcardno() {
	return creditcardno;
}
public WebElement getCardtype() {
	return cardtype;
}
public WebElement getCardmonth() {
	return cardmonth;
}
public WebElement getCardyear() {
	return cardyear;
}
public WebElement getCcv() {
	return ccv;
}
public WebElement getBooknow() {
	return booknow;
}
public WebElement getHotelname1() {
	return hotelname1;
}
public WebElement getLocation2() {
	return location2;
}
public WebElement getRoomtype2() {
	return roomtype2;
}
public WebElement getRoomnos2() {
	return roomnos2;
}
public WebElement getNoofdays1() {
	return noofdays1;
}
public WebElement getPricepernight1() {
	return pricepernight1;
}
public WebElement getTotalprice1() {
	return totalprice1;
}
public bookhotel() {
	PageFactory.initElements(driver, this);
}
}
