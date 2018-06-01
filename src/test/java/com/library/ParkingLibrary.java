package com.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ParkingLibrary {
	WebDriver driver;

	/***
	 * This method stopping java thread by given seconds
	 * 
	 * @param inSeconds
	 * @throws Exception
	 */
	public void customWait(double inSeconds) throws Exception {
		Thread.sleep((long) (inSeconds * 1000));
	}

	/***
	 * This method selects drop-down elements using visible text option
	 * 
	 * @param by
	 * @param userOptionValue
	 * @throws Exception
	 */
	public void selectDropDown(By by, String userOptionValue) throws Exception {
		Select dropdown = new Select(driver.findElement(by));
		dropdown.selectByVisibleText(userOptionValue);
		System.out.println("Selecting '" + userOptionValue + "'");
		customWait(2);
	}

}
