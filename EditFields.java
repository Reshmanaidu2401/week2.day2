package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//Load the URL
		driver.get("http://leafground.com/pages/Edit.html");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//
		WebElement eleEmail= driver.findElement(By.id("email"));
		eleEmail.sendKeys("reshmakv2401@gmail.com");
		
		WebElement append = driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following-sibling::input[@type='text']"));
		append.sendKeys("reshmanaidu2401@gmail.com",Keys.TAB);
		
		String attribute = eleEmail.getAttribute("value");
         System.out.println(attribute);
		
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
        
        WebElement fieldPresent = driver.findElement(By.xpath("//label[contains(text(),'is disabled')]/following-sibling::input"));
        boolean enabled = fieldPresent.isEnabled();
        System.out.println(enabled);
		

	}

}
