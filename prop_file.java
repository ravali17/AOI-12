package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class prop_file {

	public static void main(String[] args) throws IOException {
		File f=new File("config.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties p=new Properties();
		p.load(fis);
		String result=p.getProperty("IPADDRESS");
		String result1=p.getProperty("USER");
		System.out.println(result);
		System.out.println(result1);
	}

}
