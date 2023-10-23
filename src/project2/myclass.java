
package project2;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class myclass {
	WebDriver driver = new ChromeDriver();

	@BeforeTest

	public void mySetup() {
		driver.get("https://www.saucedemo.com/");

		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");

		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		driver.manage().window().maximize();

		List<WebElement> addtoCartButtons = driver.findElements(By.className("btn_primary"));
		
		for(int i =0 ;i<addtoCartButtons.size();i+=2) {
			addtoCartButtons.get(i).click();
			
		}
	}

	@Test()

	public void myFirstTest() {
	}

	@AfterTest
	public void myPostTesting(){
		
	}
	}
	

	

