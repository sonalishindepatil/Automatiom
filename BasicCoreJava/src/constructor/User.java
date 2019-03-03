package constructor;

public class User {
	public static void main(String[] args) 
	{
		//car1
		Car car1= new Car("verna",90, "hyundai");
		/*car1.manufacturor="hyundai";
		car1.name="verna";
		car1.speed= 90; */
		car1.drive();
		car1.accelarate();
		
		
		//car2
		
		Car car2= new Car("amaze",120,"honda");
		/*car2.manufacturor="honda";
	    car2.name="amaze";
		car2.speed= 120; */
		
		car2.drive(); 
		car2.accelarate();
		
		Car c= new Car();
				
	}

}
