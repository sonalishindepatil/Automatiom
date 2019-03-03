package Functions;

public class FunClass1 {

	public static void main(String[] args) {
		
		int add=sum(10,20);
		System.out.println(add);
        //add=sum(30,40);
        System.out.println(add);

	}
	
	//user define method
	public static int sum(int a ,int b)   //signature of method
	{
		//int a=10;
		//int b=20;
		 int sum=a+b;
		// System.out.println(sum);
		 return sum;
		 
		 
		/* int c=30;
	    	int d=40;
		 System.out.println(c+d);
        */
	}
}
