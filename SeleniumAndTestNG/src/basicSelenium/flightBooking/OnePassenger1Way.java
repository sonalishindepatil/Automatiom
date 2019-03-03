package basicSelenium.flightBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnePassenger1Way 
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
	ChromeDriver dr=new ChromeDriver();
	dr.manage().window().maximize();
	
	//page Load
	dr.get("http://www.newtours.demoaut.com/");
	
	dr.findElement(By.name("userName")).sendKeys("mercury");
	dr.findElement(By.name("password")).sendKeys("mercury");
	dr.findElement(By.name("login")).click();
	
	dr.findElement(By.xpath("//input[@value='oneway']")).click();
	
	//selcet element from list
	//dr.findElement(By.xpath("//select[@name='fromPort']")).sendKeys("London");
	
	 //or using Select Class
	Select sel= new Select(dr.findElement(By.xpath("//select[@name='fromPort']")));
    sel.selectByVisibleText("London");
     
    Select sel1= new Select(dr.findElement(By.xpath("//select[@name='fromMonth']")));
    sel1.selectByValue("4");
    
    Select sel2= new Select(dr.findElement(By.xpath("//select[@name='fromDay']")));
    sel2.selectByValue("10");
    
    Select sel3= new Select(dr.findElement(By.xpath("//select[@name='toPort']")));
    sel3.selectByVisibleText("New York");
    
    //Thread.sleep(2000);
    
    Select sel4= new Select(dr.findElement(By.xpath("//select[@name='toMonth']")));
    sel4.selectByValue("4");
    
    Select sel5= new Select(dr.findElement(By.xpath("//select[@name='toDay']")));
    sel5.selectByValue("22");
    
    dr.findElement(By.xpath("//input[@value='Business']")).click();
	
    Select sel6= new Select(dr.findElement(By.xpath("//select[@name='airline']")));
    sel6.selectByVisibleText("Blue Skies Airlines");
    
    dr.findElement(By.xpath("//input[@name='findFlights']")).click();
	
	dr.findElement(By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']")).click();
	
	dr.findElement(By.xpath("//input[@value='Blue Skies Airlines$631$273$14:30']")).click();
	
	dr.findElement(By.xpath("//input[@name='reserveFlights']")).click();
	
	//Next Page
	dr.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys("Sonali");
	
	dr.findElement(By.xpath("//input[@name='passLast0']")).sendKeys("Patil");
	
	new Select(dr.findElement(By.xpath("//select[@name='pass.0.meal']"))).selectByVisibleText("Bland");
	
	new Select(dr.findElement(By.xpath("//select[@name='creditCard']"))).selectByValue("BA");
	
	dr.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys("32474787");
	
	new Select(dr.findElement(By.xpath("//select[@name='cc_exp_dt_mn']"))).selectByVisibleText("04");
	
	new Select(dr.findElement(By.xpath("//select[@name='cc_exp_dt_yr']"))).selectByVisibleText("2005");
	
	dr.findElement(By.xpath("//input[@name='cc_frst_name']")).sendKeys("Sonali");
	
	dr.findElement(By.xpath("//input[@name='cc_mid_name']")).sendKeys("N");
	
	dr.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys("Patil");
	
	dr.findElement(By.xpath("(//input[@name='ticketLess'])[1]")).click();
	
	dr.findElement(By.xpath("//input[@name='billAddress1']")).sendKeys("Sayaji Soci");
	
	dr.findElement(By.xpath("//input[@name='billAddress2']")).sendKeys("Keshav nagar");
	
	dr.findElement(By.xpath("//input[@name='billCity']")).sendKeys("Pune");
	
	dr.findElement(By.xpath("//input[@name='billState']")).sendKeys("Maharashtra");
	
	dr.findElement(By.xpath("//input[@name='billZip']")).sendKeys("41036");
	
	new Select(dr.findElement(By.xpath("//select[@name='billCountry']"))).selectByValue("92");
	
	dr.findElement(By.xpath("(//input[@name='ticketLess'])[2]")).click();
	 
	
	Thread.sleep(6000);
	
	dr.findElement(By.xpath("//input[@name='buyFlights']")).click();
}
}
