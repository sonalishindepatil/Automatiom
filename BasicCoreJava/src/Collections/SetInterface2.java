package Collections;

import java.util.*;

public class SetInterface2 {
	public static void main(String[] args) 
	{
		//HashSet
		HashSet<String> set=new HashSet<>();
		set.add("sonali");
		set.add("rahul");
		set.add("ishu");
		set.add("sonali");
		
		for(String s:set)
			System.out.println(s);// it will give random but unique value
		
		//Tree set
		Set<String> set1=new TreeSet<>();//here we are using refrence of Set Interface and object of TreeSet class
		set1.add("sonali");
		set1.add("rahul");
		set1.add("ishu");
		set1.add("sonali");
		
		for(String s:set1)
			System.out.println(s);// it will give unique data value in assending order
		
		//LinkedHashSet
		Set<String> set2=new LinkedHashSet<>();//here we are using refrence of Set Interface and object of TreeSet class
		set2.add("sonali");
		set2.add("rahul");
		set2.add("ishu");
		set2.add("sonali");
		
		for(String s:set2)
			System.out.println(s);// it will give unique data value in order of insertion
		
    }

}
