import java.io.IOException;

public class Tester {
	public static void main(String[] args) throws IOException{
		//String[] options = new String[0];
		int value = ConsoleUI.promptForInt(null, 0, 10);
		System.out.println(value);
	}
}
