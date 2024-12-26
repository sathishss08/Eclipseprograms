package practiceprograms;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SScreenshot {
	
	public static void main(String[] args) {
		
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		TakesScreenshot ts = ((TakesScreenshot)driver);
 
 File sourcefile =ts.getScreenshotAs(OutputType.FILE);
 
 File desfile = new File("./Screenshot/img1.jpg");
 try {
	FileHandler.copy(sourcefile, desfile);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	
	
	driver.findElement(By.xpath("//div[@id='nav-xshop']//a[.='Amazon Pay']"));
	
File fs	= ts.getScreenshotAs(OutputType.FILE);

File des = new File("./screenshot/img2.png");

try {
	FileHandler.copy(fs, des);
} catch (IOException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
}
}
		 

 
	

		

		
				
	}

}
