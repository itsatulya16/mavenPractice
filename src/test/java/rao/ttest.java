package rao;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
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
		 
		 l=new login(driver);
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@BeforeMethod
	void launchbaby() {
		driver.get("https://www.facebook.com/login/web/");
	}
 @Test (invocationCount=2,priority=0)
	void logintest() {
		l.signup();
	//	String exp="https://www.facebook.com/r.php?locale=en_GB&display=page";
		//Assert.assertEquals(driver.getCurrentUrl(),exp );
		
	}
 @Test(priority=1, dependsOnMethods="logintest")
 void backtest() {
	 driver.navigate().back();
	 
 }
 @AfterMethod
 void closeitbabes() {
	 driver.close();
 }
	
	
	

}
