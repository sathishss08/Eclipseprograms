import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendarhandling {
	
	
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		driver = new ChromeDriver();

		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		
		selectexpectedmonth("January 2025",30);
		
		
		
	
	}
	
	
	public static void selectexpectedmonth(String expecteddate,int date) {
		
	 String monthtoclick =driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
	 
	 
	 System.out.println(monthtoclick);
	 while(!monthtoclick.equalsIgnoreCase(expecteddate))
	 {
		 driver.findElement(By.xpath("//span[text()='Next']")).click();
		 monthtoclick =driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
	 }
	 selectdate(date);
	 
	 
	}
	
	
	public static void selectdate(int date)
	{
		
		if(date<=31)
		
		driver.findElement(By.xpath("//a[text()='"+date+"']")).click();
	}
	

}
