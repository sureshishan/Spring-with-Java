package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDemo {

	public static void main(String[] args) throws IOException,
			ClassNotFoundException {

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		fis = new FileInputStream("C:/MyPersonal/store/files/Employee.ser");
		ois = new ObjectInputStream(fis);

		Object obj = ois.readObject();
		Employee emp = (Employee) obj;

		System.out.println("Employee Id: " + emp.id);
		System.out.println("Employee name: " + emp.name);
		System.out.println("Employee Salary: " + emp.salary);
		System.out.println("Employee ssn: " + emp.ssn);
		
		fis.close();
		ois.close();
	}

}
