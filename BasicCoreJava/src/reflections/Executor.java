package reflections;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import files.excel.Xls_Reader;

public class Executor {
public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException 
{
	Xls_Reader xl=new Xls_Reader("D:\\UserLogin.xls");
	//String tcName=xl.getCellData("keywords", 2, 1);
	
	String tcName=xl.getCellData("keywords", 2, "TC_Name");
	System.out.println(tcName);
	
	String keyword=xl.getCellData("keywords", 2, "keywords");
    System.out.println(keyword);
    
    String[] keywords=xl.getCellData("keywords", 2, "keywords").split(",");
    
	
	//using Reflection API we can create object of any class at runtime
	
	// Class c= Class.forName("reflections.TC_Banking_01");
	
	Class c= Class.forName("reflections."+tcName);
	
	Object obj=c.newInstance();//object created of 
	Method m=c.getDeclaredMethod(keywords[0]);
	m.invoke(obj);
	
	/*Method m=c.getDeclaredMethod(keywords[1]);
	m.invoke(obj);*/
	  
	
}
}
