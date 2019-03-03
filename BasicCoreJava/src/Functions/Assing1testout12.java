package Functions;

public class Assing1testout12 {
	

	public static void main(String[] args)
	  {
		int x=0;
		while(true)
		{
		x = increment(x);

		System.out.println("Value of x is --"+x);

		if(x>10)
		break;
        }
	  }

		public static int increment(int i)
		{
		return i+1;
		}

	}


