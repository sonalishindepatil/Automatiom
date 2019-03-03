package Oop.abstraction;

public interface RBI extends Modi, SC
{
public void savingAcc();
public void currentAcc();
public void creditCard();
public void debitCard();



/*
  default void method1()
 
{
	we can give definition here which will be added to all implementing classes and 
	this method can be override by user
}
  static void method2()
 {
 can give method definition here which will be added to all implementing 
 classes but that classes can't override it
 }
 */
}
