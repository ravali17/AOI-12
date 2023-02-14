 package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {

	public static void main(String[] args) throws IOException  {
		File f=new File("Ravali.txt\\name.txt");
		System.out.println(f.mkdirs());
	System.out.println(f.exists());
//		FileWriter fw = null;
//		try {
//			fw = new FileWriter(f);
//		fw.write("hello");
//		fw.write("im ravali");
//		System.out.println("data written succesfully");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}finally {
//			fw.close();
//	}
	
	
	FileOutputStream fo=new FileOutputStream(f);
	String read="hello Aneyoghasayo";
	fo.write(read.getBytes());
	System.out.println("data written succesfully");
	}
		
		
			

		
	
	

}

