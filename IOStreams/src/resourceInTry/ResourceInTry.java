package resourceInTry;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class ResourceInTry {

	public static void main(String[] args) {

		int count = 0;

		try (FileReader fr = new FileReader(
				"C:\\MyPersonal\\store\\files\\myfile.txt");
				BufferedReader br = new BufferedReader(fr);) {

			String line;

			while ((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line);
				while (st.hasMoreTokens()) {
					System.out.println(st.nextToken());
					count++;
				}
			}
			System.out.println("Count: " + count);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
