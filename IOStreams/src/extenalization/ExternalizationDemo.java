package extenalization;

import java.io.Externalizable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizationDemo {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {

			Person p = new Person();
			p.setId(1);
			p.setName("Suresh");
			fos = new FileOutputStream(
					"C:\\Users\\suresh_b2\\Desktop\\files\\person_ext.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(p);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

class Person implements Externalizable {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		System.out.println("inside write external.");
		out.writeInt(this.id);
		out.writeObject(this.name);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		System.out.println("inside readExternal");
		this.id = in.readInt();
		this.name = in.readObject().toString();
	}

	public Person() {
		System.out.println("No atgumented constructor...");
	}

}
