package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		// Step 3: Load the URL https://en-gb.facebook.com/
		// Step 4: Maximise the window
		// Step 5: Add implicit wait
		// Step 6: Click on Create New Account button
		// Step 7: Enter the first name
		// Step 8: Enter the last name
		// Step 9: Enter the mobile number
		// Step 10: Enterthe password
		// Step 11: Handle all the three drop downs
		// Step 12: Select the radio button "Female" 
		            //( A normal click will do for this step) 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Raghu");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@ aria-label='Mobile number or email address']")).sendKeys("6381027449");
		driver.findElement(By.xpath("//input[@ aria-label='New password']")).sendKeys("raghuram12");
	WebElement day = driver.findElement(By.id("day"));
	Select select=new Select(day);
	select.selectByValue("15");
	WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
	Select select1 = new Select(month);
	select1.selectByValue("7");
	WebElement year = driver.findElement(By.id("year"));
	Select select2 =new Select(year);
	select2.selectByValue("2001");
	
		driver.findElement(By.xpath("//label[text()='Female']")).click();	
		driver.findElement(By.name("websubmit")).click();
	}

}
