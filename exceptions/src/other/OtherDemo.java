package other;

import java.io.IOException;

public class OtherDemo {

	public static void main(String[] args) {
		POJOs p = new POJOs();
		int i = p.someMethod();
		System.out.println(i);
	}

}

class POJOs{
	
	public int someMethod(){
		try{
			//System.exit(0);
			throw new RuntimeException();
			
		}catch(Exception ex){
			System.out.println("caught");
			//System.exit(0);
			//return 2;
			
		}finally{
			return 3;
		}
	}
	
}
