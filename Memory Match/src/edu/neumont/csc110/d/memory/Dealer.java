package edu.neumont.csc110.d.memory;

import java.io.IOException;
import java.util.Random;

public class Dealer {
	String[] messages = { "Apple", "Orange", "Peach", "Pear", "Tomato", "Mango", "Avacado", "Carrot", "Banana" };
	public Card[] cards;

	Random gen = new Random();

	public void createCards() {
		cards = new Card[messages.length * 2];
		for (int i = 0; i < cards.length; i += 2) {
			Card c = new Card();
			c.message = messages[i / 2];
			cards[i] = c;
			cards[i + 1] = new Card();
			cards[i + 1].message = messages[i / 2];
		}
	}

	public void shuffle() {
		for (int i = 0; i < 100; i++) {
			int randomIndex = gen.nextInt(cards.length);
			int randomIndex2 = gen.nextInt(cards.length);
			Card savedOffCard = cards[randomIndex];
			cards[randomIndex] = cards[randomIndex2];
			cards[randomIndex2] = savedOffCard;
		}
	}

	public int pickCards(String prompt) throws IOException {
		int index = -1;
		while (index == -1) {
			index = ConsoleUI.promptForInt(prompt, 0, cards.length) - 1;
			if (cards[index].shown) {
				index = -1;
			}
		}
		return index;
	}

	public void runGame() throws IOException {
		while (!isGameOver()) {
			printCards(false);
			int firstCardIndex = pickCards("Pick First Card");
			cards[firstCardIndex].flip();
			printCards(false);
			int secondCardIndex = pickCards("Pick Second Card");
			cards[secondCardIndex].flip();
			printCards(false);
			if (!cards[firstCardIndex].equals(cards[secondCardIndex])) {
				cards[firstCardIndex].flip();
				cards[secondCardIndex].flip();
				System.out.println("No match");
			} else {
				System.out.println("Match");
				cards[firstCardIndex].matched = true;
				cards[secondCardIndex].matched = true;
			}
			ConsoleUI.promptForInput("Enter to continue", true);
		}
		System.out.println("Game Over!");
	}

	public boolean isGameOver() {
		for (int i = 0; i < cards.length; i++) {
			if (!cards[i].matched) {
				return false;
			}
		}
		return true;
	}

	public void printCards(boolean showALL) {
		for (int i = 0; i < cards.length; i++) {
			System.out.print(i + 1 + " ");
			if (cards[i].shown || showALL) {
				System.out.println(cards[i].message);
			} else {
				System.out.println("?");
			}
		}
	}
}