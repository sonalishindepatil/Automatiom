package Functions;

public class Overloading 
{

	public static void main(String[] args) 
	{
		System.out.println(sum(10,20));
		System.out.println(sum(10,20,30));
	}
	
	public static int sum(int a , int b)
	{
		return a+b;
	}
	
	public static int sum(int a, int b,int c)
	{
		return a+b+c;
	}
	public static void message(int age,String name)
	{
		
	}
	public static int message(String name, int age)//not overloading
	{
		return 10;
	}
}

