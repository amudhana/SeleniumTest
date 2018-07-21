package com.demo.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.demo.pages.HomePage;
import com.demo.util.BaseTest;


public class FacebookSignUp extends BaseTest {
	
	@Test
	public void signUpTest(){
		
		HomePage homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.enterFirstName("Anbarasu");
		homePage.enterLastName("LastName");
		homePage.enterPassord("Anbarasu");
		homePage.enterEmailName("Anbarasu@gmail.com");
		/*driver.findElement(By.name("firstname")).sendKeys("Anbarasu");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("LastName");
		driver.findElement(By.xpath("//input[@id='u_0_7']")).sendKeys("Anbarasu");
		driver.findElement(By.cssSelector("input#u_0_e")).sendKeys("");*/
		
		WebElement birthDay = driver.findElement(By.name("birthday_day"));
		Select selectBirthDaya  = new Select(birthDay);
		selectBirthDaya.selectByIndex(1);
		
		new Select(driver.findElement(By.id("month"))).selectByValue("4");;
		
		new Select(driver.findElement(By.id("year"))).selectByVisibleText("2000");;
		
		homePage.selectSex(1);
		
		/*List<WebElement> elements = driver.findElements(By.name("sex"));
		//WebElement a;
	    for (  WebElement a:elements)
	       System.out.println( a.getText());*/
	    
		
		//elements.get(0).click();
		
		//((JavascriptExecutor) driver).executeScript("arguments[0].click();", elements.get(0));
		
		//System.out.println(elements.get(0).isSelected());
		
		
	}

}
