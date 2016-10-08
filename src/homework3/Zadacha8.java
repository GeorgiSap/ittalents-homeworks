package homework3;
import java.util.Scanner;

public class Zadacha8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] a = new int[7];
		for (int index = 0; index < a.length; index++) {
			a[index] = sc.nextInt();
		}
		int startIndex = 0;
		int endIndex = 0;
		int maxLenght = 1;
		int maxIndex = 0;
		for (int index = 1; index < a.length; index++) {
			if (a[index] == a[startIndex]) {
				endIndex = index;
				if ((endIndex + 1 - startIndex) > maxLenght) {
					maxLenght = endIndex + 1 - startIndex;
					maxIndex = startIndex;
				} 
			}
			else {
				startIndex = index;
				endIndex = index;
			}
		}
		for (int index = maxIndex; index < maxIndex + maxLenght; index++) {
			System.out.print(a[index] + " ");
		}

	}

}
