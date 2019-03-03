package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("http://www.newtours.demoaut.com/");
		dr.findElement(By.linkText("REGISTER")).click();
		
		dr.findElement(By.name("firstName")).sendKeys("Sonali");
		dr.findElement(By.name("lastName")).sendKeys("Patil");
		dr.findElement(By.name("phone")).sendKeys("9923246767");
		dr.findElement(By.name("userName")).sendKeys("sonalishinde@gmail.com");
		dr.findElement(By.name("address1")).sendKeys("Sayaji Society ");
		dr.findElement(By.name("address2")).sendKeys("Keshav Nagar");
		dr.findElement(By.name("city")).sendKeys("Pune ");
		dr.findElement(By.name("state")).sendKeys("Maharashtra ");
		dr.findElement(By.name("postalCode")).sendKeys("41036");
		dr.findElement(By.name("country")).sendKeys("India");
		dr.findElement(By.name("email")).sendKeys("Sonalishinde ");
		dr.findElement(By.name("password")).sendKeys("123456 ");
		dr.findElement(By.name("confirmPassword")).sendKeys("123456");
		dr.findElement(By.name("register")).click();
		
	}

}
