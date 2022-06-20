package rao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
 @Test
	void logintest() {
		l.signup();
		
	}
	
	
	

}
