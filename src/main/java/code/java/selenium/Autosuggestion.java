package code.java.selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autosuggestion {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	
	driver.findElement(By.name("q")).sendKeys("amazon");
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@id='Alh6id']//div//li")));
	
	
	
	 List<WebElement> ele =driver.findElements(By.xpath("//div[@id='Alh6id']//div//li"));
	 
	 
	 int nos =ele.size();
	 
	 System.out.println(nos);
	 
	 
	 if(nos>4)
	 {
		 
		 ele.get(nos-4).click();
	 }
	 

	
	
	}

}
