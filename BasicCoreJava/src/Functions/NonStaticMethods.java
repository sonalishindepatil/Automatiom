package Functions;

public class NonStaticMethods {

	public static void main(String[] args) {
		
		 NonStaticMethods obj= new NonStaticMethods();
		System.out.println(obj.sum(10,20));
		
	}
	
	public int sum(int a,int b)
	{
		return a+b;
	}
}
