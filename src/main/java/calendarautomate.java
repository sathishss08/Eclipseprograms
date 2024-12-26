import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarautomate {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		
		

		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		
		Thread.sleep(4000);
		
		
		driver.findElement(By.id("datepicker")).click();
		selectexpecteddate("February 2025",8);
		
		

		

		

	}
	
	
	public static void selectexpecteddate( String expected ,int date)
	{
		
	String	name =driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
	
	while(!name.equalsIgnoreCase(expected))
	{
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		name =driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
		
	}
	
	selectdate(date);
		
	}

	public static void selectdate(int date)

	{

		driver.findElement(By.xpath("//a[text()='" + date +"']")).click();
	}

	

}
