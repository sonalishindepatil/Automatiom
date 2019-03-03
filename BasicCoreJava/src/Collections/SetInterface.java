package Collections;

import java.util.*;

public class SetInterface {

	public static void main(String[] args) 
	{
		//Hashset
		HashSet<Integer> set=new  HashSet<> ();
		set.add(10);
		set.add(20);
		set.add(10);
		set.add(20);
		
		for(int a: set)
			System.out.println(a);// not print duplicate value in output
		
		//LinkedHash set
		LinkedHashSet<Integer> set1=new  LinkedHashSet<> ();
		set1.add(10);
		set1.add(20);
		set1.add(10);
		set1.add(20);
		
		for(int a: set1)
			System.out.println(a);//insertion order preserved
		
		//Tree set
		TreeSet<Integer> set2=new  TreeSet<> ();
		set2.add(30);
		set2.add(20);
		set2.add(40);
		set2.add(20);
		
		for(int a: set2)
			System.out.println(a);//output in sorted order
		
	}
}
