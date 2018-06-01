package com.parking;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.library.BasePage;
import com.library.ParkingLibrary;
import com.library.ReadProperties;

public class ParkingCalculetorTest extends BasePage{

	WebDriver driver;
	public ParkingLibrary myLib;
	public ReadProperties prop;
		
	@Test
	public void test() throws Exception {
	driver.get("http://adam.goucher.ca/parkcalc/");
	String websiteTitle = driver.getTitle();
	System.out.println("This is webSite title " + websiteTitle);
	String expectedwebsiteTitle = "Parking Calculator";
	assertEquals(websiteTitle, expectedwebsiteTitle);

	driver.findElement(By.id(prop.getProperties("enterytime_id"))).sendKeys(prop.getProperties("10:30"));
	myLib.customWait(2);
	driver.findElement(By.name(prop.getProperties("enterytimeam_name"))).click();
	myLib.customWait(2);
	driver.findElement(By.id(prop.getProperties("enterydate_id"))).sendKeys(prop.getProperties("07/07/2018"));
	myLib.customWait(2);
	driver.findElement(By.id(prop.getProperties("exittime_id"))).sendKeys(prop.getProperties("14:20"));
	myLib.customWait(2);
	driver.findElement(By.xpath(prop.getProperties("exittimepm_xpath"))).click();
	myLib.customWait(2);
	driver.findElement(By.id(prop.getProperties("livingdate_id"))).sendKeys(prop.getProperties("07/07/2018"));
	myLib.customWait(2);
	
	}
	
}
