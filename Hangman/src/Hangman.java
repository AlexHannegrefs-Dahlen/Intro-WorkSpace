import java.io.IOException;
import java.util.Arrays;

public class Hangman {
	static int NumWrong;
	static int NumberWrong;
	static int numberRight;
	static int AmountOfGuesses;
	static int spaces = 0;

	public static void main(String[] args) throws IOException {
		String puzzle = puzzleInput();
		String codepuzzle = puzzle.toLowerCase();
		String[] PuzzleGuessed = new String[puzzle.length()];
		user(codepuzzle, PuzzleGuessed, puzzle);
	}

	public static int RoundMenu() throws IOException {
		boolean valid = true;
		int user = 0;
		String[] options = new String[3];

		do {
			options[0] = "1: Guess a Letter";
			options[1] = "2: Solve The puzzle";
			valid = true;
			user = ConsoleUI.promptForMenuSelection(options, true);
			if (user < 0 || user > 2) {
				valid = false;
				System.out.println("Must enter a whole number from the options");
			}
		} while (valid == false);
		return user;
	}

	public static String puzzleInput() throws IOException {
		
		String Puzzle;
		boolean valid = true;
		int MaxWordsInPuzzle = 8;
		do {
			spaces = 0;
			valid = true;
			String prompt = "Enter puzzle";
			Puzzle = ConsoleUI.promptForInput(prompt, false);
			//char[] LookforSpaces = new char[Puzzle.length()];
			for (int i = 0; i < Puzzle.length(); i++) {
				//LookforSpaces[i] = Puzzle.charAt(i);
				if (Puzzle.charAt(i) == ' ') {
					spaces++;
				}
			}
			if (spaces > MaxWordsInPuzzle - 1) {
				System.out.println("Too many words in puzzle");
				valid = false;
			}
		} while (valid == false);
		return Puzzle;
	}

	public static char GetGuess(char[] Guesses, int guesses) throws IOException {
		int NumberOfGuesses = 0;
		String GuessPrev = Guesses.toString();
		if (NumberOfGuesses > 0) {
			System.out.println("Already guessed: " + GuessPrev);
		}
		char userguess = ConsoleUI.promptForChar("What is your guess?", 'a', 'z');
		NumberOfGuesses = NumberOfGuesses + 1;
		// StoreGuesses(guesses, userguess, Guesses);

		return userguess;
	}

	public static char[] StoreGuesses(char userGuess, char[] Guesses) {
		// AmountOfGuesses = AmountOfGuesses + 1;
		Guesses[AmountOfGuesses] = userGuess;
		AmountOfGuesses++;
		return Guesses;
	}

	public static boolean checkGuessAlreadyGuessed(char[] Guesses, char userGuess) {
		boolean guessed = false;
		for (int i = 0; i < Guesses.length; i++) {
			if (Guesses[i] == userGuess) {
				guessed = true;
				System.out.println("You already guessed that letter");
			}
		}
		return guessed;
	}

	public static void Quitting(String puzzle) {
		System.out.println("The puzzle was: " + puzzle);
		System.exit(0);
	}

	public static void WrongGuess(String puzzle) throws IOException {
		System.out.println("You are wrong");
		System.out.println("The puzzle was: " + puzzle);
		newgame();
	}

	public static void WinGame(String puzzle) throws IOException {
		System.out.println("You won the game");
		System.out.println("The puzzle was: " + puzzle);
		newgame();
	}

	public static void newgame() throws IOException {
		String user = ConsoleUI.promptForInput("Would you like to play again?", false);
		if (user.equalsIgnoreCase("yes")) {
			main(null);
		} else {
			System.exit(0);
		}
	}

	public static void user(String codepuzzle, String[] PuzzleGuessed, String puzzle) throws IOException {
		int user;
		char userGuess = 0;
		char[] Guesses = new char[26];

		do {
			user = RoundMenu();
			if (user == 1)
				GuessALetter(codepuzzle, userGuess, PuzzleGuessed, Guesses, puzzle);
			else if (user == 2)
				GuessThePuzzle(puzzle);
			else if (user == 0)
				Quitting(puzzle);

		} while (user == 1);
	}

	public static void Wrong6() {
		System.out.println("_______");
		System.out.println("|     *");
		System.out.println("|     O");
		System.out.println("|    /|\\");
		System.out.println("|    / \\");
		System.out.println("|________");
	}

	public static void Wrong5() {
		System.out.println("_______");
		System.out.println("|     *");
		System.out.println("|     O");
		System.out.println("|    /|\\");
		System.out.println("|    /   ");
		System.out.println("|________");
	}

	public static void Wrong4() {
		System.out.println("_______");
		System.out.println("|     *");
		System.out.println("|     O");
		System.out.println("|    /|\\");
		System.out.println("|        ");
		System.out.println("|________");
	}

	public static void Wrong3() {
		System.out.println("_______");
		System.out.println("|     *");
		System.out.println("|     O");
		System.out.println("|    /|  ");
		System.out.println("|        ");
		System.out.println("|________");
	}

	public static void Wrong2() {
		System.out.println("_______");
		System.out.println("|     *");
		System.out.println("|     O");
		System.out.println("|     |  ");
		System.out.println("|        ");
		System.out.println("|________");
	}

	public static void Wrong1() {
		System.out.println("_______");
		System.out.println("|     *");
		System.out.println("|     O");
		System.out.println("|        ");
		System.out.println("|        ");
		System.out.println("|________");
	}

	public static void Wrong0() {
		System.out.println("_______");
		System.out.println("|     *");
		System.out.println("|      ");
		System.out.println("|        ");
		System.out.println("|        ");
		System.out.println("|________");
	}

	public static void GuessThePuzzle(String puzzle) throws IOException {
		String prompt = "What is your guess?";
		String UsersGuess = ConsoleUI.promptForInput(prompt, false);
		if (UsersGuess.equalsIgnoreCase(puzzle)) {
			WinGame(puzzle);
		} else {
			WrongGuess(puzzle);
		}
	}

	public static void GuessALetter(String codepuzzle, char userGuess, String[] PuzzleGuessed, char[] Guesses,
			String puzzle) throws IOException {
		boolean guessed;
		do {
			userGuess = GetGuess(Guesses, AmountOfGuesses);
			guessed = checkGuessAlreadyGuessed(Guesses, userGuess);

		} while (guessed == true);
		Guesses = StoreGuesses(userGuess, Guesses);

		String puzzleout;
		String[] CorrectGuess = new String[PuzzleGuessed.length];
		char[] GuessAppearsinPuzzle = new char[puzzle.length()];
		for (int i = 0; i < codepuzzle.length(); i++) {
			char puzzleChar = codepuzzle.charAt(i);
			if (puzzleChar == userGuess) {
				GuessAppearsinPuzzle[i] = userGuess;
			} else if (puzzleChar == ' ') {
				GuessAppearsinPuzzle[i] = ' ';
			} else if (puzzleChar == '_') {
				GuessAppearsinPuzzle[i] = '_';
			}
		}
		for (int f = 0; f < codepuzzle.length(); f++) {

			if (GuessAppearsinPuzzle[f] == userGuess) {
				puzzleout = String.valueOf(userGuess);
				PuzzleGuessed[f] = puzzleout;
			} else if (GuessAppearsinPuzzle[f] == ' ') {
				PuzzleGuessed[f] = " ";
			} else if (GuessAppearsinPuzzle[f] == '_') {
				PuzzleGuessed[f] = "_";
			}
		}
		NumWrong = 0;
		for (int g = 0; g < puzzle.length(); g++) {
			if (CorrectGuess[g] == PuzzleGuessed[g]) {
				NumWrong++;
			}
			// System.out.println(NumWrong);
		}

		if (NumWrong == ((puzzle.length()) - (numberRight) - (spaces))) {
			NumberWrong++;
			System.out.println("That Guess is Wrong");
		} else {
			numberRight++;
		}

		GameBoard(puzzle);
		for (int g = 0; g < PuzzleGuessed.length; g++) {
			CorrectGuess[g] = PuzzleGuessed[g];
			if(CorrectGuess[g] == null){
				CorrectGuess[g] = "_";
			}
		}

		System.out.println(Arrays.toString(CorrectGuess));
		System.out.println("Guessed: ");
		for (int k = 0; k < AmountOfGuesses; k++) {
			System.out.print(Guesses[k]+ "," +" ");
		}
	}

	public static void GameBoard(String puzzle) {
		if (NumberWrong == 0) {
			Wrong0();
		} else if (NumberWrong == 1) {
			Wrong1();
		} else if (NumberWrong == 2) {
			Wrong2();
		} else if (NumberWrong == 3) {
			Wrong3();
		} else if (NumberWrong == 4) {
			Wrong4();
		} else if (NumberWrong == 5) {
			Wrong5();
		} else if (NumberWrong == 6) {
			Wrong6();
		}
	}
}