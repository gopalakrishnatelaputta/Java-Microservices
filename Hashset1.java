package eidiko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Hashset1 
{
	public static void main(String[] args) 
	{
		
		HashSet<String> hs=new HashSet<>();
		
		
		hs.add("Java");
		hs.add("Html");
		hs.add("Css");
		hs.add("JavaScript");
		hs.add("Python");
		hs.add("Devops");
		hs.add("Linux");
		hs.add("Db2");
		hs.add("Sql");
		//hs.add(null);
		//hs.add(null);
		
		
		//Hashset1 h1=new Hashset1();
		
		ArrayList<String> flower_array
		  = new ArrayList<>(hs);
		
		Object[] objects =flower_array.toArray();
		
		System.out.println(Arrays.toString(objects));
		
		//System.out.println(Arrays.toString(objects));
		
	
	
	}
}

