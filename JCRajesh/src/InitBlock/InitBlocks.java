package InitBlock;

public class InitBlocks {
	{
		System.out.println("init-block");
	}
	
	public InitBlocks() {
		System.out.println("Constructor");
	}
	
	static{
		System.out.println("static block");
	}

	public static void main(String[] args) {
		new InitBlocks();
		
	}

}
