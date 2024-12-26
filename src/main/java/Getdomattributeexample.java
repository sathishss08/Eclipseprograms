import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getdomattributeexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
WebDriver driver = new FirefoxDriver();

driver.get("https://www.amazon.in/s?k=laptop&crid=34KQFGVT9DXBM&sprefix=laptop+%2Caps%2C225&ref=nb_sb_noss_2");


WebElement element =driver.findElement(By.id("twotabsearchtextbox"));


Thread.sleep(5000);


element.clear();

element.sendKeys("shoe");


String name1=element.getDomProperty("value");

System.out.println(name1);


String name = element.getDomAttribute("value");

System.out.println(name);







driver.quit();



	}

}
