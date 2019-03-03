package Loops;

public class Assin1Loops {
	public static void main(String[] args) 
	{  
		Assin1Loops obj = new Assin1Loops();
		obj.evenNo();
		obj.noDiv5();
		obj.sumOf100No();
		obj.pattern();
	}
	
	// 2)Write a for loop to print even numbers bet ween 1 to 100
	public  void evenNo()
	{
		System.out.println("Even no between 1 to 100");
		for(int i=1; i<=100;i++)
		{
			if((i%2)!= 0)
				System.out.println(i);
		}
	}
	 
	//3)Write a for loop which prints numbers from 1 to 100 but if the number is divisible by 5, it prints 'divisble by 5 followd by that number'
	public void noDiv5()
	{
		System.out.println("No divisible by 5");
		for(int i=1; i<=100;i++)
		{
			if((i%5)!= 0)
				System.out.println(i);
			else 
				System.out.println(i + " is divisible by 5 ");
		}
	}
	
	//4) Write a for loop to find the sum of first 100 numbers(1 to 100)
	public void sumOf100No()
	{
		System.out.println("Sum of first 100 no");
		int sum=0;
		for(int i=1; i<=100;i++)
		{
			sum=sum+i;
		}
				System.out.println("Sum is ="+sum);
	}
	
	//5) Write program to display following output
	public void pattern()
	{
		System.out.println("pattern is");
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(j);
			System.out.println();
		}
	}
}
