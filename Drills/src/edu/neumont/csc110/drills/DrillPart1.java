package edu.neumont.csc110.drills;

import java.io.IOException;
import java.util.Calendar;

public class DrillPart1 {

	public static void main(String[] args) throws IOException {
		//drill1CalcBirthYear();
		//BunchOfOpt();
		//BunchOfOptMultipleVari();
		//FloatConversion();
		//CharToInt();
		//IntToChar();
		//SimpleProblemSolving();
		//SimpleProblem();
		//SimpleMath3Vari();
		//MathAndStringConcatenation();
		//SimpleProblemSolving2();
		//FloatConv();
		//StringToNumConvAndSubString();
		//IndexOf();
		//IndexOfandSubString();
		//SubstringAndAlgorithm();
		//SubStringAndSomeProblem();
		//SubStringAndConc();
		//SubStringAndConcAndProblemSolving();
		//SimpleBranching();
		//SimpleBranchingWithCompoundBoolean();
		//SimpleBranchingWithCompoundBoolean2();
		//SimpleBranchingWithElse();
		//SimpleBranchingWithNot();
		//SimpleBranchingWithBlock();
	}

	public static void drill1CalcBirthYear() throws IOException {
		int UserAge = ConsoleUI.promptForInt("Enter age", 0, 150);
		Calendar now = Calendar.getInstance();
		now.add(Calendar.YEAR, -UserAge);
		int BirthYear = now.get(Calendar.YEAR);
		System.out.println(BirthYear);
	}

	public static void BunchOfOpt() throws IOException {
		int Number = ConsoleUI.promptForInt("Enter Number:", Integer.MIN_VALUE, Integer.MAX_VALUE);
		Number += 5;
		Number *= 3;
		Number %= 7;
		System.out.println(Number);
	}

	public static void BunchOfOptMultipleVari() throws IOException {
		int UserNumber = ConsoleUI.promptForInt("Enter Number:", Integer.MIN_VALUE, Integer.MAX_VALUE);
		int Numbera = UserNumber + 7;
		int Numberb = UserNumber - 9;
		System.out.println(Numbera * Numberb);
	}

	public static void FloatConversion() throws IOException {
		int Number1 = ConsoleUI.promptForInt("Enter Number:", Integer.MIN_VALUE, Integer.MAX_VALUE);
		int Number2 = ConsoleUI.promptForInt("Enter Number:", Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println((float) Number1 / Number2);
	}

	public static void CharToInt() throws IOException {
		System.out.println((int) ConsoleUI.promptForChar("Enter Char:", Character.MIN_VALUE, Character.MAX_VALUE));
	}

	public static void IntToChar() throws IOException {
		System.out.println((char) ConsoleUI.promptForInt("Enter Number:", Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	public static void SimpleProblemSolving() throws IOException {
		System.out.println((ConsoleUI.promptForDouble("Enter Radius:", Double.MIN_VALUE, Double.MAX_VALUE)) * Math.PI);
	}

	public static void SimpleProblem() throws IOException {
		System.out.println(ConsoleUI.promptForDouble("Enter Height:", Integer.MIN_VALUE, Integer.MAX_VALUE)
				* ConsoleUI.promptForDouble("Enter Width:", Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	public static void SimpleMath3Vari() throws IOException {
		System.out.println(ConsoleUI.promptForInt("Enter Number:", Integer.MIN_VALUE, Integer.MAX_VALUE)
				+ ConsoleUI.promptForInt("Enter Number:", Integer.MIN_VALUE, Integer.MAX_VALUE)
				+ ConsoleUI.promptForInt("Enter Number:", Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	public static void MathAndStringConcatenation() throws IOException {
		int Numbera = ConsoleUI.promptForInt("Enter Number:", Integer.MIN_VALUE, Integer.MAX_VALUE);
		int Numberb = ConsoleUI.promptForInt("Enter Number:", Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println((Numbera + Numberb) + " " + (Numbera - Numberb) + " " + (Numbera * Numberb) + " "
				+ (Numbera / Numberb) + " " + (Numbera % Numberb));
	}

	public static void SimpleProblemSolving2() throws IOException {
		char c = ConsoleUI.promptForChar("Enter Chracter:", Character.MIN_VALUE, Character.MAX_VALUE);
		if (c >= 'a' && c <= 'm')
			c += 13;
		else if (c >= 'n' && c <= 'z')
			c -= 13;
		System.out.println(c);
	}

	public static void FloatConv() throws IOException {
		int one = ConsoleUI.promptForInt("Enter Number:", Integer.MIN_VALUE, Integer.MAX_VALUE);
		int two = ConsoleUI.promptForInt("Enter Number:", Integer.MIN_VALUE, Integer.MAX_VALUE);
		int three = ConsoleUI.promptForInt("Enter Number:", Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.println((float) (one + two + three) / 3);
	}

	public static void StringToNumConvAndSubString() throws IOException {
		String userDigit = ConsoleUI.promptForInput("Enter Number:", false);
		float Conv = (float) (Integer.parseInt(userDigit) / Math.PI);
		String ConV = String.valueOf(Conv);
		System.out.println(ConV.charAt(0));
	}

	public static void IndexOf() throws IOException {
		String user = ConsoleUI.promptForInput("Enter String With a $", false);
		int Location = 0;
		for (int i = 0; i < user.length(); i++) {
			if (user.charAt(i) == '$')
				Location = i;
		}
		System.out.println(Location);
	}

	public static void IndexOfandSubString() throws IOException {
		String user = ConsoleUI.promptForInput("Enter String With a $", false);
		int Location = 0;
		for (int i = 0; i < user.length(); i++) {
			if (user.charAt(i) == '$')
				Location = i;
		}		
		for (int g = Location + 1; g < user.length(); g++) {
			System.out.print((char) user.charAt(g));
		}
		System.out.print(" ");
		for (int f = 0; f < Location; f++) {
			System.out.print((char) user.charAt(f));
		}
	}

	public static void SubstringAndAlgorithm() throws IOException {
		String user = ConsoleUI.promptForInput("Enter String With 2 $", false);
		for (int i = user.length() - 1; i >= 0; i--) {
			System.out.print(user.charAt(i));
		}
	}

	public static void SubStringAndSomeProblem() throws IOException {
		float number = ConsoleUI.promptForFloat("Enter float:", Float.MIN_VALUE, Float.MAX_VALUE);
		System.out.println((short) number);
	}

	public static void SubStringAndConc() throws IOException {
		String user = ConsoleUI.promptForInput("Enter String with a $", false);
		int SpotOf$ = 0;
		for (int i = 0; i < user.length(); i++) {
			if (user.charAt(i) == '$')
				SpotOf$ = i;
		}
		for (int i = 0; i < SpotOf$; i++) {
			System.out.print((char) user.charAt(i));
		}
		System.out.print((char) user.charAt(SpotOf$ + 1));
		System.out.print((char) user.charAt(SpotOf$));
		for (int i = SpotOf$ + 2; i < user.length(); i++) {
			System.out.print(user.charAt(i));
		}
	}

	public static void SubStringAndConcAndProblemSolving() throws IOException{
		String one = ConsoleUI.promptForInput("Enter a String", false);
		String two = ConsoleUI.promptForInput("Enter a String", false);
		int length = two.length();
		int middle = length / 2;
		for (int i = 0; i < middle; i++){
			System.out.print((char) two.charAt(i));
		}
		System.out.print(one);
		for (int i = middle; i < two.length(); i++){
			System.out.print((char) two.charAt(i));
		}
	}

	public static void SimpleBranching() throws IOException {
		String user = ConsoleUI.promptForInput("Enter Name:", false);
		if (user.equals("Fred")) {
			System.out.println("Hello, Fred");
		}
	}

	public static void SimpleBranchingWithCompoundBoolean() throws IOException {
		String user = ConsoleUI.promptForInput("Enter Name:", false);
		if (user.equals("Fred") || user.equals("Barney")) {
			System.out.println("Hello, " + user);
		}
	}

	public static void SimpleBranchingWithCompoundBoolean2() throws IOException {
		String UserFirst = ConsoleUI.promptForInput("Enter first name:", false);
		String UserLast = ConsoleUI.promptForInput("Enter last name:", false);
		if (UserFirst.equals("Fred") && UserLast.equals("Flintstone")) {
			System.out.println("Hello, Fred Flintstone");
		}
	}

	public static void SimpleBranchingWithNot() throws IOException {
		String user = ConsoleUI.promptForInput("Enter Name:", false);
		if (!user.equals("Fred")) {
			System.out.println("Hello");
		}
	}

	public static void SimpleBranchingWithElse() throws IOException {
		String user = ConsoleUI.promptForInput("Enter Name:", false);
		if (user.equals("Fred")) {
			System.out.println("Hello, Fred");
		} else {
			System.out.println("Hello, " + user);
		}
	}

	public static void SimpleBranchingWithBlock() throws IOException {
		String user = ConsoleUI.promptForInput("Enter Name:", false);
		if (user.equals("Fred")) {
			String last = ConsoleUI.promptForInput("Enter last name:", false);
			System.out.println("Hello, Fred " + last);
		}
	}
}
