package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws IOException{
//		File f=new File("Ravali.txt");
//		System.out.println(f.createNewFile());
//		Scanner Reader=new Scanner(System.in);
//		while(Reader.hasNextLine()) {
//			String data=Reader.nextLine();
//			System.out.println(data);
//		}
//		Reader.close();
//			
			
		FileWriter f=new FileWriter("ravali.txt");
		f.write("");
		f.close();
		System.out.println("files are wriiten succesfully");
		}
		

	}


