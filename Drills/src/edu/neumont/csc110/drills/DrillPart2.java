package edu.neumont.csc110.drills;

import java.io.IOException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.EnumSet;
import java.util.Random;

public class DrillPart2 {

	public static void main(String[] args) throws IOException {
		//BranchingIfElseBlocks();
		//BranchingIfElseBlocks2();
		//BranchingIfElseBlocks3();
		//FlowCharts();
		//NestedBranching();
		//CascadingBranching();
		//EnumeratedTypesAndSwitch();
		//DoWhileIteration();
		//DoWhileIterationAndBranching();
		//DoWhileIterationAndBranchingBreak();
		//WhileIteration();
		//ForLoopIteration();
		//ForLoopIteration2();
		//ForLoopWithReverseIteration();
		//ForLoopWithContinue();
		//ForEachIteration();
		//NestedForLoopIteration();
		//SimpleArrayDeclaration();
		//InitailizeIntArray();
		//InitailizeIntArrayWithVaringValues();
		//InitialiveIntArrayWithCalc();
		//ArrayswithRandomAccess();
		//ScaledHistogram();
		//ArrayInitailization();
	}

	public static void BranchingIfElseBlocks() throws IOException {
		String name = ConsoleUI.promptForInput("Enter Name:", false);
		if (name.equals("Fred")) {
			String lastname = ConsoleUI.promptForInput("Enter Last Name:", false);
			System.out.println("Hello, " + name + " " + lastname);
		} else {
			String color = ConsoleUI.promptForInput("Enter Color:", false);
			System.out.println("Hello, " + color + " " + name);
		}
	}

	public static void BranchingIfElseBlocks2() throws IOException {
		String name = ConsoleUI.promptForInput("Enter Name:", false);
		if (name.equals("Fred")) {
			String lastname = ConsoleUI.promptForInput("Enter Last Name:", false);
			System.out.println("Hello, " + name + " " + lastname);
		} else {
			System.out.println("Hello, " + name);
		}
	}

	public static void BranchingIfElseBlocks3() throws IOException {
		String name = ConsoleUI.promptForInput("Enter Name:", false);
		if (name.equals("Fred")) {
			System.out.println("Hello, " + name);
		} else {
			String color = ConsoleUI.promptForInput("Enter Color:", false);
			System.out.println("Hello, " + color + name);
		}
	}

	public static void FlowCharts() {

	}

	public static void NestedBranching() throws IOException {
		String name = ConsoleUI.promptForInput("Enter Name:", false);
		if (name.equals("Fred")) {
			String lastname = ConsoleUI.promptForInput("Enter Last Name:", false);
			if (lastname.equals("Flinstone")) {
				System.out.println("Hello, " + name + " " + lastname);
			} else {
				System.out.println("Hello, " + name);
			}
		} else {
			String color = ConsoleUI.promptForInput("Enter Color:", false);
			if (color.equalsIgnoreCase("red")) {
				System.out.println("I'd rather be Red than Fred");
			} else {
				System.out.println("Hello, " + name + ". I don't like red either");
			}
		}

	}

	public static void CascadingBranching() throws IOException {
		String name = ConsoleUI.promptForInput("Enter Name:", false);
		if (name.equals("Fred")) {
			System.out.println("Yapadapadoo");
		} else if (name.equals("Barney")) {
			System.out.println("Rubble");
		} else if (name.equals("Dino")) {
			System.out.println("go chase a car");
		} else {
			System.out.println("You're not a Flinstone");
		}
	}

	public static void EnumeratedTypesAndSwitch() throws IOException {
		Weekday Day;
		int dayOfweek = Calendar.DAY_OF_WEEK;
		if (dayOfweek == 1) {
			Day = Weekday.Sunday;
			System.out.println("It is the weekend");
		} else if (dayOfweek == 2) {
			Day = Weekday.Monday;
			System.out.println("It is " + Day);
		} else if (dayOfweek == 3) {
			Day = Weekday.Tuesday;
			System.out.println("It is " + Day);
		} else if (dayOfweek == 4) {
			Day = Weekday.Wednesday;
			System.out.println("It is " + Day);
		} else if (dayOfweek == 5) {
			Day = Weekday.Thursday;
			System.out.println("It is " + Day);
		} else if (dayOfweek == 6) {
			Day = Weekday.Friday;
			System.out.println("It is " + Day);
		} else {
			Day = Weekday.Saturday;
			System.out.println("It is the weekend");
		}

	}

	public static void DoWhileIteration() throws IOException {
		Random gen = new Random();
		int number = gen.nextInt(9) + 1;
		boolean correct;
		do {
			correct = true;
			int user = ConsoleUI.promptForInt("Enter Guess:", Integer.MIN_VALUE, Integer.MAX_VALUE);
			if (user != number) {
				System.out.println("You Guessed Wrong:");
				correct = false;
			} else {
				System.out.println("You are correct");
			}
		} while (!correct);
	}

	public static void DoWhileIterationAndBranching() throws IOException {
		Random gen = new Random();
		int number = gen.nextInt(9) + 1;
		boolean correct;
		do {
			correct = true;
			int user = ConsoleUI.promptForInt("Enter Guess:", Integer.MIN_VALUE, Integer.MAX_VALUE);
			if (user != number) {
				System.out.println("You Guessed Wrong:");
				correct = false;
				if (user > number) {
					System.out.println("You guessed too high");
				} else {
					System.out.println("You guessed too low");
				}
			} else {
				System.out.println("You are correct");
				break;
			}
		} while (!correct);
	}

	public static void DoWhileIterationAndBranchingBreak() throws IOException {
		Random gen = new Random();
		int number = gen.nextInt(9) + 1;
		boolean correct;
		do {
			correct = true;
			int user = ConsoleUI.promptForInt("Enter Guess:", Integer.MIN_VALUE, Integer.MAX_VALUE);
			if (user != number) {
				System.out.println("You Guessed Wrong:");
				correct = false;
				if (user > number) {
					System.out.println("You guessed too high");
				} else {
					System.out.println("You guessed too low");
				}
			} else {
				System.out.println("You are correct");
			}
		} while (!correct);
	}

	public static void WhileIteration() throws IOException {
		String user = ConsoleUI.promptForInput("Enter a String", false);
		int NumOfSpaces;
		do {
			NumOfSpaces = 0;
			for (int i = 0; i < user.length(); i++) {
				if (user.charAt(i) == ' ') {
					NumOfSpaces++;
				}
			}
			if (NumOfSpaces != 0) {
				System.out.println(user);
			}
			for (int i = 0; i < user.length(); i++) {
				if (user.charAt(i) == ' ') {
					NumOfSpaces = i;
					break;
				}
			}
			user.replace(' ', 'X');
		} while (NumOfSpaces != 0);
	}

	public static void ForLoopIteration() throws IOException {
		String user = ConsoleUI.promptForInput("Enter a String", false);
		for (int i = 0; i < user.length(); i++) {
			System.out.println(user.charAt(i));
		}
	}

	public static void ForLoopIteration2() throws IOException {
		int number = ConsoleUI.promptForInt("Enter a number", Integer.MIN_VALUE, Integer.MAX_VALUE);
		int sum = 0;
		for (int i = 0; i < number; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}

	public static void ForLoopWithReverseIteration() throws IOException {
		String user = ConsoleUI.promptForInput("Enter a string", false);
		char[] UserO = user.toCharArray();
		String userBack = new String(UserO);
		System.out.println(userBack);
	}

	public static void ForLoopWithContinue() {
		for (int i = 1; i < 20; i++) {
			if ((i % 3) == 0) {
				System.out.println(i + " ");
			}
		}
	}

	public static void ForEachIteration() {
		for (Flinstones names : EnumSet.allOf(Flinstones.class)) {
			System.out.println(names);
		}
	}

	public static void NestedForLoopIteration() {
		for (int i = 0; i < 100; i++) {
			if (i < 10) {
				System.out.println("0" + i);
			}
			System.out.println(i);
		}
	}

	public static void SimpleArrayDeclaration() {
		String[] Dwarfs = { "Doc", "Dopey", "Bashful", "Grumpy", "Sneezy", "Sleepy", "Happy" };
		for (int i = 0; i < Dwarfs.length; i++) {
			System.out.println(Dwarfs[i]);
		}
	}

	public static void InitailizeIntArray() {
		int[] array = new int[100];
		Arrays.fill(array, 42);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	public static void InitailizeIntArrayWithVaringValues() {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
			System.out.print(array[i]);
		}
	}

	public static void InitialiveIntArrayWithCalc() {
		int[] array = new int[100];
		for (int i = 0; i < array.length * 2; i += 2) {
			array[i / 2] = i + 2;
			System.out.print(array[i / 2] + " ");
		}
	}

	public static void ArrayswithRandomAccess() {
		Random gen = new Random();
		int[] array = new int[10];
		for (int i = 0; i < 100; i++) {
			int num = gen.nextInt(10);
			array[num] += 1;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(i + ": ");
			PrintHistogram(array[i]);
		}
	}

	private static void PrintHistogram(int array) {
		for (int i = 0; i < array; i++) {
			System.out.print("*");
		}
		System.out.print("\n");
	}

	public static void ScaledHistogram() {
		Random gen = new Random();
		int[] array = new int[10];
		for (int i = 0; i < 1000; i++) {
			int num = gen.nextInt(10);
			array[num] += 1;
		}
		int most = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > most) {
				most = array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			array[i] = (most / 10);
			System.out.print(i + ": ");
			PrintHistogram(array[i]);
		}
	}
	
	public static void ArrayInitailization(){
		String[] Dwarfs = { "Doc", "Dopey", "Bashful", "Grumpy", "Sneezy", "Sleepy", "Happy" };
		for (int i = 0; i < Dwarfs.length; i++) {
			System.out.println(Dwarfs[i]);
		}
	}
}
