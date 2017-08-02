package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckPages {

	public String registration="Registration";
	
	public String ClickRegistration(WebDriver driver){

		driver.findElement(By.linkText(registration)).click();
		return registration;
	}

}
