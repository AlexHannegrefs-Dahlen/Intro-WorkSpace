package Calculator.assests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCalculator {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Choose one of the following: Addition, Subtraction, Division, Multiplication, and other");
		String function = in.readLine();

		if (function.equals("Addition")) {
			System.out.println("First Number?");
			String First = in.readLine();
			System.out.println("Second Number");
			String Second = in.readLine();
			int one = Integer.parseInt(First);
			int two = Integer.parseInt(Second);
			int plus = addition(one, two);
			System.out.println(plus);
		}
		if (function.equals("Subtraction")) {
			System.out.println("First Number?");
			String First = in.readLine();
			System.out.println("Second Number");
			String Second = in.readLine();
			int one = Integer.parseInt(First);
			int two = Integer.parseInt(Second);
			int plus = Subtraction(one, two);
			System.out.println(plus);
		}
		if (function.equals("Division")) {
			System.out.println("First Number?");
			String First = in.readLine();
			System.out.println("Second Number");
			String Second = in.readLine();
			int one = Integer.parseInt(First);
			int two = Integer.parseInt(Second);
			int plus = Division(one, two);
			System.out.println(plus);
		}
		if (function.equals("Multiplication")) {
			System.out.println("First Number?");
			String First = in.readLine();
			System.out.println("Second Number");
			String Second = in.readLine();
			int one = Integer.parseInt(First);
			int two = Integer.parseInt(Second);
			int plus = Multiplication(one, two);
			System.out.println(plus);
		}
		if (function.equals("other")) {
			System.out.println("tempf2c, tempc2f, exp, sprt, sin, cos, and random");
			String Advanced = in.readLine();
			if (Advanced.equals("tempc2f")) {
				System.out.println("Temperture value?");
				String Cel = in.readLine();
				double one = Integer.parseInt(Cel);
				double plus = tempc2f(one);
				System.out.println(plus);
			}
			if (Advanced.equals("tempf2c")) {
				System.out.println("Temperture value?");
				String far = in.readLine();
				double one = Integer.parseInt(far);
				double plus = tempf2c(one);
				System.out.println(plus);
			}
			if (Advanced.equals("exp")) {
				System.out.println("Number to use the exponient?");
				String Num = in.readLine();
				System.out.println("Exponient?");
				String Exp = in.readLine();
				double one = Double.parseDouble(Num);
				double two = Double.parseDouble(Exp);
				double plus = exp(one, two);
				System.out.println(plus);
			}
		}
	}

	public static int addition(int one, int two) {
		int plus = one + two;
		return plus;

	}

	public static int Subtraction(int one, int two) {
		int plus = one - two;
		return plus;
	}

	public static int Division(int one, int two) {
		int plus = one / two;
		return plus;
	}

	public static int Multiplication(int one, int two) {
		int plus = one * two;
		return plus;
	}

	public static double tempc2f(double one) {
		double plus = one * 9 / 5 + 32;
		return plus;
	}

	public static double tempf2c(double one) {
		double plus = (one - 32) * 5 / 9;
		return plus;
	}

	public static double exp(double one, double two) {
		double plus = Math.pow(one, two);
		return plus;
	}
}
