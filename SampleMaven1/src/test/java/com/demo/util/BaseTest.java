package com.demo.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
//test the changes
public class BaseTest {

	protected WebDriver driver;
	private String appURL;

	enum DriverType {
		Firefox, IE, Chrome
	}

	@BeforeClass	
	public void setUp() throws Exception {
		
		String	browserType = Configuration.readConfig("Browser");		

		this.appURL = Configuration.readConfig("AppUrl");

		if (DriverType.Firefox.toString().toLowerCase().equals(browserType.toLowerCase())) {
			System.setProperty("webdriver.gecko.driver",
					Utilities.getPath() + "//src//test//resources//webdriver/geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (DriverType.IE.toString().toLowerCase().equals(browserType.toLowerCase())) {
			System.setProperty("webdriver.ie.driver",
					Utilities.getPath() + "//src//test//resources//webdriver/IEDriverServer.exe");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			driver = new InternetExplorerDriver(capabilities);
		}

		else if (DriverType.Chrome.toString().toLowerCase().equals(browserType.toLowerCase())) {
			System.setProperty("webdriver.chrome.driver",
					Utilities.getPath() + "/src//test//resources//webdriver/chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			throw new Exception("Please pass valied browser type value");
		}

		// Maximize window
		driver.manage().window().maximize();

		// Delete cookies
		driver.manage().deleteAllCookies();
		
		driver.navigate().to(appURL);

	}
}
