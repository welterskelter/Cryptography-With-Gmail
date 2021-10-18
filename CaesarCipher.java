
public class CaesarCipher extends Cipher{
	private int shift;
	private String lineBeforeEncryption;
	private String lineBeforeDecryption;
	public CaesarCipher(int direction) {
		shift = direction;
	}
	public String encrypt() {
		return lineBeforeDecryption;
	}
	public String encrypt(String line) {
		String ans =" ";
		line = line.toUpperCase();
		lineBeforeEncryption= line;
		int charCode;
		for(int i = 0; i<line.length();i++) {
			charCode = line.charAt(i);
			if(charCode==32) {
				ans+=" ";
				continue;
			}
			ans += Character.toString((char)(((charCode-65)+shift+26)%26+65));
			
		}
		return ans;
	}
	public String decrypt() {
		return lineBeforeEncryption;
	}
	public String decrypt(String line) {
		String ans =" ";
		line = line.toUpperCase();
		lineBeforeDecryption = line;
		int charCode;
		
		for(int i = 0; i<line.length();i++) {
			charCode = line.charAt(i);
			if(charCode==32) {
				ans+=" ";
				continue;
			}
			ans += Character.toString((char)(((charCode-65)-shift+26)%26+65));
			
		}
		return ans;
	}
}
