package com.libraries;

import java.util.NoSuchElementException;



public class BookFlight {
    WebDriver driver;
    public BookFlight(WebDriver driver){
        this.driver = driver;
    }
    public String bookFlight(){
        String status = "Booked Successfully !!! ";
        try {
            driver.findElement(By.xpath("//a[starts-with(@href,'bookflight')]")).click();
            driver.findElement(By.xpath("//a[@href='completepurchase']")).click();
        } catch(NoSuchElementException e){
            status = "Booking Failed !!!";
        }
        return status;
    }
}
