package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//setup the driver
				WebDriverManager.chromedriver().setup();
				
				//Launch the browser
				ChromeDriver driver = new ChromeDriver();
				
				//Load the URL
				driver.get("http://leaftaps.com/opentaps/control/login");
				
				//Maximize the browser
				driver.manage().window().maximize();
				
				//
				driver.findElement(By.id("username")).sendKeys("DemoCSR");
				
				//
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				driver.findElement(By.className("decorativeSubmit")).click();
				
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				driver.findElement(By.linkText("Leads")).click();
				
				driver.findElement(By.linkText("Find Leads")).click();
				
				driver.findElement(By.xpath("//input[@name='firstName']/parent::div")).sendKeys("Babu");
				
				//driver.findElement(By.name("phoneNumber")).sendKeys("80680804814");
				
				//driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				
				
				


	}

}
