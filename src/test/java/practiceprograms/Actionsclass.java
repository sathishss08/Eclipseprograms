package practiceprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/contactus.html");
		
		
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(driver.findElement(null))
		
	
	}

}
