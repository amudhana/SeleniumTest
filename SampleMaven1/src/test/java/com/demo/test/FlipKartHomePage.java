package com.demo.test;
import com.demo.pages.flipkart.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.demo.pages.HomePage;
import com.demo.util.BaseTest;


public class FlipKartHomePage extends BaseTest {
	
	@Test
	public void HomePageSearch() throws InterruptedException{
		
		//FKHomePage FKHomePage = PageFactory.initElements(driver, FKHomePage.class);
		
		FKHomePage fKHomePage = new FKHomePage(driver);
		
		fKHomePage.setSearchText("front load wasing machine");
		fKHomePage.clickSearch();
		
		SearchPage s = new SearchPage(driver);
		Thread.sleep(20000);
		s.SelectMinValue(("10000"));
		Thread.sleep(20000);
		s.selectMaxValue("15000");
				
	}

}
