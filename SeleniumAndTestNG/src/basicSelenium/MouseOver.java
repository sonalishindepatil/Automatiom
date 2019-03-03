package basicSelenium;

import java.util.concurrent.TimeUnit;

import javax.swing.event.TreeWillExpandListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MouseOver {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();//maximizing page
		
		//navigate or launching url
		dr.get("https://www.flipkart.com/");
		
		//implicit wait used to aviod NoSuchElementException when page take time to load
		 //dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)	;
				
				
		//To Close Popup window using close button when tag is button and attribute is class
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		//when we don't have attribute to create relative xpath use text()
		WebElement ele=dr.findElement(By.xpath("//span[text()='Men']"));
		
		Actions act=new Actions(dr);
		act.moveToElement(ele).build().perform();
		
		//Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(dr, 2);
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[@title='Shirts']"))));
		
		dr.findElement(By.xpath("//a[@title='Shirts']")).click();
		
		//for Drag and Drop 
		Thread.sleep(3000);
		//wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[2]"))));
		
		//Right to Left Drag-Drop
		act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[2]")), -50, 0).build().perform();
		
		//some times due to system speed we have to put thread.sleep(2000)
		//Left to Right Drag-Drop
		act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]")), 50, 0).build().perform();
		
		//Different way to create Relative Xpath
		
		//span[text(),'TVs & Appliances']
		//span[contains(text(),'Appliances')  and @class='_1QZ6fC _3Lgyp8']
		//span[start-with(text(),'TVs')  and @class='_1QZ6fC _3Lgyp8']
		//a[text()='Top wear']/following'::a[text()='shirts']
		//a[text()='Shirts']/preceding::a[text()='Top wear']
		//a[text()='Top wear']/parent::li/following-sibling::li/a[text()='Shirts']
		//a[text()='Top wear']/../following-sibling::li/a[text()='Shirts']   Note :parent is replaced by ..
	}
}
