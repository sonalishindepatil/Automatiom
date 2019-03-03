package files.Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args)  
	{
		/*Properties or= new Properties();//create obj of Properties cLass and import Properties class
		
		// create obj of FileInputStream which implements InputStream Interface now create its constructor with String parameter
		FileInputStream file=new FileInputStream("D:\\Automation\\BasicCoreJava\\src\\files\\Properties\\ObjectRepository.properties");
		
		//InputStream fill;// interface 
		or.load(file);
		System.out.println(or.getProperty("url"));*/
		
		
		fun1();// this method is throwing exception so use throw exception with main method or handle it with try catch
		
		//OR handling with try catch
		//fun2("D:\\Automation\\BasicCoreJava\\src\\files\\Properties\\ObjectRepository.properties");//there is no exception bcoz handled in fun2 method but that is handled incorrectly
	
	}
	
	public static void fun1() throws IOException
	{
        Properties or= new Properties();//create obj of Properties cLass and import Properties class
		
		// create obj of FileInputStream which implements InputStream Interface now create its constructor with String parameter
		FileInputStream file=new FileInputStream("D:\\Automation\\BasicCoreJava\\src\\files\\Properties\\ObjectRepository.properties");
		
		//InputStream fill;// interface 
		or.load(file);
		System.out.println(or.getProperty("url"));
	}
	
	public static void fun2(String path) 
	{
		try {
        Properties or= new Properties();//create obj of Properties cLass and import Properties class
		
		// create obj of FileInputStream which implements InputStream Interface now create its constructor with String parameter
		FileInputStream file=new FileInputStream(path);
		
		//InputStream fill;// interface 
		or.load(file);
		System.out.println(or.getProperty("url"));
		}catch(Exception e)
		{
			
		}
	}
}
