package returndemo;

public class ReturnDemo {
	
	int a = 10;
	
	public ReturnDemo() {
		System.out.println("Constructor");
	}
	
	static 
	{
		ReturnDemo r = new ReturnDemo();
		r.call();
	}

	{
		System.out.println("init block");
	}
	
	public static void main(String[] args) {
		Product p = new Product();
		p.test();
		ReturnDemo returnDemo = new ReturnDemo();
		returnDemo.call();
		System.out.println(returnDemo.a);
	}
	
	void call(){
		System.out.println("call");
	}

}

class Product {
	
	void test(){
		System.out.println("test");
	}

}
