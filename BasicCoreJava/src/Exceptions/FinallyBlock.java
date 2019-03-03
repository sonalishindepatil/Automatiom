package Exceptions;

public class FinallyBlock {
	public static void main(String[] args) 
	{
		try 
		{
			int a=10;
			int b=0;  //take b=0 and execute
			int c=a/b;
			System.out.println(c);
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}finally
		{
			System.out.println("executing Finally block");
		}
		
		fun1();
		
	}
	
	/*public static void fun1() throws Exception //it will give exception on compile time
	{
		
	}
	
	public static void fun2() throws RuntimeException //it will not give exception on compile time
	{
		
	}*/
	public static void fun1() throws Error
	{
		
	}
	  
}

