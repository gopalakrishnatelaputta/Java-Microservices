package eidiko;

public class Review1 
{
	public static void main(String[] args) {
		String s1="Rakesh";
		String s2="Rakesh";
		System.out.println(s1==s2);//true
		//both s1,s2 are stored in scp with same reference
		//new object will not be created.(== checks hashcode)
		
		System.out.println(s1.equals(s2)); //true
		//content in the Strings are same (equals() checks content in objects())
		
		String s3=new String("ramu");
		String s4=new String("ramu");
		
		System.out.println("=======================================");
		
		System.out.println(s3==s4);// False
		//Two new objects will be created in heap area.
		//hashcode is different for two objects.
		
		System.out.println(s3.equals(s4));  //true
		//content is same.
	}

}
