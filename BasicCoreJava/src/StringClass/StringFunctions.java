package StringClass;

public class StringFunctions {
	public static void main(String[] args) 
	{
		String name=" sonali ";
		String name2="Sonali";
		String name3="Sonali Patil";
		String name4="sonali@Patil@Keshavnagar@Pune";
		String name5="sonaliokpatilokkeshavnagarokpune";
		String name6="anand";
		
		//length
		int l=name.length();
		System.out.println(l);
		
		//charA
		char c=name.charAt(1);
		System.out.println(c);
		
		//equals and equalsIgnoreCase
        System.out.println(name.equals(name2));
        System.out.println(name.equalsIgnoreCase(name2));
        
        //Trim
        System.out.println(name);
        System.out.println(name.trim());
        
        //subString
        System.out.println(name3.substring(6));
        System.out.println(name3.substring(0, 5));
        
        //Replace
        System.out.println(name3.replace('a','b'));
		System.out.println(name4.replace("@", "  "));
		System.out.println(name5.replace("ok", "its"));
		
		//split
		
		String[] str=name5.split("ok");
		
		for(String s:str)
		{
			System.out.println(s);
		}
		
		String[] str1=name6.split("a");
		
		System.out.println(str1.length);
		
		
		//one line code for getting how many times a char repeats
		System.out.println(name6.length()-(name6.replace("a","")).length());
		
		
	}

}
