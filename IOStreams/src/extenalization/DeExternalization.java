package extenalization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeExternalization {

	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois =  null;

		try {
			fis = new FileInputStream(
					"C://Users//suresh_b2//Desktop//files//person_ext.ser");
			ois = new ObjectInputStream(fis);
			Person p = (Person) ois.readObject();
			System.out.println(p.getId());
			System.out.println(p.getName());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				fis.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
