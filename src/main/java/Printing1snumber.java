import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printing1snumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/ref=nav_logo");
	
	List<WebElement> list=driver.findElements(By.tagName("a"));
	
	
	System.out.println("the list of links:"+list.size());
	
	for(WebElement e :list)
	{
	String linkurl =e.getAttribute("href");
	
	try {
		checkbrokenlink(linkurl);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	}
	driver.quit();
	}
	
	public static void checkbrokenlink(String linkurl1) throws IOException
	
	{
	@SuppressWarnings("deprecation")
	URL url = new URL(linkurl1);
	
	HttpURLConnection connection=(HttpURLConnection) url.openConnection();
	
	connection.setConnectTimeout(5000);
	connection.connect();
	
	if(connection.getResponseCode()>=400)
	{
		
		System.out.println(linkurl1+ "---->"+connection.getResponseMessage()+"is a broken link");
	}
	
	else
	{
		System.out.println(linkurl1+"--->"+connection.getResponseMessage());
	}
	
		
	}

	}


