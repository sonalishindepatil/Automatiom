package VariableAndDatatype;

public class Concatination {
	public static void main(String[] args) 
	{
		String name= "Sonali";
		String surname ="Shinde";
		int age=30;
		int bike=1;
		
		System.out.println(name+surname);// + works as concatination operator
		System.out.println("My name is "+name+" "+surname);
		System.out.println(age+bike); // + works as arithmatic operator
		System.out.println(name+" "+surname +age+bike);
		System.out.println(name+" "+surname +(age+bike));
		System.out.println(age+bike +name+" "+surname );
	}

}
