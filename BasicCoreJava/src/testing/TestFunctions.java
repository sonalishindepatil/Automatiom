package testing;
import Functions.AccessModifiers;

public class TestFunctions extends AccessModifiers
{
	public static void main(String[] args)
	{
		
		AccessModifiers obj= new AccessModifiers();
		obj.publicMethod();
		
		TestFunctions fun= new TestFunctions();
		fun.protectedMethod();//accessible using child class object
		//obj.privateMethod(); no accessible outside the package
		//obj.noAccessModifiers(); not accessible outside the package
		//obj.protectedModifiers(); using child class accessible outside the package
	}

}
