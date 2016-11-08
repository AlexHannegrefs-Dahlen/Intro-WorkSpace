import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mad_Lib {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader InputReader = new InputStreamReader(System.in);
        BufferedReader BufferedReader = new BufferedReader(InputReader);
        
        System.out.println("Enter A season: ");
        String season1 = BufferedReader.readLine();
        
        System.out.println("Enter a person: ");
        String person1 = BufferedReader.readLine();
        
        System.out.println("Enter an adjective: ");
        String adj2 = BufferedReader.readLine();
        
        System.out.println("Enter a place: ");
        String place1 = BufferedReader.readLine();
        
        System.out.println("Enter another adjective: ");
        String adj1 = BufferedReader.readLine();
        
        System.out.println("Last " + season1 + " , my mom and dad took me and " + person1 + " on a " + adj2 + " trip to " + place1 + ". " + "The weather was very " + adj1 + "!");
        
		}
}