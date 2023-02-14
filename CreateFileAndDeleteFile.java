package FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFileAndDeleteFile {

	public static void main(String[] args) throws IOException {
		File f=new File("Ravali.txt");
//		if(f.createNewFile()) {
//			System.out.println("file is created:"+f.getName());
//		}
//			else {
//				System.out.println("file is already created");
//			}
		
		if(f.delete()) {
			System.out.println("file is deleted:"+f.getName());
			}
				else {
					System.out.println("failed to delete the file");
					System.out.println("file deletion failed");
				
		}
		}

	}


