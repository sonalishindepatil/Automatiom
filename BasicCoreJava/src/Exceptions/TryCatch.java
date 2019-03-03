package Exceptions;

import java.util.Hashtable;

public class TryCatch {
	public static void main(String[] args) 
	{
		try
		{ //when we resolve first exception of try block then control goes on next statment
		//Arithmetic Exception	
			int i=10;
			int j=5;
			System.out.println(i/j);
			
			//NullPointer Exception
			Hashtable<String,String> table=new Hashtable<String,String>();
			//table.put(null, "sonali");
			//System.out.println(table.get(null));
			
			
			//StringIndexOutof bound
			String str="A";
			System.out.println(str.charAt(1));
			
			//Interrupted exception
			Thread.sleep(5000);
			
		}catch(ArithmeticException e)
		{
			System.out.println("fail :divident is zero");
		}
		catch(NullPointerException e)
		{
			System.out.println("fail :user passed Null key in hashtable");
		}
		
		catch(RuntimeException e)// super Class of checked Exception 
		{
			System.out.println("fail:runtime exception or unchecked exception");
		} 
		catch (InterruptedException e) //unchecked exception
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hello");
	}

}
