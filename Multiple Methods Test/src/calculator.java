import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Random;

public class calculator {

	public static void main(String[] args) throws IOException {
		DecimalFormat df = new DecimalFormat("####0.00");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("What function do you want to use?" + " Enter add for addition," + " sub for subtraction,"
				+ " mult for multiply," + " div for divide," + " exp for exponent," + " tempf2c for F to C,"
				+ " tempc2f for C to F," + " sqrt for square root," + " cos for cosine," + " sin for sin,"
				+ " random for random number.");
		String function = bf.readLine();

		if (function.equalsIgnoreCase("add")) {
			double n1 = BasicFunctionsOne();
			double n2 = BasicFunctionsTwo();
			double answer = add(n1, n2);
			System.out.print("Added: " + df.format(answer));
			String price = price1();
			System.out.println("Charged " + price);
		} else if (function.equalsIgnoreCase("sub")) {
			double n1 = BasicFunctionsOne();
			double n2 = BasicFunctionsTwo();
			double answer = subtract(n1, n2);
			System.out.print("Subtracted: " + df.format(answer));
			String price = price1();
			System.out.println("Charged " + price);
		} else if (function.equalsIgnoreCase("mult")) {
			double n1 = BasicFunctionsOne();
			double n2 = BasicFunctionsTwo();
			double answer = multiply(n1, n2);
			System.out.print("Multiplied: " + df.format(answer));
			String price = price1();
			System.out.println("Charged " + price);
		} else if (function.equalsIgnoreCase("div")) {
			double n1 = BasicFunctionsOne();
			double n2 = BasicFunctionsTwo();
			double answer = divide(n1, n2);
			System.out.print("Divided: " + df.format(answer));
			String price = price1();
			System.out.println("Charged " + price);
		} else if (function.equalsIgnoreCase("tempf2c")) {
			double d1 = degree();
			double answer = fc(d1);
			System.out.println(df.format(answer) + "C");
			String price = price25();
			System.out.println("Charged " + price);
		} else if (function.equalsIgnoreCase("tempc2f")) {
			double d1 = degree();
			double answer = cf(d1);
			System.out.println(df.format(answer) + "F");
			String price = price25();
			System.out.println("Charged " + price);
		} else if (function.equalsIgnoreCase("exp")) {
			double n1 = BasicFunctionsOne();
			double n2 = BasicFunctionsTwo();
			double answer = exponent(n1, n2);
			System.out.print("Exponential: " + df.format(answer));
			String price = price4();
			System.out.println("Charged " + price);
		} else if (function.equalsIgnoreCase("sqrt")) {
			double d1 = degree();
			double answer = squareroot(d1);
			System.out.println("Square Root: " + df.format(answer));
			String price = price4();
			System.out.println("Charged " + price);
		} else if (function.equalsIgnoreCase("cos")) {
			double d1 = degree();
			double answer = cosine(d1);
			System.out.println("Cos: " + df.format(answer));
			String price = price25();
			System.out.println("Charged " + price);
		} else if (function.equalsIgnoreCase("sin")) {
			double d1 = degree();
			double answer = sine(d1);
			System.out.println("Sine: " + df.format(answer));
			String price = price25();
			System.out.println("Charged " + price);
		} else if (function.equalsIgnoreCase("random")) {
			int d1 = number();
			int answer = random(d1);
			System.out.println("Number: " + df.format(answer));
			String price = price4();
			System.out.println("Charged " + price);
		} else {
			System.out.println("Invalid Function");
		}
	}

	public static String price1() {
		String price = ("$0.01");
		return price;
	}

	public static String price4() {
		String price = ("$0.04");
		return price;
	}

	public static String price25() {
		String price = ("$0.25");
		return price;
	}

	public static int number() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the highest number:");
		String deg1 = bf.readLine();

		int d1 = Integer.parseInt(deg1);

		return d1;
	}

	public static double degree() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value");
		String deg1 = bf.readLine();

		double d1 = Double.parseDouble(deg1);

		return d1;
	}

	public static double BasicFunctionsOne() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first number:");
		String num1 = bf.readLine();

		double n1 = Double.parseDouble(num1);

		return n1;
	}

	public static double BasicFunctionsTwo() throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter second number:");
		String num2 = bf.readLine();

		double n2 = Double.parseDouble(num2);

		return n2;
	}

	public static double add(double n1, double n2) {
		double answer = n1 + n2;
		return answer;
	}

	public static double subtract(double n1, double n2) {
		double answer = n1 - n2;
		return answer;
	}

	public static double multiply(double n1, double n2) {
		double answer = n1 * n2;
		return answer;
	}

	public static double divide(double n1, double n2) {
		double answer = n1 / n2;
		return answer;
	}

	public static double fc(double d1) {
		double answer = ((d1 - 32) * (5 / 9));
		return answer;
	}

	public static double cf(double d1) {
		double answer = ((d1 * (9 / 5)) + 32);
		return answer;
	}

	public static double exponent(double n1, double n2) {
		double answer = Math.pow(n1, n2);
		return answer;
	}

	public static double squareroot(double d1) {
		double answer = Math.sqrt(d1);
		return answer;
	}

	public static double cosine(double d1) {
		double answer = Math.cos(d1);
		return answer;
	}

	public static double sine(double d1) {
		double answer = Math.sin(d1);
		return answer;
	}

	public static int random(int d1) {
		Random rng = new Random();
		int answer = rng.nextInt(d1 + 1);
		return answer;
	}
}