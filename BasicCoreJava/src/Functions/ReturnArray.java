package Functions;

public class ReturnArray {
	public static void main(String[] args) {
		
		String[][] str1=test();
		//for itterating 2-D array
		for(int r=0;r< str1.length;r++)
		{
			for (int c=0; c<str1[r].length;c++)
			{
				System.out.println(str1[r][c]);
			}
		}
		
		ReturnArray obj=test2();
		
		
	}// main method closing
	
	   //function returning String 2-D array
	public static String[][] test()
	{
		String [][] str ={{"U1","P1","A1"},{"U2","P2","A2"},{"U3","P3","A3"}};
		return str;
	}
	
	//fuction returning Non primitive datatype(object) 
	public static ReturnArray test2()
	{
		return new ReturnArray();      //creating object of class and returning that
	}
	
	//function returning String value (typr of String class)
	public static String test3()
	{
		return "test Message";
		
	}
	
	//function returning int value (primitive data type)
   public static int sum(int a,int b)
   {
	   return(a+b);
   }
}
