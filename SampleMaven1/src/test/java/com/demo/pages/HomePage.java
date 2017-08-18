package com.demo.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(name  = "firstname")
	private WebElement firstNameObj;
	
	@FindBy(xpath  = "//input[@aria-label='Surname']")
	private WebElement lastName;
	@FindBy(xpath  = "//input[@id='u_0_7']")
	private WebElement userEmail;
	
	@FindBy(name  = "sex")
	private List<WebElement> sexObj;
	
	@FindBy(css  = "input#u_0_e")
	private WebElement password;

	/**
	 * Enter user first name
	 * @param fName
	 */
	public void enterFirstName(String fName){
		firstNameObj.sendKeys(fName);
	}
	
	/**
	 * Enter user Last name
	 * @param fName
	 */
	public void enterLastName(String lName){
		lastName.sendKeys(lName);
	}
	
	/**
	 * Enter user first name
	 * @param fName
	 */
	public void enterEmailName(String email){
		userEmail.sendKeys(email);
	}
	
	public void enterPassord(String pass){
		password.sendKeys(pass);
	}
	
	public void selectSex(int i){
		sexObj.get(i).click();
	}

}
