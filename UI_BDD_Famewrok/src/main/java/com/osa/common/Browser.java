package com.osa.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import bsh.commands.dir;

public class Browser {
	public static WebDriver dr;

public static WebDriver openBrowser() {
	 System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
	 dr=new ChromeDriver();
	 dr.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 dr.manage().window().maximize();
	 return dr; 
  }

public void closeBrowser() {
	dr.close();
}
}
