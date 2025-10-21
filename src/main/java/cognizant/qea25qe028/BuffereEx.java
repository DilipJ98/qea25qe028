package cognizant.qea25qe028;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BuffereEx {
	public static void main(String[] args) throws IOException {
//		FileReader fReader = new FileReader("C:\\Users\\Dilip\\Desktop\\Ecommerce website - login feature,.txt");
//		BufferedReader reader = new  BufferedReader(fReader);
//		String data;
//		while ((data = reader.readLine()) != null) {
//			System.out.println(data);
//		}
		fileEx();
		
	}
	
	
	public static void fileEx() throws IOException {
		File file = new File("C:\\Users\\Dilip\\Desktop\\Dileep");
		file.mkdir();
		file.delete();
		System.out.println(file.exists());
	}
}
