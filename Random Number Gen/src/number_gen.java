import java.util.Random;
import edu.neumont.csc110.d.mytypes.WOC;

public class number_gen {

	
	public static WOC selectWOC() {
		WOC result;
		Random rng = new Random();
		int rn = rng.nextInt(3); // generates an int between 0 and 2
		
		if(rn == 0)
		{
			result = WOC.Rock;
		}
		else if(rn == 1)
		{
			result = WOC.Paper;			
		}
		else if(rn == 2)
		{
			result = WOC.Scissors;			
		}
		else
		{
			result = null;
		}
		return result;
	}
	
	public static void main(String[] args) {
		WOC result;
		result = selectWOC();
		System.out.println(result);
	}

}
