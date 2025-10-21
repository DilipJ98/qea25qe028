package cognizant.qea25qe028;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileReaderClass {
	public static void main(String[] args) {
			
		try {
			FileReader fRead = new FileReader("C:\\Users\\Dilip\\Desktop\\Ecommerce website - login feature,.txt");
			int charInts;
			String str = "";
			
			while((charInts = fRead.read()) != -1) {
//				System.out.print((char) charInts);
				str+= (char) charInts;
			}
			writeData(str);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
		
	public static void writeData(String str) throws IOException {
		FileWriter writeToFile = new FileWriter("C:\\Users\\Dilip\\Desktop\\testing.txt", true);
		writeToFile.write(str);
		writeToFile.close();
	}
	
}
