import java.util.Scanner;

public class ArrayIndex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] indexList = new int[100];
		int i = 0;
		for (i=0; i < 100; i++) {
			indexList[i] = (int)(Math.random()*100)+1;
		}
		System.out.print("Enter Index: ");
		int userindex = input.nextInt();
		if (userindex > 100) {
			System.out.print("Out of Bounds");
			System.exit(1);
		}else if (userindex < 0) {
			System.out.print("Out of Bounds");
			System.exit(1);
		}
		System.out.print("Corresponding element value is: " + indexList[userindex - 1]);
	}
}