package nonstaticinner;

public class Outer {

	static int x = 10;
	int y;

	Outer(int y) {
		this.y = y;
	}

	void f1() {
		System.out.println("Outer's Non-static method.");
		s();
	}
	
	static void s(){
		//f1();
	}

	class Inner {

		private int y;

		Inner(int y) {
			this.y = y;
		}

		void f2() {
			System.out.println("Inner's non-static method");
			System.out.println("Outer's static member x: " + Outer.x);
			System.out.println("Outer's non-static member: " + Outer.this.y);
			System.out.println("Inner's non-static member: " + this.y);

		}
	}

	public static void main(String[] args) {

		System.out.println(Outer.x);
		Outer outer = new Outer(20);
		outer.f1();

		Outer.Inner inner = outer.new Inner(50);
		inner.f2();
		System.out.println("Inner's y is: " + inner.y);
	}

}
