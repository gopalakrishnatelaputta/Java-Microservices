package eidiko1;

import java.io.FileOutputStream;
import java.io.IOException;

public class Output_StringFormat {
	
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("/home/bandaru/Desktop/Input.txt");
		String s="GOPALA KRISHNA";
		byte b []=s.getBytes();
		fos.write(b);
		fos.close();
		System.out.println("Success...");
		
	}

}
