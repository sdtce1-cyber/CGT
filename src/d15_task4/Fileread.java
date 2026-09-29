package d15_task4;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Fileread {
	public static void fileReader() throws FileNotFoundException { 
		FileReader F = new FileReader("Img.png");
		
	}
	public static void main(String[] args) {
		try {
			fileReader();
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}

}





