public class Passenger {

	int id;
	String firstName;
	String lastName;

	public Passenger(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public String toString() {
		return "Passenger details are: Id: " + this.id + " firstName: "
				+ this.firstName + " lastName: " + this.lastName;
	}

	public int hashCode() {
		return this.id;
	}

	public boolean equals(Object obj) {

		Passenger passenger = (Passenger) obj;

		if (passenger.id == this.id
				&& passenger.firstName.equals(this.firstName)
				&& passenger.lastName.equals(this.lastName)){
			return true;
		}

			return false;
	}

}
