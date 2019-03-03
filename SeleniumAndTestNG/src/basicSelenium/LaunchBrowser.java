package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchBrowser {
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
	
	ChromeDriver dr=new ChromeDriver();
	dr.manage().window().maximize();//maximizing page
	
	//navigate or launching url
	dr.get("http://www.newtours.demoaut.com/");
	
	dr.findElement(By.name("userName")).sendKeys("mercury");//using By class we can find elements(username)(that we call locators)
	dr.findElement(By.name("password")).sendKeys("mercury"); //passing value to password text box
	
	dr.findElement(By.name("login")).click();
	
	//To handle or read text area from webpage using absolute xpath
	String str=dr.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font")).getText();
	System.out.println(str);
	
	//To select radio button using relative xpath
	dr.findElement(By.xpath("//input[@value='oneway']")).click();
	
	//To check web element is selected or not
	boolean b=dr.findElement(By.xpath("//input[@value='oneway']")).isSelected();
	System.out.println(b);
	
	//For Drop- Down webelement when its tag is "select"
	//WebElement ele=dr.findElement(By.xpath("//select[@name='passCount']"));
	//Select sel= new Select(ele);
	
	//OR Directly
	Select sel =new Select(dr.findElement(By.xpath("//select[@name='passCount']")));
	sel.selectByVisibleText("3");
}
}
