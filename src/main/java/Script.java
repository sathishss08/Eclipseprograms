import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/ref=nav_logo");
		
//		WebElement searchbox=driver.findElement(By.name("q"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		
		
		

	}

}
