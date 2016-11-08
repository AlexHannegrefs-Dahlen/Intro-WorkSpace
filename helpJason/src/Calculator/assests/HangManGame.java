package Calculator.assests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HangManGame {

	public static void main(String[] args) throws IOException {
		System.out.println("Hello" + "\n" + "Welcome to my Hangman Game" + "\n" + "How many words do you plan on using?"
				+ "\n" + "1" + "\n" + "2" + "\n" + "3" + "\n" + "4" + "\n" + "5" + "\n" + "6" + "\n" + "7" + "\n"
				+ "8");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String option = reader.readLine();
		boolean except = true;
		do {
			except = true;

			if (option.equals("1")) {

			} else if (option.equals("2")) {

			} else if (option.equals("3")) {

			} else if (option.equals("4")) {

			} else if (option.equals("5")) {

			} else if (option.equals("6")) {

			} else if (option.equals("7")) {

			} else if (option.equals("8")) {

			} else {
				except = false;
			}
		} while (except == false);
	}
}