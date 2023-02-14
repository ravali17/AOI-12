package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fileReader {

	public static void main(String[] args) throws IOException {
		File f=new File("java\\name.txt");
//		FileReader fr=new FileReader(f);
//		int i;
//		while((i=fr.read())!=-1);
//		System.out.println((char)i);
//		fr.close();
		FileInputStream fs=new FileInputStream(f);
		BufferedReader br=new BufferedReader(new InputStreamReader(fs)); 
		String read;
		while((read=br.readLine())!=null) {
			System.out.println(read);
		}
	}
	

}
