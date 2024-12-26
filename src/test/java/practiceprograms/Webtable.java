package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable {
	
	static WebDriver driver;

	public  static void selectcheckbox() {
		
	WebElement ele =	driver.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]"));
		
		
		ele.click();
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 driver = new FirefoxDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");
		
		while(true)
		{
			if(driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr[4]/td[4]")).size()>0)
			{
				selectcheckbox();
				
				driver.findElement(By.xpath("//*[@id=\"post-body-2234476329829833035\"]/input")).click();
				
				break;
			}
			
			else {
			String name 	=driver.getTitle();
			
			System.out.println(name);
			}
		}
		

	}

}
