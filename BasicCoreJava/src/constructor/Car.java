package constructor;

public class Car {

	//instance variable
	String name;
	int speed;
	String manufacturor;
	
	//class variable
	static int wheels =4;
	
	public Car(String name, int speed, String manufacturor)  //default constructor override by us
	{
		this.name=name;
		this.speed=speed;
		this.manufacturor= manufacturor;
	}
	public Car()
	{
		
	}
	
	public void drive()
	{
     System.out.println("Drive "+manufacturor+" "+name+" car at the speed of "+speed);      

	}
	public void accelarate()
	{
		System.out.println("accelarate"+" "+manufacturor+" "+ name +" car with "+wheels +"wheels");
	}
}
