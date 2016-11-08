import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Name_Finder{
	public static void main(String[] args) throws IOException{

		//Full name code
		InputStreamReader ISR = new InputStreamReader(System.in);
		BufferedReader BR = new BufferedReader(ISR);
		
		System.out.println("Enter your first name: "); // Gets first name
		String first = BR.readLine();
		
		System.out.println("Enter your last name: "); // Gets last name
		String last = BR.readLine();
		
		String full = first + " " + last; // Puts the two name together
		
		System.out.println("Your full name is: " + full); // Prints the name
	
		
	}
}