import java.text.DecimalFormat;
import java.util.Random;

public class RollingDice {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		int size = 10;
		int max = 6;
		double[] array = new double[size];

		Random generator = new Random();

		for (int i = 0; i < size; i++) 
		{
			int number = (generator.nextInt(max) + 1);
			array[i] = number;
			System.out.println("Roll " + (i + 1) + ": " + number);
		}

		double Roll1 = array[0];
		double Roll2 = array[1];
		double Roll3 = array[2];
		double Roll4 = array[3];
		double Roll5 = array[4];
		double Roll6 = array[5];
		double Roll7 = array[6];
		double Roll8 = array[7];
		double Roll9 = array[8];
		double Roll10 = array[9];

		double Mean = ((Roll1 + Roll2 + Roll3 + Roll4 + Roll5 + Roll6 + Roll7 + Roll8 + Roll9 + Roll10) / 10);

		System.out.println("Mean: " + df.format(Mean));

		double Mode = array[0];
		int count = 0;
		int lastcount = 0;

		for (int i = 0; i < size; i++)
		{

			for (int j = i; j < size; j++)
			{

				if (i != j && array[i] == array[j])
				{
					count++;

					if (count > lastcount)
					{
						Mode = array[i];
					}
					lastcount = count;
				}
				count = 0;
			}
		}

		System.out.println("Mode: " + df.format(Mode));

		double Sum = (Roll1 + Roll2 + Roll3 + Roll4 + Roll5 + Roll6 + Roll7 + Roll8 + Roll9 + Roll10);

		System.out.println("Sum: " + df.format(Sum));

		double maximum = 0;
		
		for (int g = 0; g < size; g++) 
		{
			if (array[g] > maximum)
			{
				maximum = array[g];
			}
		}
		
		System.out.println("Max: " + maximum);
		
		double minimum = 10;
		
		for (int h = 0; h < size; h++)
		{
			if (array[h] < minimum)
			{
				minimum = array[h];
			}
		}
		
		System.out.println("Min: " + minimum);
	}

}
