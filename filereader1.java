package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class filereader1 {

	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("Ravali.txt");
		FileReader fr = new FileReader(file); 

	}

	

}
