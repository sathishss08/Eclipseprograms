package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectexample {
	
	 static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
driver = new ChromeDriver();

driver.get("https://naveenautomationlabs.com/opencart/index.php?route=product/search");
WebElement name = driver.findElement(By.name("category_id"));
name.click();
Select value = new Select(name);

value.selectByVisibleText("Mice and Trackballs");
	}

}
