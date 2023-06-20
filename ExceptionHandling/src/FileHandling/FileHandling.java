package FileHandling;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.Arrays;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		//creating file by using java
		File file = new File("C:\\Users\\Ganesh P\\Desktop\\GANA certificates");
		System.out.println(file.getParent());
		File file2 = new File(file.getParent()+"resume2.docx");
		System.out.println(file2.createNewFile());
		//System.out.println(file.getAbsolutePath());
		//System.out.println(file.getName());
		//System.out.println(Arrays.toString(file.list()));
		//System.out.println(Arrays.toString(file.listFiles()));
		//System.out.println(file.mkdir());
		//System.out.println(file.mkdirs());
		//System.out.println(file.createNewFile());
		//if we execute again it return "false" because the file already exist.
		
		//if you want to delete file
		//file.delete();
		//System.out.println(file.exists());
		
		//Logic
//		if(file.exists())
//			file.delete();
//		System.out.println(file.createNewFile());	
//		}
	    //System.out.println(file.isHidden());
//		System.out.println(file.canWrite());
//		file.setWritable(true);
//		System.out.println(file.canWrite());
		//System.out.println(new Date(file.lastModified()));
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
        
	}
}