package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		WebDriver  driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		
		WebElement web =driver.findElement(By.id("course"));
		
	web.click();
		Select sel = new Select(web);
		sel.selectByIndex(2);
		
		Thread.sleep(50);
		
		driver.quit();

	}

}
