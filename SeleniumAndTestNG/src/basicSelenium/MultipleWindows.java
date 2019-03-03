package basicSelenium;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {
	public static void main(String[] args) 
	{
        System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();//maximizing page
		
		//navigate or launching url
		dr.get("https://www.naukri.com/");
		
		//dr.close();   //close focus on main window of naukri ang close it and leave hcl window as it is 
		//dr.quit();    //closes all the window
		
		//gives parent windows id (naukri.com)
		String parent=dr.getWindowHandle();
		System.out.println(parent);
		
		//gives parent as well as child windows id (naukri.com) 
		Set<String>wins=dr.getWindowHandles();
		
		//logic to close child window
		for(String s: wins)
		{
			dr.switchTo().window(s);
			if(!s.equals(parent))
				dr.close();
		}
			//System.out.println(s);
	}

}
