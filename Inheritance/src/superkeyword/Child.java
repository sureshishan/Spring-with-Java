package superkeyword;

public class Child extends Parent {

	int c, d;

	Child() {
		super(30,40);
	}
	Child(int c, int d) {
		//super(30, 40);
		this();
		this.c = c;
		this.d = d;
	}

}
