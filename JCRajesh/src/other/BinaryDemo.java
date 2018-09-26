package other;

public class BinaryDemo {

	public static void main(String[] args) {
		BinaryDemo bd = new BinaryDemo();

		bd.MyBinarycheck(10101010);
		System.out.println("bd.MyBinarycheck(10101010) is Binary? : "
				+ bd.MyBinarycheck(10101010));
	}

	public boolean MyBinarycheck(int binary) {
		
		boolean status = true;
		
		while(true){
			if(binary == 0 || binary == 1){
				break;
			}else{
				int temp = binary % 10;
				if(temp > 1){
					status = false;
					break;
				}
				binary = binary / 10;
			}
			
		}
		return status;
		
	}

}
