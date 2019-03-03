package Oop.abstraction;

public class Demo {

	public static void main(String[] args) 
	{
		
		Sprint3 obj= new Sprint3();
		obj.compose();
		obj.send();
		obj.attachment();
		obj.forward();
		obj.reply();
		
		//reference of super Class = object of child class
		OutLook obj2= new Sprint3();//concept of runtime Polymorphism
		obj2.compose();
		obj2.send();
		obj2.attachment();
		obj2.forward();
		obj2.reply();
		
		obj2.attachment();
		
		obj.newMethod();   //refernce of child class can call newly add method in child class
		//obj2.newMethod() can't call method of child class which is not overredden from super class
	}
}
