package corepatterns;

public class Test {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getinstance();
		Singleton s2 = Singleton.getinstance();
		
		//Singleton s3 = new Singleton();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//System.out.println();
	}

}
