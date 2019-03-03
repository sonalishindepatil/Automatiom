package basicSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertHandling {

	public static void main(String[] args)
	{
      System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();//maximizing page
		
		//navigate or launching url
		dr.get("D:\\SeleniumRequired\\Practice.html");
		
		Select sel=new Select(dr.findElement(By.id("anand")));
		sel.selectByIndex(2);
		sel.selectByIndex(3);
		sel.selectByIndex(4);
		
		sel.deselectAll();
		
		//we cant create obj of javascriptexecutor (interface) for that we have to type cast obj of class
		JavascriptExecutor js= (JavascriptExecutor)dr;
		
		WebElement ele=dr.findElement(By.tagName("button"));
		
		//for Scroll Down
		//scrollIntoView() is function of javascript take from javascript doc
		js.executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();
		
		Alert al=dr.switchTo().alert()	;
		 
		//getting msg whatever displayed on alert window
		String str=al.getText();
		System.out.println(str);
		
		al.accept();
		//al.dismiss();
		
	}
	
}
