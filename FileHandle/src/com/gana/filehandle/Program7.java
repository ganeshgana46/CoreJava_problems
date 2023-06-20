package com.gana.filehandle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program7 {

	public static void main(String[] args) throws IOException {
		File file = new File("./sample.txt");
		if(!file.exists())
			file.delete();
			file.createNewFile();
			
			FileWriter fr = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fr);
			String s = "gyyafjfehfjjhfdsjgf";
			bw.write(s);
			bw.flush();
			bw.close();
			}

}
