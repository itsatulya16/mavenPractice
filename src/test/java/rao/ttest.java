package rao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import babu.login;

public class ttest {
	WebDriver driver;
	login l;
	
	@BeforeClass
	public void setup() {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\Downloads\\chromedriver_win32\\chromedriver1.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/login/web/");
		 l=new login(driver);
	}
 @Test (priority=0)
	void logintest() {
		l.signup();
		String exp="https://www.facebook.com/r.php?locale=en_GB&display=page";
		Assert.assertEquals(driver.getCurrentUrl(),exp );
		
	}
 @Test(priority=1)
 void backtest() {
	 driver.navigate().back();
 }
	
	
	

}
