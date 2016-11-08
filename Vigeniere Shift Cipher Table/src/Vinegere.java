import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vinegere {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Message");
		String plainText = in.readLine();
		
		System.out.println("Enter Secret key");
		String key = in.readLine();
		
		String cipherText = Cipher.encrypt(plainText, key);
		System.out.println("Encrypted text " + cipherText);
	}
}
