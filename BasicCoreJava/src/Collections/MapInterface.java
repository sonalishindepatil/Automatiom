package Collections;

import java.util.*;

public class MapInterface {
	public static void main(String[] args) 
	{
		HashMap<String,Integer> map= new HashMap<String,Integer>();
		map.put("sonali", 30966);
		map.put("Epshita",40757);
		map.put("rahul",30995);
		map.put(null,22345);
		
		System.out.println(map.get("sonali"));
		System.out.println(map.get(null));
		
		Set<String> set=map.keySet();
		for(String key:set) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
		//HashTable
		Hashtable<String,String> map2=new Hashtable<String,String>();
		map2.put("username","sonali.shinde@gmail.com");
		map2.put("username","nilesh@gmail.com");//when we  use the same key data will overwrite
		map2.put("password","rahul.shinde@gmail.com");
		//map2.put(null, "ghsgh"); it gives exception
		
		
		System.out.println(map2.get("username"));
		System.out.println(map2.get("password"));
		
		//System.out.println(map2.get(null));
		
	}

}
