package com.demo.pages.flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FKHomePage {

	private WebDriver driver;

	/**
	//span[text()='Electronics']
	//*[@id='container']/div/div[1]/div/div[2]/div[1]/div/child::a
	//*[@id='container']/div/div[1]/div/div[2]/div[1]/div/ancestor::div[2]
	 //*[@id='container']/div/div[1]/div/div[2]/div[1]/div/parent::div
	 //*[@id='container']/div/header/div[2]/div/ul/li/a/span[text()='Men']/ancestor::li/preceding::li[1]
	 //*[@id='container']/div/header/div[2]/div/ul/li/a/span[text()='Men']/ancestor::li/preceding-sibling::li[1]
	 //*[@id='container']/div/header/div[2]/div/ul/li/a/span[text()='Men']/ancestor::li/following-sibling::li[1]
	 //*[@id='container']/div/header/div[2]/div/ul/li/a/span[text()='Men']/ancestor::li/following::li[1]
	 div[class='Y5-ZPI'] > div > div>div + div
	 
	 //div[contains(@id,  'ontain')]
	 //div[starts-with(@id, 'con')]
	
	 div[id*='ontain']
	 div[id^='cont']
	 div[id$= 'er']
	 * 
	 */
	public FKHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id='container']/div/header/div[1]/div[2]/div/div/div[2]/form/div/div[1]/div/input")
	private WebElement txtSearch;

	@FindBy(xpath = "//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span")
	private WebElement lnkElectronic;
	// element

	/*
	 * @FindBy(xpath="//div//button[@type='submit']") private WebElement
	 * btnSearch;
	 */

	@FindBy(how = How.XPATH, using = "//div//button[@type='submit']")
	private WebElement btnSearch;

	// element

	public void clickSearch() {

		btnSearch.click();

	}

	public void setSearchText(String txt) {

		txtSearch.sendKeys(txt);

	}

	public void selectElectronics() {

		lnkElectronic.click();

	}

	// functionality for search
}
