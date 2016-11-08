
public class Cipher {

	static char[] alpha;

	public static String encrypt(String plainText, String key) {
		String expandedKey = expandKey(key, plainText.length());
		initArray();
		String cipher = "";
		for(int i = 0; i<plainText.length(); i++){
			char plainChar = plainText.charAt(i);
			char keyChar = expandedKey.charAt(i);
			char cipherChar = (char) (plainChar -97 + keyChar - 97);
			if(cipherChar >= 26){
				cipherChar -= 26;
			}
			cipherChar = alpha[cipherChar];
			cipher += cipherChar;
		}
		
		return cipher;
	}

	private static String expandKey(String key, int len) {
		String result = "";
		int i = 0;
		while (result.length() != len) {
			result += key.charAt(i);
			i++;
			if (i >= key.length()) {
				i = 0;
			}
		}
		/*
		 * this works aswell like the while loop for(int i = 0; i<len;i++){
		 * result+= key.charAt(i % key.length()); }
		 */
		return result;
	}

	private static void initArray() {
		if (alpha == null) {
			alpha = new char[26];
			for (int i = 0; i < 26; i++) {
				alpha[i] = (char) (97 + i);
				// System.out.print(alpha[i] + " ");
			}
		}
		// System.out.println();
	}
}
