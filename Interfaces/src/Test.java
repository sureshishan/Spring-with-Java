public class Test {

	public static void main(String[] args) {
		AppleLaptop m1 = new MACBookPro();
		AppleLaptop m2 = new MACBookAIR();

		m1.start();
		m1.shutdown();

		MACBookAIR m5 = new MACBookAIR();

		// MACBookPro m6 = (MACBookPro)m5;

		MACBookPro m3 = (MACBookPro) m1;

		MACBookPro m4 = (MACBookPro) m2;

		MACBookAIR m7 = (MACBookAIR) m2;
		m7.airSpecific();

		m2.start();
		m2.shutdown();

	}

}
