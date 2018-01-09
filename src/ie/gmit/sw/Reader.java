package ie.gmit.sw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Reader{
	public static void main(String[] args) throws IOException {
	// open file input stream
			BufferedReader reader = new BufferedReader(new FileReader(
					"*.txt")); 
			// read file line by line
			String line = null;
			Scanner scanner = null;

			while ((line = reader.readLine()) != null) {
				scanner = new Scanner(line);
				scanner.useDelimiter(",");
				while (scanner.hasNext()) {
					String data = scanner.nextLine();
					
						System.out.println(data);
			}
			
			//close reader
			reader.close();
			
			
		}

}
}
