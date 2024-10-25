import java.util.*;
import java.io.*;

public class createExercise12_15 {
	public static void main(String[] args) throws java.io.IOException{
		java.io.File file = new java.io.File("Exercise12_15.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}
		try (
		java.io.PrintWriter output = new java.io.PrintWriter(file);
		) {
			int i = 0;
			for (i = 0; i < 100; i++) {
				output.print((int)(Math.random()*100)+1);
				output.print(" ");
			}
			
			Scanner input = new Scanner(new File("Exercise12_15.txt"));
			
			i = 0;
			int[] array = new int[100];
			//while (input.hasNext()) {
			for(i = 0; i < 100; i++){
				array[i] = input.nextInt();
				i++;
			}
			input.close();
			
			Arrays.sort(array);
			for (i = 0; i < 100; i++) {
				System.out.print(array[i] + " ");
			}
			
		}
		
	}
}