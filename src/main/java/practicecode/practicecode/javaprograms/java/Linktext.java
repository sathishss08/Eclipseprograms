import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import java.util.List;

import org.openqa.selenium.WebElement;

public class Linktext {

	
		static WebDriver driver;
		
		public static void main(String[] args) {

			// open any url
			// get the count of links on the page -- html tag = a
			// print the text of each link on the console
			// but ignore blank text

			driver = new ChromeDriver();
			driver.get("https://www.amazon.com");
			
			By links = By.tagName("a");
			
			List<WebElement> linksList = driver.findElements(links);
			System.out.println(linksList);//[]
			int linksCount = linksList.size();//0
			System.out.println("total links = " + linksCount);
			
			for(int i= 0;i<linksCount;i++) {
				
				String text =linksList.get(i).getText();
				
				if(!text.isEmpty());
				
				System.out.println(text);
				
				
				
				
			}

	}

}
