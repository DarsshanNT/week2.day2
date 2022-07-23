package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebtable {
	public static void main(String[] args)  {
		//call WDM for browser driver
				WebDriverManager.chromedriver().setup();
			//launch the browser
				ChromeDriver driver = new ChromeDriver();
			//Load the url
				driver.get("http://erail.in/");
			//maimize the browser
				driver.manage().window().maximize();
			//clear allready text
				driver.findElement(By.id("txtStationFrom")).clear();
			//type and tab value as MAS ,keys.TAB
				driver.findElement(By.id("txtStationFrom")).sendKeys("MAS",Keys.TAB);
			// clear allready text
				driver.findElement(By.id("txtStationTo")).clear();
			//enter the value SBC , keys.Tab	
				driver.findElement(By.id("txtStationTo")).sendKeys("SBC",Keys.TAB);
			//click on sort on date	
				driver.findElement(By.id("chkSelectDateOnly")).click();
			    
				
				WebElement eleTrainName = driver.findElement(By.xpath("//a[text()[normalize-space()='22502']]/following::a"));
				String name = eleTrainName.getText();
				System.out.println(name);
				
		
	}

}
