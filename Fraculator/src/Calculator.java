import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		MainMenu();
	}

	public static void MainMenu() throws IOException {
			System.out.println("Reduce Fraction, Perform Fraction Math, Exit");
			String user = in.readLine();
			if (user.equalsIgnoreCase("reduce fraction"))
			{
				reduceFraction();
			} 
			else if (user.equalsIgnoreCase("fraction math"))
			{
				mathMenu();
			}
			else if (user.equalsIgnoreCase("exit"))
			{
				Exit();
			} 
			else
			{
				System.out.println("Invalid Input");
				Exit();
			}
		
	}
	public static String[] getFraction() throws IOException{
		System.out.println("GetFraction");
		System.out.println("Enter Whole Number: ");
		String WholeR = in.readLine();
		System.out.println("Enter Numerator: ");
		String Num = in.readLine();
		System.out.println("Enter Denominator: ");
		String Den = in.readLine();
		String[] fract = new String[3];
		fract[0] = WholeR;
		fract[1] = Num;
		fract[2] = Den;
		return fract;
	}
	public static String[] getFraction1() throws IOException{
		System.out.println("GetFraction");
		System.out.println("Enter first Whole Number: ");
		String Whole = in.readLine();
		System.out.println("Enter first Numerator: ");
		String Num = in.readLine();
		System.out.println("Enter first Denominator: ");
		String Den = in.readLine();String[] fract = new String[3];
		fract[0] = Whole;
		fract[1] = Num;
		fract[2] = Den;
		return fract;
	}
	public static String[] getFraction2() throws IOException{
		System.out.println("GetFraction");
		System.out.println("Enter second Whole Number: ");
		String Whole = in.readLine();
		System.out.println("Enter second Numerator: ");
		String Num = in.readLine();
		System.out.println("Enter second Denominator: ");
		String Den = in.readLine();
		String[] fract = new String[3];
		fract[0] = Whole;
		fract[1] = Num;
		fract[2] = Den;
		return fract;
	}
	public static void reduceFraction() throws IOException{
		String[] fraction = getFraction();
		System.out.println("Reduse Fraction " + fraction[0] + " " + fraction [1] + "/" + fraction [2]);
	}
	public static void mathMenu() throws IOException{
		System.out.println("Add, Subtract, Multiply, Divide, Main Menu, Exit");
		String user = in.readLine();
		if(user.equalsIgnoreCase("Add"))
		{
			getFraction1();
			getFraction2();
		}
		else if(user.equalsIgnoreCase("Subtract"))
		{
			getFraction1();
			getFraction2();
		}
		else if(user.equalsIgnoreCase("Multiply"))
		{
			getFraction1();
			getFraction2();
		}
		else if(user.equalsIgnoreCase("Divide"))
		{
			getFraction1();
			getFraction2();
		}
		else if(user.equalsIgnoreCase("Main Menu"))
		{
			MainMenu();
		}
		else if(user.equalsIgnoreCase("Exit"))
		{
			Exit();
		}
		else
		{
			System.out.println("Invalid Input");
			Exit();
		}
	}
	public static void addFraction(){
		
	}
	public static void subFraction(){
		
	}
	public static void multFraction(){
	
	}
	public static void divFraction(){
		
	}
	public static void Exit(){
		System.out.println("Exiting");
		System.exit(0);
	}
}