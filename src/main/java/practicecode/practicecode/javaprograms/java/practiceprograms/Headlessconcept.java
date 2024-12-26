package practiceprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headlessconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");	
		
		
		WebDriver driver = new ChromeDriver(co);
		
		driver.get("https://www.amazon.com");
		
		String name= driver.getTitle();
		
	
		
		System.out.println(name);
		
		
		
		
		

	}

}
