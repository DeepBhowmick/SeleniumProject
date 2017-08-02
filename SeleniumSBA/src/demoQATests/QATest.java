package demoQATests;
import utility.ExcelRead;
import homepage.CheckPages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


import utility.BrowserOpen;

public class QATest {
	
	WebDriver driver;
	
	@Test
	public void test1()
	{
		BrowserOpen brOpen= new BrowserOpen();
		driver= brOpen.openBrowser(driver);
		String ExpectedTitle="Demoqa | Just another WordPress site";
		String ActualTitle=driver.getTitle();
	    try{
			Assert.assertEquals(ActualTitle, ExpectedTitle);
			System.out.println(ActualTitle +" " +"is matched with Expected title");
		}
		catch(AssertionError e){
			String x=e.getMessage();
			System.out.println(x);
		}
	
				
	}
    @Test
    public void test2()
       
    {
       	
    CheckPages reg=new CheckPages();
    reg.ClickRegistration(driver);
       String ExpectedTitleRegpage="Registration|Demoqa";
       String ActualTitleRegpage=driver.getTitle();
       
       if (ExpectedTitleRegpage!=ActualTitleRegpage)
       {
    	   System.out.println("Wrong page opened");
       }
       else
    	   System.out.println("I am in Registration page");
    }
	@Test
	public void test3() throws IOException
	{
	ExcelRead data=new ExcelRead();
	String s1[][]=data.ReadExcel(1, 0);
	/*String s3=data.ReadExcel(2, 3);
	String s4=data.ReadExcel(2, 4);
	String s5=data.ReadExcel(2, 5);
	String s6=data.ReadExcel(2, 6);
	String s7=data.ReadExcel(2, 7);	
	String s8=data.ReadExcel(2, 8);	*/
	driver.findElement(By.xpath("//input[@id='name_3_firstname']")).sendKeys(s1[1][0]);
	driver.findElement(By.xpath("//input[@id='name_3_lastname']")).sendKeys(s1[1][1]);
	driver.findElement(By.xpath("//input[@id='phone_9']")).sendKeys(s1[1][2]);
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(s1[1][3]);
	driver.findElement(By.xpath("//input[@id='email_1']")).sendKeys(s1[1][4]);
	driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys(s1[1][5]);
	driver.findElement(By.xpath("//input[@id='password_2']")).sendKeys(s1[1][6]);
	driver.findElement(By.xpath("//input[@id='confirm_password_password_2']")).sendKeys(s1[1][7]);
	driver.findElement(By.xpath("//input[@value='single']")).click();
	
		}
	
	
}
