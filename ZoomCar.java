package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZoomCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.zoomcar.com/in/bangalore");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		driver.findElement(By.className("placeholder")).click();
		driver.findElement(By.xpath("//h3[text()='Suggested Pick Up Locations']/following::div[1]")).click();
		driver.findElement(By.xpath("//span[text()='round trip']/following::span")).click();
		driver.findElement(By.xpath("//td[contains(text(),'23')]")).click();		
		driver.findElement(By.xpath("//td[contains(text(),'23')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Continue')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Find cars')]")).click();
		String text = driver.findElement(By.xpath("(//h3[text()='Maruti Dzire ()']/following::div[@clPetrolass='price-book-ctr']/div/div)[1]")).getText();
		System.out.println(text);
	}

}
