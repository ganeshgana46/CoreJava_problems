package com.gana.filehandle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class Program6 {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(!file.exists())
			file.delete();
			file.createNewFile();
			
			FileWriter fw =  new FileWriter(file);
			String s = "ghgjfe";
			fw.write(s);
			
			
			fw.flush();
	        
			fw.close();
			
			}
			//fos.write(71);
			//
	}



