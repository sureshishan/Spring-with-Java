package out;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(
					"C:/MyPersonal/store/files/meanTraining.jpg");
			fos = new FileOutputStream(
					"C:/MyPersonal/store/files/duplicate.jpg");
			int data;
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
				System.out.println("Done.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
