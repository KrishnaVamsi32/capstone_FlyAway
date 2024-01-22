package com.libraries;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;


public class Login {

	WebDriver driver ;
	String URL  = "http://localhost:8080/FlyAway/login";
	public  Login(WebDriver driver){
		this.driver = driver ;

	}
	public String login(String email, String password) {
		String status = "Login - TRUE"; 
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        
		driver.get(URL);
		driver.findElement(By.name("email_id")).sendKeys(email);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		try {
			driver.findElement(By.linkText("Dashboard"));
		} catch(NoSuchElementException e){
			status = "Login - FAlSE";
		}
		return status;
	}
		
}
