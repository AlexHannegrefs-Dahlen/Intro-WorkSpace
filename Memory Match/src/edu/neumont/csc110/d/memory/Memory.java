package edu.neumont.csc110.d.memory;

import java.io.IOException;

public class Memory {

	public static void main(String[] args) throws IOException {
		Dealer d = new Dealer();
		d.createCards();
		boolean keepPlaying = true;
		while(keepPlaying){
		d.shuffle();
		d.runGame();
		keepPlaying = ConsoleUI.promptForBool("Would you like to play agian?", "Y", "N");
		}
	}

}
