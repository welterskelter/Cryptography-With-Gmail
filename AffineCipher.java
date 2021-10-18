
public class AffineCipher {
	private int a,b,aInverse,m;
	private int[] encryptionTable = new int[26];
	private int[] decryptionTable = new int[26];
	public AffineCipher(int a, int b) {
		this.a = a;
		this.b = b;
		this.m = 26;
		generateEncryptionTable();
		generateInverseA();
		generateDecryptionTable();
		
	}
	
	private void generateEncryptionTable() {
		for(int i = 0; i<m; i++) {
			encryptionTable[i] = (a*i+b)%m;
		}
	}
	private void generateInverseA() {
		//thank you geeks for geeks for this handy algo
		int m0 = m;
	        int y = 0; 
		aInverse = 1;
		 /*not needed since m always equals 26
	        if (m == 1)
	            return 0;*/
	 
	        while (a > 1) {
	            // q is quotient
	            int q = a / m;
	 
	            int t = m;
	 
	            // m is remainder now, process
	            // same as Euclid's algo
	            m = a % m;
	            a = t;
	            t = y;
	 
	            // Update aInverse and y
	            y = aInverse - q * y;
	            aInverse = t;
	        }
	 
	        // Make aInverse positive
	        if (aInverse < 0)
	            aInverse += m0;
		System.out.println(aInverse);
	    }
	private void generateDecryptionTable(){
		for(int i = 0;i<m;i++){
			decryptionTable[i] = ((i-b)*aInverse)%m;
		}
	}
	 
	
	/*public String encrypt(String line) {
		
	}*/
}
