import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tester {

	public static void main(String[] args) throws IOException {
		String prompt = "Value";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int max = 10;
		int min = 0;
		int userInput;
		boolean valid;
		do{
			valid = true;
			System.out.println(prompt);
			String input = in.readLine();
			userInput = Integer.parseInt(input);
			if(min > userInput) 
			{
				valid = false;
				System.out.println("Invalid Input");
			}
			else if(userInput > max)
			{
				valid = false;
				System.out.println("Invalid Input");
			}
			else
			{
				valid = true;
				System.out.println("Valid Input");
			}
		}while(valid == false);

	}

}
