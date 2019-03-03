package Collections;

public class LimitationsOfArray {
	public static void main(String[] args) {
		
		int a=10;
		String str="sonali";
		char gender='M';
		boolean status=true;
		
		Object[] obj= new Object[4];
		obj[0]=a;
		obj[1]=str;
		obj[2]=gender;
		obj[3]=status;
		//we can store our class object aiso in object class
		obj[4]=new LimitationsOfArray();
		
	}
	

}
