package Assingment2;

public class Test2 {

	public static void main(String[] args) 
	{
		A a = new A();
		B b = new B();

		a.parentMeth();
		a.childMeth();

		b.childMeth();
		a.parentMeth();

	}

}
