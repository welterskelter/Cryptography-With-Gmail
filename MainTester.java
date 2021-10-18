
public class MainTester {
	public static void main(String[] args) {
		CaesarCipher test = new CaesarCipher(-10);
		long time = System.nanoTime();
		System.out.println(test.decrypt(test.encrypt("POKEMONDSAJFHLhsdj kldas fdas")));
		long t2 = System.nanoTime();
		System.out.println((t2-time));
		AffineCipher test1 = new AffineCipher(5,8);
		System.out.println(test1.generateInverseA());
	}
}
