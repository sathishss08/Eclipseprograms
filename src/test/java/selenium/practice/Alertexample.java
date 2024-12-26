package selenium.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alertexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
//		ChromeOptions option = new ChromeOptions();
//		option.addArguments("--headless");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
	WebElement as= 	driver.findElement(By.id("alertBox"));
		
	as.click();
	Alert as1 =driver.switchTo().alert();
	
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	as1.accept();
	
	
		
		
	}

}
