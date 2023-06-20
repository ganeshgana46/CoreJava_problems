package com.gana.filehandle;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class Program3 {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();
		
		FileReader fr = new FileReader(file);
		int asciiCode;
		while((asciiCode = fr.read())!= -1) {
			System.out.print((char)asciiCode);

	}
		fr.close();

}
}
