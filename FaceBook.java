package week2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver\\chromedriver.exe");
	
	//Launch the browser
			ChromeDriver driver = new ChromeDriver();
			
			//Load the URL
			driver.get("https://en-gb.facebook.com/");
			
			//Maximize the window
			driver.manage().window().maximize();
			
             //Thread.sleep(3000);
			
			//create new account
			
			driver.findElement(By.xpath("//div/a[@rel='async']")).click();
			// enter firstname
			driver.findElement(By.name("firstname")).sendKeys("Reshma");
			
			driver.findElement(By.name("lastname")).sendKeys("K");
			
			driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("987098765412");
			
			driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input")).sendKeys("Reshma@2401");
			
			WebElement eledropdown = driver.findElement(By.id("day"));
			
			Select dd = new Select(eledropdown);
			
			dd.selectByValue("24");
	      WebElement eledropdown1 = driver.findElement(By.id("month"));
			
			Select dd1 = new Select(eledropdown1);
			
			dd1.selectByVisibleText("Jan");
			
		    WebElement eledropdown2 = driver.findElement(By.id("year"));
				
			Select dd2 = new Select(eledropdown2);
				
			dd2.selectByVisibleText("1995");
			
		    driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input[@value='1']")).click();
		    
		    driver.findElement(By.name("websubmit")).click();
		    
		    
		    
			
			
			
		  
		   
			
			
			
			
			//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test");
			
		//	driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Leaf");
			
			//driver.findElement(By.id("email"))).sendKeys("Leaf");
			
			
			
			
			
			
	
	}

}
