package org.adactin;

import org.adactin.bookhotel;
import org.adactin.hotel;
import org.adactin.hotelsearch;
import org.adactin.loginpage;
import org.hamcrest.core.SubstringMatcher;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.sel.BaseClass;

public class adactinjunit extends BaseClass {
	@BeforeClass
	public static void driverlaunch() throws Throwable {
		driver=browerlaunch("chrome", "https://adactin.com/HotelApp/");
	}
	
	@Test
	public void test1() throws Throwable {
		
//		test 1&2
		loginpage l=new loginpage();
		sendkeys(l.getUsername(), "priyanka28");
		sendkeys(l.getPasswrd(), "priyanka28");
		click(l.getLoginbutton());
		hotelsearch hs=new hotelsearch();
		dropDown(hs.getLocation(), "Sydney", "value");
		dropDown(hs.getHotels(), "Hotel Creek", "value");
		dropDown(hs.getRoomtype(), "Standard", "value");
		dropDown(hs.getRoomnos(), "1", "value");
		clear(hs.getIndate());
		sendkeys(hs.getIndate(), "14/03/2020");
		clear(hs.getOutdate());
		sendkeys(hs.getOutdate(), "12/03/2020");
		dropDown(hs.getAdultroom(), "1", "value");
		dropDown(hs.getChildroom(), "1", "value");
		click(hs.getSubmit());
		String em = getText(hs.getErrormessage());
		String em1 = getText(hs.getErrormessage1());
		System.out.println(em);
		System.out.println(em1);
		
		
//		test3
		clear(hs.getIndate());
		sendkeys(hs.getIndate(), "2/03/2020");
		clear(hs.getOutdate());
		sendkeys(hs.getOutdate(), "4/03/2020");
		click(hs.getSubmit());
		hotel h=new hotel();
		click(h.getCancel());
		
//		TakesScreenshot("img1");
		
		
		dropDown(hs.getLocation(), "Sydney", "value");
		String loc = getAttribute(hs.getLocation());
		dropDown(hs.getHotels(), "Hotel Creek", "value");
		dropDown(hs.getRoomtype(), "Standard", "value");
		String rtype = getAttribute(hs.getRoomtype());
		dropDown(hs.getRoomnos(), "1", "value");
		String roomno = getAttribute(hs.getRoomnos());
		clear(hs.getIndate());
		sendkeys(hs.getIndate(), "7/03/2020");
		String ind = getAttribute(hs.getIndate());
		clear(hs.getOutdate());
		sendkeys(hs.getOutdate(), "8/03/2020");
		String outd = getAttribute(hs.getOutdate());
		dropDown(hs.getAdultroom(), "1", "value");
		dropDown(hs.getChildroom(), "1", "value");
		click(hs.getSubmit());
		
//		same location test4
		String loc1 = getAttribute(h.getLocation1());
		if (loc.equalsIgnoreCase(loc1)) {
			System.out.println("location is same");
		}else {
			System.out.println("location not same");
		}
		
//		same arrival and departure date test5
		String arrival = getAttribute(h.getArrivaldate());
		String departure = getAttribute(h.getDeparturedate());
		if (ind.equalsIgnoreCase(arrival)) {
			System.out.println("same arrival date");
		} else {
			System.out.println("different arrival date");
		}
		if (outd.equalsIgnoreCase(departure)) {
			System.out.println("same departure date");
		} else {
			System.out.println("different departure date");
		}
		
//		same room no test6
		String roomno1 = getAttribute(h.getRoomnos1());
		if (roomno1.contains("1") && roomno.contains("1") ) {
			System.out.println("same room no");
		}else {
			System.out.println("room no is not same");
		}
		
//		same roomtype test7
		String rtype1 = getAttribute(h.getRoomtype1());
		if (rtype.equalsIgnoreCase(rtype1)) {
			System.out.println("same room type");
		}else {
			System.out.println("different room type");
		}
		String hoteln1 = getAttribute(h.getHotelname());
		String nfd1 = getAttribute(h.getNoofdays());
		String ppn1 = getAttribute(h.getPricepernight());
		String price = ppn1.substring(6);
		int p = Integer.parseInt(price);
		String ttl1 = getAttribute(h.getTotalprice());
		String pricee = ttl1.substring(6);
		int totall = Integer.parseInt(pricee);
		System.out.println(totall);
		
//		room price test8
		String roomn = roomno1.replace(" Rooms", "");
		int parseInt = Integer.parseInt(roomn);
		String nfd = getAttribute(h.getNoofdays());
		String nfdd = nfd.replace(" Days", "");
		int parseInt3 = Integer.parseInt(nfdd);
		int roomprice=p*parseInt*parseInt3;
		System.out.println(roomprice);
		if (totall==roomprice) {
			System.out.println("expected price and available price is same");
		}else {
			System.out.println("expected price and available price is not same");
		}
		
		
		
		
//		logout test9
//		click(h.getLogout());
		
		
//		test11
		click(h.getSelectbutton());
		click(h.getCon());
		bookhotel b=new bookhotel();
		String hoteln2 = getAttribute(b.getHotelname1());
		String loc2 = getAttribute(b.getLocation2());
		String nfd2 = getAttribute(b.getNoofdays1());
		String ppn2 = getAttribute(b.getPricepernight1());
		String roomno2 = getAttribute(b.getRoomnos2());
		String rtype2 = getAttribute(b.getRoomtype2());
		String ttl2 = getAttribute(b.getTotalprice1());
		if (hoteln1.equalsIgnoreCase(hoteln2)&&loc1.equalsIgnoreCase(loc2)&&nfd1.contains("1")&&nfd2.contains("1")&&ppn1.equalsIgnoreCase(ppn2)&&roomno1.contains("1") && roomno2.contains("1")&&rtype1.equalsIgnoreCase(rtype2)&&ttl1.equalsIgnoreCase(ttl2)) {
			System.out.println("same values in hotel search and book hotel");
		} else {
			System.out.println("values not same in hotel search and book hotel");
		}
		
//		test12
//		String total = ttl2.substring(6);
//		int t = Integer.parseInt(total);
//		int t1=t+(10%t);
		
		
//		test14
		sendkeys(b.getFirstname(), "pk");
		sendkeys(b.getLastname(), "d");
		sendkeys(b.getAddress(), "perambur");
		sendkeys(b.getCreditcardno(), "1234567890123456");
		dropDown(b.getCardtype(), "AMEX", "value");
		dropDown(b.getCardmonth(), "3", "value");
		dropDown(b.getCardyear(), "2022", "value");
		sendkeys(b.getCcv(), "123");
		click(b.getBooknow());
		bookingconfirmation bc=new bookingconfirmation();
		String ordern = getAttribute(bc.getOrderno());
		System.out.println("order no:"+ordern);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
		
	
	
	@AfterClass
	public static void driverquit() {
//		driver.quit();
	}
	
	
}
