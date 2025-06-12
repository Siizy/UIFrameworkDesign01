package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class CustomerRegistrationTests extends BaseTest{
		
	
	@Test 
	public void newCustomerRegTest() {
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.linkText("Register your account")).click();
		driver.findElement(By.id("first_name")).sendKeys(new Faker().name().firstName());
		driver.findElement(By.id("last_name")).sendKeys(new Faker().name().lastName());
		Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(), "Customer registration");				
	}
	
	@Test 
	public void newCustomerRegTest2() {
				
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.linkText("Register your account")).click();
		driver.findElement(By.id("first_name")).sendKeys(new Faker().name().firstName());
		driver.findElement(By.id("last_name")).sendKeys(new Faker().name().lastName());
		Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(), "Customer registration");
		
	}
	
	

}
