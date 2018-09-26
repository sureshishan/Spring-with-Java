public abstract class BMW {
	public void common() {
		System.out.println("Common method...!");
	}

	abstract void accelerate();
	abstract void brake();
	
	
	public static void main(String[] args) {
		System.out.println("This is main method in abstract class...!");
	}
}
