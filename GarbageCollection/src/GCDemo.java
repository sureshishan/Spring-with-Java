public class GCDemo {

	int objId;

	public GCDemo(int objId) {
		this.objId = objId;
		System.out.println("Create " + this.objId);
	}

	public static void main(String[] args) {
		new GCDemo(1);
		new GCDemo(2);
		new GCDemo(3);
		for (int i = 0; i < 100; i++) {
			System.gc();
		}
	}

	protected void finalize() {
		System.out.println("Finalized " + objId);
	}
}