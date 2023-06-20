package com.gana.exceptionHandling2;

import java.io.File;
import java.io.FileOutputStream;

public class Program2 {
//we can use all exceptions in one word ex:Exception and Throwable.
	public static void main(String[] args) throws Exception {
		File file = new File("./sample.txt");
		if(!file.exists())
			file.delete();
			file.createNewFile();
			//they are called resources.
			//Autoclosable
			try(FileOutputStream fos = new FileOutputStream(file)){
				String s = "gana";
				for(char ch : s.toCharArray()) {
					fos.write((int)ch);
				}
			}catch(Exception ex) {
				
			}
			
		
			//fos.write(71);
			//fos.flush();
			//fos.close();
			
	}

}
