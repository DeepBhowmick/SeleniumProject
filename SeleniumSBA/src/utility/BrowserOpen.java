package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserOpen {
	
	public WebDriver openBrowser(WebDriver driver)
	{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver-v0.18.0-win32\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("http:\\www.demoqa.com");
		return driver;
	}

}
