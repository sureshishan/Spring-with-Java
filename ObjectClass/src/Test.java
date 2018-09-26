public class Test {

	public static void main(String[] args) {
		Passenger passenger = new Passenger(123678, "Suresh", "Bethala");

		Passenger passenger2 = new Passenger(123678, "Suresh", "Bethala");

		System.out.println(passenger);

		System.out.println(passenger.hashCode());
		
		System.out.println(passenger.equals(passenger2));

	}
}
