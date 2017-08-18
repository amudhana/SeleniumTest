package com.demo.pages.flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.demo.util.BaseTest;

public class SearchPage extends BaseTest {

	private WebDriver driver;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// PageFactory.initElements(driver this);

	@FindBy(xpath = "(//select[@class='a_eCSK'])[1]")
	private WebElement selectMinValue;

	public void SelectMinValue(String mv) {
		Select s = new Select(selectMinValue);

		s.selectByValue(mv);
	}

	@FindBy(xpath = "(//select[@class='a_eCSK'])[2]")
	private WebElement selectMaxValue;

	public void selectMaxValue(String i) {
		Select s = new Select(selectMaxValue);
		s.selectByValue(i);
	}
}
