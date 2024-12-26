package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/frame");
		
//		WebElement ele = driver.findElement(By.xpath("//li[@id='iFrame']"));
		
	 driver.switchTo().frame(0);
		
		driver.findElement(By.name("fname")).sendKeys("name");
driver.quit();
	}

}
