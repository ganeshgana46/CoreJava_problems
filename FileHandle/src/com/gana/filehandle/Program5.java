package com.gana.filehandle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program5 {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(!file.exists())
			file.delete();
			file.createNewFile();
			
			FileOutputStream fos = new FileOutputStream(file);
			String s = "gana";
			for(char ch : s.toCharArray()) {
				fos.write((int)ch);
			}
			//fos.write(71);
			//fos.flush();
			fos.close();
			

	}

}
