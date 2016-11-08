import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BDayCalc {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Current Year: ");
		String year = br.readLine();
		int cyear = Integer.parseInt(year);
		System.out.println("Current Month: ");
		String month = br.readLine();
		int cmonth = Integer.parseInt(month);
		System.out.println("Current Day: ");
		String day = br.readLine();
		int cday = Integer.parseInt(day);
		
		System.out.println("Year Born: ");
		year = br.readLine();
		int byear = Integer.parseInt(year);
		System.out.println("Month Born: ");
		month = br.readLine();
		int bmonth = Integer.parseInt(month);
		System.out.println("Day Month: ");
		day = br.readLine();
		int bday = Integer.parseInt(day);
		
		int age;
		if(bmonth - cmonth > 0)
		{
			age = (cyear - byear) - 1;
		}
		else
		{
			age = cyear - byear;
		}
		
		System.out.println("You are " + age + " years old");
		String cmonth1 = cmonth(cmonth);
		System.out.println("Today is " + cmonth1 + " " + cday + " " + cyear);
		String bmonth1 = bmonth(bmonth);
		System.out.println("Your birthday is " + bmonth1 + " " + bday + " " + byear);
		
		if(byear - 1997 > 0)
		{
			System.out.println("You are younger than me");
		}
		else if(byear - 1997 < 0)
		{
			System.out.println("You are older than me");
		}
		else
		{
			if(bmonth - 11 > 0)
			{
				System.out.println("You are younger than me");

			}
			else if(bmonth - 11 < 0)
			{
				System.out.println("You are older than me");
			}
			else
			{
				if(bday - 12 > 0)
				{
					System.out.println("You are younger than me");

				}
				else if(bday - 12 < 0)
				{
					System.out.println("You are older than me");
				}
				else
				{
					System.out.println("WE ARE THE SAME AGE!!!");
				}
			}
		}
		
	}
	public static String cmonth(int cmonth)
	{
		String cmonth1 = "null";
		if(cmonth == 1)
		{
			cmonth1 = "Janurary";
		}
		else if(cmonth == 2)
		{
			cmonth1 = "Februrary";
		}
		else if(cmonth == 3)
		{
			cmonth1 = "March";
		}
		else if(cmonth == 4)
		{
			cmonth1 = "April";
		}
		else if(cmonth == 5)
		{
			cmonth1 = "May";
		}
		else if(cmonth == 6)
		{
			cmonth1 = "June";
		}
		else if(cmonth == 7)
		{
			cmonth1 = "July";
		}
		else if(cmonth == 8)
		{
			cmonth1 = "August";
		}
		else if(cmonth == 9)
		{
			cmonth1 = "September";
		}
		else if(cmonth == 10)
		{
			cmonth1 = "October";
		}
		else if(cmonth == 11)
		{
			cmonth1 = "November";
		}
		else
		{
			cmonth1 = "December";
		}
		return cmonth1;
	}
	public static String bmonth(int bmonth)
	{
		String bmonth1 = "null";
		if(bmonth == 1)
		{
			bmonth1 = "Janurary";
		}
		else if(bmonth == 2)
		{
			bmonth1 = "Februrary";
		}
		else if(bmonth == 3)
		{
			bmonth1 = "March";
		}
		else if(bmonth == 4)
		{
			bmonth1 = "April";
		}
		else if(bmonth == 5)
		{
			bmonth1 = "May";
		}
		else if(bmonth == 6)
		{
			bmonth1 = "June";
		}
		else if(bmonth == 7)
		{
			bmonth1 = "July";
		}
		else if(bmonth == 8)
		{
			bmonth1 = "August";
		}
		else if(bmonth == 9)
		{
			bmonth1 = "September";
		}
		else if(bmonth == 10)
		{
			bmonth1 = "October";
		}
		else if(bmonth == 11)
		{
			bmonth1 = "November";
		}
		else
		{
			bmonth1 = "December";
		}
		return bmonth1;
	}
}