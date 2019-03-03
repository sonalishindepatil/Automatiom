package Oop.abstraction;

	public class User2 
	{
		
	
	public static void main(String[] args) 
	{   
		
		RBI ref =null;
		
		
		String name= bankName();
		
		if(name.equals("SBI"))
		{
		ref= new SBI();
		}else if(name.equals("HDFC"))
		{
			ref= new HDFC();
		} else if (name.equals("City"))
		{
			ref = new City();
		}
		
		//Bank Service- Script
		
		ref.savingAcc();
		ref.currentAcc();
		ref.creditCard();
		ref.debitCard();
		
		   

	}

	public static  String bankName()
	{
		return "SBI";
	}
	
	}


