package Functions;

public class AccessModifiers {
	public static void main(String[] args) {
		
		AccessModifiers obj= new AccessModifiers();
		obj.publicMethod();
		obj.privateMethod();
		obj.noAccessMethod();
		obj.protectedMethod();
	}
	
	public void publicMethod()
	{
	System.out.println("public Method");	
	}
	private void privateMethod()
	{
		System.out.println("privateMethod");
	}
	void noAccessMethod()
	{
		System.out.println("noACCESSMethod");
	}
	protected void protectedMethod()
	{
		System.out.println("protectedMethod");
	}

}
