package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();//maximizing page
		
		//navigate or launching url
		dr.get("http://www.newtours.demoaut.com/");

		//For Links  web element
		//using linkText()
		//dr.findElement(By.linkText("REGISTER")).click();
		
		//implicit wait used to aviod NoSuchElementException when page take time to load
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)	;
		
		
		//using partialLinkText
		dr.findElement(By.partialLinkText("ISTERasdf")).click();
		
	}

}
