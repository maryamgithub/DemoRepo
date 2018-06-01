package com.library;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ReadProperties {
	WebDriver driver;
	public  String getProperties(String string) throws Exception{
		Properties prop = new Properties();

		FileInputStream ip = new FileInputStream("C:\\Users\\marya\\eclipse-workspace\\ParkingClaculetor\\src\\test\\java\\com\\library\\properties");
		prop.load(ip);
		return null;
}
}
