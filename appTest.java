package mavenHris;

import junit.framework.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
public class appTest extends app {
	WebDriver driver;
	app hrisLogin;

	@BeforeClass
	public void launchBrowser(){
		driver = new ChromeDriver();
		driver.get("https://hris.qainfotech.com/login.php");
	}
	@AfterClass
	public void closeBrowser(){
		driver.quit();
	}
	@Test(expectedExceptions = NoSuchElementException.class)
	public void login() {
		hrisLogin.loginForm("kanikagosain","Kanika@321#");
		Assert.assertFalse(hrisLogin.isDisplayed());
	}
}
