package com.gana.filehandle;

import java.io.File;
import java.io.IOException;
import java.io.FileInputStream;

public class program1 {
	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();
		
		//it is a class
		FileInputStream fis = new FileInputStream(file);
		int asciiCode;
		while((asciiCode = fis.read())!= -1) {
			System.out.print((char)asciiCode);
			
		}
		//After this we have to stop here(Data leakage)
		fis.close();
		//only first character printed in ascii values
		//System.out.print((char)fis.read());
	}

}
