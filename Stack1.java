package eidiko;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;





public class Stack1 
{
	public static void main(String[] args) 
	{
		Stack<String>s=new Stack<>();
		
		s.push("kotak");
		s.push("gramin vikas");
		s.push("hdfc");
		s.push("sbi");
		s.push("axis");
		s.push("idfc");
		s.push("central bank");
		s.push("canara");
		s.push("indian overseas");
		s.push("union");
		s.push("punjab bank");
		
		Iterator<String> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		Collections.sort(s);
		System.out.println("===========================================================");
		System.out.println("After the sorting the data  :");
		System.out.println("=====================================================================");
		Iterator<String> itr1=s.iterator();
		int count=1;
		while(itr1.hasNext())
		{
			System.out.println(count+" ."+itr1.next());
			count++;
		}
		
		s.remove(5);
		s.remove(3);
		System.out.println("==============================================================");
		System.out.println("After removing the elements  :");
		System.out.println("===============================================================");
		Iterator<String> itr2=s.iterator();
		int count1=1;
		while(itr2.hasNext())
		{
			System.out.println(count1+" ."+itr2.next());
			count1++;
		}
		System.out.println("=======================================================");
		//System.out.println(" type of stack  ");
		//s.GetType();
		System.out.println("=====================================================");
		s.pop();
		System.out.println("=====================================================");
		s.peek();
		System.out.println(s);
		
		
	}

}
