package testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {


	WebDriver driver ;
	
	@BeforeMethod
	public void myinit() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.navigate().to("https://practicesoftwaretesting.com/");
	}
	
	@AfterMethod
	public void endTest() {
		driver.quit();
	}
	

}
