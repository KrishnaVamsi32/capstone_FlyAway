package com.testLib;

import com.libraries.BookFlight;
import com.libraries.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.libraries.SearchFlight;

import java.awt.print.Book;

public class TestFlyaway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();



	/*	Register r = new Register(driver);
		String reg_status = r.register("krish@123","krish@123","krish@123","kv","Andhra Pradseh","anantapur");
		
		System.out.println(reg_status);
		 */
		Login l = new Login(driver);
		String login_status = l.login("krish@123","krish@123");
		System.out.println(login_status);

		SearchFlight SF = new SearchFlight(driver);
		String searchFlight_status = SF.searchFlight("Bangalore", "Chennai");
		System.out.println(searchFlight_status);
		BookFlight BF = new BookFlight(driver);
		String booking_status = BF.bookFlight();
		System.out.println(searchFlight_status);
	}

}
