package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/search");
		driver.findElement(By.xpath("//input[@id='description']")).click();
		
		
	}

}
