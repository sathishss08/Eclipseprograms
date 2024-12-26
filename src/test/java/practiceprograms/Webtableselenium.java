package practiceprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtableselenium {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		driver = new FirefoxDriver();
		
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		while(true)
		{
			
			if(driver.findElements(By.xpath("//td[normalize-space()='Canada']")).size()>0)
			
			{
				Thread.sleep(5000);
			selectcheckbox("Canada");
			break;
			}

			else
			{
			WebElement ele1 =	driver.findElement(By.linkText("Next"));
		ele1.click();
		
	
	}}}

	public static void selectcheckbox( String  country) {

		WebElement ele = driver.findElement(By.xpath("//td[text()='" + country+"']/preceding-sibling::td/input[@type= 'checkbox']"));
		ele.click();
	}

}
