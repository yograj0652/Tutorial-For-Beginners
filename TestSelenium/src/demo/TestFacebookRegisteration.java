 package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestFacebookRegisteration {
	
	

	public static void main(String arags[])
	{
		 System.setProperty("webdriver.chrome.driver",
	            "C:/Users/yograj/Downloads/chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		
	
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		WebElement elementUsername= driver.findElement(By.id("email"));
		elementUsername.sendKeys("yograj002@gmail.com");
		
		WebElement elementPassword= driver.findElement(By.id("pass"));
		elementPassword.sendKeys("eSignLiveQATest1"); 

		
				
	driver.close();
		
	
			
			
			
		
		
		
	
		
	}
	
	

}
