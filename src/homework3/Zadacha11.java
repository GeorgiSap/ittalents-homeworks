package homework3;
import java.util.Scanner;

public class Zadacha11 {

	public static void main(String[] args) {
		
		int[] a = new int[7];
		Scanner sc = new Scanner(System.in);
		for (int index = 0; index < a.length; index++) {
			a[index] = sc.nextInt();
		}
		for (int index = 0; index < a.length; index++) {
			if (a[index] % 5 == 0 && a[index] > 5) {
				System.out.print(a[index] + " ");
			}
		}

	}

}
