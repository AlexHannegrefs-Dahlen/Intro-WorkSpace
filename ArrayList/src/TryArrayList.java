import java.awt.List;
import java.util.ArrayList;

public class TryArrayList {

	public static void main(String[] args) {
		int[] array = new int[10];
		ArrayList<Integer> list = new ArrayList<>();
		
		array[0] = 5;
		list.add(0, 5);
		list.add(6);	
		
		System.out.println(array.length);
		System.out.println(list.size());
		
		System.out.println(array[0]);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list); //does the same as a for loop
		
		/*for(Object obj : list){
			System.out.println(obj);  //does the same as a for loop
		}*/
	}

}
