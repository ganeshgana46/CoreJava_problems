package com.gana.filehandle;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Program2 {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();
		
		Scanner sc = new Scanner(file);
		
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		sc.close();
		
	}

}
