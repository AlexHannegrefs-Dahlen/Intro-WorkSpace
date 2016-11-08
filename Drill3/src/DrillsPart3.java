import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Random;

public class DrillsPart3 {
	enum Triangle {
		Scalene, Isosceles, Equalateral,
	}

	// Use in for user input
	public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	// Use out instead of System.out for output
	public static PrintStream out = System.out;

	public static Random gen = new Random();

	public static void main(String[] args) throws IOException {
		// Use this method to test your code.

		// deepArrayCopy1();
		// stringsAsCharArrays2();
		// stringsAsCharArraysBackwards3();
		// arraySum4();
		// reverseArray5();
		// findAValue6();
		// findAValue7();
		// simpleMethod8();
		// twoMethods9();
		// nestedMethods10();
		// returnValues11();
		// returnValueTypes12();
		// functions13();
		// writeMaxAndMin14();
		// arrayPrintingMethod15();
		// arraySummingMethod16();
		// arrayCopyMethod17();
		// writeArrayReversalMethod18();
		// writeStringReversalMethod19();
		// countLetterOccurrences20();
		// beerOnTheWall21();
		// classifyTriangle22();
		// areaOfARectangle23();
		// volumeOfASphere24();
		// binaryNumberString25();
	}

	public static void deepArrayCopy1() {
		// a. Create an array of int
		// b. Initialize the array with index values (E.g., [0, 1, 2, 3, 4, 5,
		// ...])
		// c. Copy the array into an Integer array (not int)
		// d. Modify the first array
		// e. Print out values
		// f. Do the same with an Integer array
		// g. Note that the behavior is different. Explain the difference in a
		// comment
		Integer[] array = new Integer[11];
		int[] array2 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < array2.length; i++) {
			array[i] = array2[i];
		}
		array2[0] = 10;
		System.out.println(Arrays.toString(array2));
		array[0] = 10;
		System.out.println(Arrays.toString(array));
	}

	public static void stringsAsCharArrays2() throws IOException {
		// a. Query a string from a user
		// b. Query a number N from a user
		// c. Print the Nth char of the string
		out.println("Enter a string");
		String user = in.readLine();
		out.println("Enter a number");
		String n = in.readLine();
		int N = Integer.parseInt(n);
		out.println(user.charAt(N));
	}

	public static void stringsAsCharArraysBackwards3() throws IOException {
		// a. Query a string from the user
		// b. Use a char array to print the chars backwards
		out.println("Enter a String");
		String user = in.readLine();
		char[] User = new char[user.length()];
		for (int i = 0; i < user.length(); i++) {
			User[i] = user.charAt(i);
		}
		for (int i = user.length(); i > 0; i--) {
			out.print(User[i - 1]);
		}

	}

	public static void arraySum4() {
		// a. Create an array of 100 random ints between 0-100
		// b. Calculate the average value of the array (using floating point
		// arithmetic)
		int[] average = new int[100];
		double MathAverage = 0;
		for (int i = 0; i < 100; i++) {
			average[i] = gen.nextInt(101);
			MathAverage += average[i];
		}
		MathAverage = MathAverage / 100;
		out.println(MathAverage);

	}

	public static void reverseArray5() {
		// a. Create an array of 100 random ints between 0-100
		// b. Print the array
		// c. Reverse the values so that the value at 0 becomes the value at 99,
		// etc.
		// d. Print the array
		int[] MyArray = new int[100];
		for (int i = 0; i < 100; i++) {
			out.print(i + ": " + (MyArray[i] = gen.nextInt(101)) + " ");

		}
		out.println(" ");
		for (int i = 0; i < MyArray.length / 2; i++) {
			int temp = MyArray[i];
			MyArray[i] = MyArray[MyArray.length - i - 1];
			MyArray[MyArray.length - i - 1] = temp;
		}
		for (int i = 0; i < MyArray.length; i++) {
			out.print(i + ": " + MyArray[i] + " ");
		}

	}

	public static void findAValue6() {
		// a. Create an array of 100 random ints between 0-100
		// b. Find the first value greater that 90
		// c. Print the value and its index index
		int[] MyArray = new int[100];
		for (int i = 0; i < 100; i++) {
			out.print(i + ": " + (MyArray[i] = gen.nextInt(101)) + " ");
			if (MyArray[i] > 90) {
				out.println(i + ": " + MyArray[i]);
			}
		}
	}

	public static void findAValue7() {
		// a. Create an array of 100 random ints between 0-100
		// b. Find the last value greater than 90
		// c. Print the value and its index
		int[] MyArray = new int[100];
		for (int i = 0; i < 100; i++) {
			out.print(i + ": " + (MyArray[i] = gen.nextInt(101)) + " ");
			if (MyArray[i] > 90) {
				out.println(i + " " + MyArray[i]);
			}
		}
	}

	public static void simpleMethod8() {
		// a. Create a method named simpleMethod8_m1 that prints m1
		// b. Write the code here to call m1
		simpleMethod8_m1();
	}

	public static void simpleMethod8_m1() {
		out.println("m1");
	}

	public static void twoMethods9() {
		// a. Create methods twoMethods9_m1 and twoMethods9_m2 that print out m1
		// and m2
		// b. Write the code here to call m1 followed by m2
		twoMethods9_m1();
		twoMethods9_m2();
	}

	public static void twoMethods9_m1() {
		out.println("m1");
	}

	public static void twoMethods9_m2() {
		out.println("m2");
	}

	public static void nestedMethods10() {
		// a. Create methods nestedMethods10_m1, nestedMethods10_ma and
		// nestedMethods10_mb
		// b. Have method nestedMethods10_m1 call nestedMethods10_ma and
		// nestedMethods10_mb
		// c. Write the code here to call nestedMethods10_m1
		nestedMethods10_m1();
	}

	public static void nestedMethods10_m1() {
		nestedMethods10_ma();
		nestedMethods10_mb();
	}

	public static void nestedMethods10_ma() {

	}

	public static void nestedMethods10_mb() {

	}

	public static void returnValues11() {
		// a. Create a method that returns a constant (final) int
		// b. Call the method
		FinalInt();
	}

	public static int FinalInt() {
		final int g = 0;
		return g;
	}

	public static void returnValueTypes12() {
		// a. Create a method to return an int and another to return a String
		// b. Call the methods
		ReturnInt();
		ReturnString();
	}

	public static int ReturnInt() {
		return 0;
	}

	public static String ReturnString() {
		return "String";
	}

	public static void functions13() {
		// a. Create methods to add, subtract, mult and divide
		// b. Call methods with different parameters
		add(10, 5);
		sub(10, 5);
		mult(10, 5);
		div(10, 5);
	}

	public static double add(double one, double two) {
		double add = one + two;
		return add;
	}

	public static double sub(double one, double two) {
		double sub = one - two;
		return sub;
	}

	public static double mult(double one, double two) {
		double mult = one * two;
		return mult;
	}

	public static double div(double one, double two) {
		double div = one / two;
		return div;
	}

	public static void writeMaxAndMin14() {
		// a. Fill an array with random numbers
		// b. Find the largest and smallest value in the array and print them
		// out
		int[] average = new int[100];
		int largest = 0;
		int smallest = 100;
		for (int i = 0; i < 100; i++) {
			average[i] = gen.nextInt(101);
			if (average[i] > largest) {
				largest = average[i];
			}
			if (average[i] < smallest) {
				smallest = average[i];
			}
		}
		out.println("Largest: " + largest);
		out.println("Smallest: " + smallest);
	}

	public static void arrayPrintingMethod15() {
		// a. Create a program with a method to print an array
		// b. Call the method on two arrays with different sizes filled with
		// random numbers
		int[] one = new int[10];
		int[] two = new int[100];
		one = fillarray(one);
		two = fillarray(two);
	}

	public static int[] fillarray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = gen.nextInt(101);
		}
		return array;
	}

	public static void arraySummingMethod16() {
		// a. Create a method with an array parameter to sum the array
		// b. Call the method on two arrays with different sizes filled with
		// random numbers
		int[] one = new int[10];
		int[] two = new int[100];
		one = fillarray(one);
		two = fillarray(two);
		sumarray(one);
		sumarray(two);
	}

	public static int sumarray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	public static void arrayCopyMethod17() {
		// a. Create a program with a method to copy one array into another
		// b. Call the method and print both arrays
		int[] one = new int[10];
		one = fillarray(one);
		int[] one2 = copyArray(one);
		out.println(one.toString());
		out.println(one2.toString());
	}

	public static int[] copyArray(int[] array) {
		int[] array2 = array.clone();
		return array2;
	}

	public static void writeArrayReversalMethod18() {
		// a. Create a method with an array parameter to reverse the elements in
		// the array
		// b. Call the method on two arrays with different sizes filled with
		// random numbers
		int[] one = new int[10];
		int[] two = new int[100];
		one = fillarray(one);
		two = fillarray(two);
		one = reverse(one);
		two = reverse(two);
	}

	public static int[] reverse(int[] array) {
		int temp;
		for (int i = 0; i < array.length / 2; i++) {
			temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		return array;
	}

	public static void writeStringReversalMethod19() throws IOException {
		// a. Create a method with a string parameter that will reverse the
		// string
		// b. Read two strings, call the method for each
		// c. Print all four strings
		out.println("Enter first string: ");
		String one = in.readLine();
		out.println("Enter second string: ");
		String two = in.readLine();

		String oneR = reverseString(one);
		String twoR = reverseString(two);

		out.println(one);
		out.println(two);
		out.println(oneR);
		out.println(twoR);
	}

	public static String reverseString(String reversal) {
		String reversed = new StringBuilder(reversal).reverse().toString();
		return reversed;
	}

	public static void countLetterOccurrences20() throws IOException {
		// a. Create a method with a string parameter and a char parameter that
		// counts the number of occurrences of the char in the string and
		// returns the result as an int
		// b. Read a string and a char, call the method with those parameters
		// c. Print the results
		// d. Repeat b & c with a different string and char
		int times = 0;
		while (times == 0 || times == 1) {
			out.println("Enter String");
			String phrase = in.readLine();
			out.println("Enter Char");
			String Char = in.readLine();
			char Check = Char.charAt(0);
			int number = CharInAString(phrase, Check);
			out.println(number);
			times++;
		}
	}

	public static int CharInAString(String user, char Check) {
		int NumberOfTimesInString = 0;
		for (int i = 0; i < user.length(); i++) {
			if (Check == user.charAt(i)) {
				NumberOfTimesInString++;
			}
		}
		return NumberOfTimesInString;
	}

	public static void beerOnTheWall21() {
		// a. Write the code to to print ALL the lyrics to “99 bottles of beer
		// (or pop)”
		for (int i = 99; i > 0; i--) {
			if (i == 1) {
				out.println(i + " little bug in the code " + i + " bugs. Take one down, patch it around, " + (i - 1)
						+ " bugs in the code.");
			} else {
				out.println(i + " little bugs in the code " + i + " bugs. Take one down, patch it around, " + (i - 1)
						+ " bugs in the code.");
			}
		}

	}

	public static void classifyTriangle22() throws IOException {
		// a. Write a method to classify a triangle.
		// b. The method receives three parameters representing the three sides
		// of a triangle. The method returns an enum: Equilateral, Isosceles,
		// Scalene
		out.println("Enter Length:");
		String l1 = in.readLine();
		double L1 = Double.parseDouble(l1);
		out.println("Enter Length:");
		String l2 = in.readLine();
		double L2 = Double.parseDouble(l2);
		out.println("Enter Length:");
		String l3 = in.readLine();
		double L3 = Double.parseDouble(l3);

		out.println(ClassTri(L1, L2, L3));
	}

	public static Triangle ClassTri(double a, double b, double c) {
		if (a == b) {
			if (a == c) {
				return Triangle.Equalateral;
			} else {
				return Triangle.Isosceles;
			}
		} else if (a == c){
			return Triangle.Isosceles;
		} else {
			return Triangle.Scalene;
		}
	}

	public static void areaOfARectangle23() throws IOException {
		// a. Create a method that calculates the area of a rectangle and
		// returns it (floating point arithmetic)
		// b. Read a length and a width from the user, call the method with
		// those as parameters, print out the result
		out.println("Enter width:");
		String w = in.readLine();
		double W = Double.parseDouble(w);

		out.println("Enter length:");
		String l = in.readLine();
		double L = Double.parseDouble(l);

		out.println(CalcArea(W, L));
	}

	public static float CalcArea(double a, double b) {
		return (float) (a * b);
	}

	public static void volumeOfASphere24() throws IOException {
		// a. Create a method that calculates the volume of a sphere given the
		// radius
		// b. Read a radius from the user, call the method with the radius
		// c. Print the returned value
		out.println("Enter Radius");
		String radius = in.readLine();
		double Rad = Integer.parseInt(radius);
		out.print(VolSphere(Rad));
	}

	public static double VolSphere(double Rad) {
		double Vol = (4 / 3) * Math.PI * Math.pow(Rad, 3);
		return Vol;
	}

	public static void binaryNumberString25() throws IOException {
		// a. Read a int greater than 100 from the user
		// b. Convert the int to the equivalent string of binary digits and
		// print it out
		// i. For example given the number 128, print the string “10000000”
		out.println("Enter a Integer");
		String Int = in.readLine();
		int number = Integer.parseInt(Int);
		String bin = Integer.toString(number, 2);
		out.print(bin);
	}

}