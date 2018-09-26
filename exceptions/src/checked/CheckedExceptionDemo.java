package checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	void readFile() throws FileNotFoundException {

		FileInputStream fis = new FileInputStream("");
	}

	public static void main(String[] args) throws FileNotFoundException {
		CheckedExceptionDemo ced = new CheckedExceptionDemo();

		ced.readFile();

		System.out.println("This should be printed.");
	}

}
