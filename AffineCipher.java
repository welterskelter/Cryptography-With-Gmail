
public class AffineCipher {
	private int a,b,aInverse,m;
	private int[] encryptionTable = new int[26];
	public AffineCipher(int a, int b) {
		this.a = a;
		this.b = b;
		this.m = 26;
		generateEncryptionTable();
	}
	
	private void generateEncryptionTable() {
		for(int i = 0; i<m; i++) {
			encryptionTable[i] = (a*i+b)%m;
		}
	}
	public int generateInverseA() {
		 int m0 = m;
	        int y = 0, x = 1;
	 
	        if (m == 1)
	            return 0;
	 
	        while (a > 1) {
	            // q is quotient
	            int q = a / m;
	 
	            int t = m;
	 
	            // m is remainder now, process
	            // same as Euclid's algo
	            m = a % m;
	            a = t;
	            t = y;
	 
	            // Update x and y
	            y = x - q * y;
	            x = t;
	        }
	 
	        // Make x positive
	        if (x < 0)
	            x += m0;
	 
	        return x;
	    }
	 
	
	/*public String encrypt(String line) {
		
	}*/
}
