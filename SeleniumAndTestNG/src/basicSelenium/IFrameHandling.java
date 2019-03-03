package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandling {
public static void main(String[] args) throws InterruptedException 
{
	 System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();//maximizing page
		
		//navigate or launching url
		dr.get("https://paytm.com");
		
		Thread.sleep(2000);
		dr.findElement(By.xpath("//div[contains(text(),'Log In/Sign Up')]")).click();
		
		Thread.sleep(2000);
		//if any element on page is under iframe than we use switchTo.frame
		dr.switchTo().frame(0);
		Thread.sleep(2000);
		dr.findElement(By.xpath("//span[contains(text(),'Login/Signup with mobile number and password')]")).click();
}
}
