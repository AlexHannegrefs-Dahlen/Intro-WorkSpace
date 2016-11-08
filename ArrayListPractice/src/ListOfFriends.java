import java.io.IOException;
import java.util.ArrayList;

public class ListOfFriends {

	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<>();
		String[] options = new String[3];
		options[0] = "1: Add a Friend";
		options[1] = "2: Remove a Friend";
		options[2] = "3: Show My Friends";
		boolean Quit = false;
		while (!Quit) {
			int Select = ConsoleUI.promptForMenuSelection(options, true);
			if (Select == 1) {
				String name = ConsoleUI.promptForInput("What is your friends name?", false);
				list.add(name);
			}
			else if(Select == 2){
				String name = ConsoleUI.promptForInput("What friend would you like to remove?", false);
				list.remove(name);
			}
			else if (Select == 3){
				System.out.println(list);
			}
			else{
				Quit = true;
				System.out.println("Quitting");
			}
		}
	}
}