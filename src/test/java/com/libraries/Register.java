package com.libraries;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;


public class Register {

	WebDriver driver ;
	String URL = "http://localhost:8080/FlyAway/signup";

	public  Register(WebDriver driver){
		this.driver = driver ;

	}
	
	public String register(String email,String pass,String con_pass,String name,String address,String city) {
		String status = "Register = TRUE" ; 
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
		driver.get(URL);
		driver.findElement(By.name("email_id")).sendKeys(email);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.name("pwd2")).sendKeys(con_pass);
		driver.findElement(By.name("name")).sendKeys(name);
		driver.findElement(By.name("address")).sendKeys(address);
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.xpath("//button[text()='Signup']")).click();
		
		try {
			driver.findElement(By.linkText("Login to continue checking flights"));
		} catch(NoSuchElementException e){
			status = "Register = FAlSE";
		}
		return status;
		
	}
	
}
