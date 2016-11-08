import java.util.Random;

public class array {
    
    public static void main(String[] args) {
        int size = 5;
        int max = 50; 
        int[] array = new int[size]; 

        Random generator = new Random();

        for (int i = 0; i<size; i++)
        {
            int number = generator.nextInt(max + 1);
            array[i] = number;
        }
        for (int i = size; i > 0; i--)
        {
        	System.out.println(i-1 + ": " + array[i-1]);
        } 
    }
}