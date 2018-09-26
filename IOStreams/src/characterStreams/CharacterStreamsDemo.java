package characterStreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamsDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		FileWriter fw = null;

		fr = new FileReader("C:\\MyPersonal\\store\\files\\myfile.txt");
		fw = new FileWriter("C:\\MyPersonal\\store\\files\\newfile.txt");

		int data;

		while ((data = fr.read()) != -1) {
			fw.write(data);
		}

		fr.close();
		fw.close();

	}
}
