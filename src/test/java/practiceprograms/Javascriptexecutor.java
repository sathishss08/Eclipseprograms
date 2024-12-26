package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Javascriptexecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.linkedin.com/feed/");
		
		WebElement search =driver.findElement(By.id("ember30"));
		
		JavascriptExecutor js =  ((JavascriptExecutor)driver);
		
		js.executeScript(arguments[0]., args)

	}

}
