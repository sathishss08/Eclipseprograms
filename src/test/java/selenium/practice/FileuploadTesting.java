package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuploadTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		WebElement ele= driver.findElement(By.id("uploadfile"));
		
		ele.sendKeys("C:\\Users\\sathi\\Downloads\\webphoto.jpg");
		
		
		
		

	}

}
