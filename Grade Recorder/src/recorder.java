import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class recorder {
		static int size = 5;
	public static void main(String[] args) throws IOException {
		
        String[] name = new String[size];
        double[] grade = new double[size];
        boolean exit = false;
        String Name;
        String Grade;
        String student;
        String LetterGrade = null;
        int slotnum = 8;
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i<size; i++)
        {
           System.out.println("Student Name:");
           Name = in.readLine();
           System.out.println("Student Grade: ");
           Grade = in.readLine();
           double GradeNum = Double.parseDouble(Grade);
           
           name[i] = Name;
           grade[i] = GradeNum;
        }
        do
        {
        	System.out.println("Which Student?");
        	student = in.readLine();
        	if(student.equalsIgnoreCase("exit"))
        	{
        		exit = true;
        		System.out.println("Exiting");
        	}
        	else
        	{
        		
        		if(student.equalsIgnoreCase(name[0]))
        		{
        			slotnum = 0;
        			LetterGrade = convertgrade(grade, slotnum);
        		}
        		else if(student.equalsIgnoreCase(name[1]))
        		{
        			slotnum = 1;
        			LetterGrade = convertgrade(grade, slotnum);
        		}
        		else if(student.equalsIgnoreCase(name[2]))
        		{
        			slotnum = 2;
        			LetterGrade = convertgrade(grade, slotnum);
        		}
        		else if(student.equalsIgnoreCase(name[3]))
        		{
        			slotnum = 3;
        			LetterGrade = convertgrade(grade, slotnum);
        		}
        		else if(student.equalsIgnoreCase(name[4]))
        		{
        			slotnum = 4;
        			LetterGrade = convertgrade(grade, slotnum);
        		}
        		else
        		{
        			System.out.println("Invalid Name");
        		}
        		System.out.println(LetterGrade);
        	}
        	
        } while(exit == false);
        
     }
	private static String convertgrade(double[] grade, int slotnum) {
		String LetterGrade = null;
		
			if(grade[slotnum] >= 0 && grade[slotnum] < 60)
			{
				LetterGrade = "F";
			}
			else if(grade[slotnum] >= 60 && grade[slotnum] < 63)
			{
				LetterGrade = "D-";
			}
			else if(grade[slotnum] >= 63 && grade[slotnum] < 67)
			{
				LetterGrade = "D";
			}
			else if(grade[slotnum] >= 67 && grade[slotnum] < 70)
			{
				LetterGrade = "D+";
			}
			else if(grade[slotnum] >= 70 && grade[slotnum] < 73)
			{
				LetterGrade = "C-";
			}
			else if(grade[slotnum] >= 73 && grade[slotnum] < 77)
			{
				LetterGrade = "C";
			}
			else if(grade[slotnum] >= 77 && grade[slotnum] < 80)
			{
				LetterGrade = "C+";
			}
			else if(grade[slotnum] >= 80 && grade[slotnum] < 83)
			{
				LetterGrade = "B-";
			}
			else if(grade[slotnum] >= 83 && grade[slotnum] < 87)
			{
				LetterGrade = "B";
			}
			else if(grade[slotnum] >= 87 && grade[slotnum] < 90)
			{
				LetterGrade = "B+";
			}
			else if(grade[slotnum] >= 90 && grade[slotnum] < 93)
			{
				LetterGrade = "A-";
			}
			else if(grade[slotnum] >= 93 && grade[slotnum] < 100)
			{
				LetterGrade = "A";
			}
			else
			{
				LetterGrade = "Invalid Grade Entered";
			}
		
		return LetterGrade;
	}
	
}