package eidiko;

import java.util.Comparator;
import java.util.PriorityQueue;


class The_Comparator implements Comparator<String>
{
	public int compare(String str1,String str2)
	{
		String First_str;
		String Second_str;
		First_str =str1;
		Second_str=str2;
		return Second_str.compareTo(First_str);
	}
}


public class PriorityQueue1 
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> pq = new
				PriorityQueue<String>(new The_Comparator());
		
		pq.add("ramana");
		pq.add("raju");
		pq.add("rambabu");         
		pq.add("richa");
		pq.add("ravi");
		pq.add("ramachandra");
		pq.add("rahul");
		pq.add("rohith");
		pq.add("ramu");
		pq.add("rehman");
		pq.add("rahmatullah");
		pq.add("rakul");
		pq.add("rama");
		//pq.add(null);  desen't accept null.
		System.out.println("=====================================================================");
		
		System.out.println("The elements with the highest priority element at front of queue"
			                                                                          + "order:");
		System.out.println("======================================================================");
		          int count=1;
				while(!pq.isEmpty()){
					
				System.out.print(count+" ."+pq.poll());
				System.out.println();
		        count++;
		
		
	}
	
}
}
