package eidiko1;

public class String7 {
	
		public static void main(String[] args) {
		String a = "javachamp";
		String b = "javachamp";
		String c = new String("javachamp");
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(b.equals(c));
		System.out.println(b.equals(a));
		
		String a1 = "javachamp";
		String c1 = new String("javachamp");
		System.out.println();
		System.out.println(a1==(c1));
		}
		}


