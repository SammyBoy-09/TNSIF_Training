package org.tnsif.acc.c2tc.userinput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sherley\\git\\repository\\TNSIF_Java\\src\\org\\tnsif\\acc\\c2tc\\userinput\\demo.txt"));
		String data = "";
		while ((data = br.readLine()) != null) {
			System.out.println(data);
		}
		br.close();
	}

}