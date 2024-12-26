package practiceprograms;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class learnwaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://letcode.in/waits");

		driver.findElement(By.xpath("//button[contains(text(),'Simple Alert')]")).click();

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.alertIsPresent());

		Alert name = driver.switchTo().alert();
		String value = name.getText();
		
		

		if (value.contains("I'm here, just to say")) {

			System.out.println("got the value");
		}

		else {

			System.out.println("the value not found");
		}
		
		name.accept();
		driver.quit();
		
	}
	

}
