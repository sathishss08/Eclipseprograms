package practiceprograms;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");

		String parentwindow = driver.getWindowHandle();

		driver.findElement(By.id("home")).click();
		Set<String> windows = driver.getWindowHandles();

		for (String handle : windows)

		{

			driver.switchTo().window(handle);

			String name1 = driver.getCurrentUrl();

			System.out.println(name1);
		}
	}
}
