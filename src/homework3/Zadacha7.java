package homework3;
import java.util.Scanner;

public class Zadacha7 {

	public static void main(String[] args) {

		int size = 5;
		int[] a = new int[size];
		Scanner sc = new Scanner(System.in);
		for (int index = 0; index < size; index++) {
			a[index] = sc.nextInt();
		}
		int[] b = new int[size];
		b[0] = a[0];
		b[size - 1] = a[size - 1];
		for (int index = 1; index < size - 1; index++) {
			b[index] = a[index - 1] + a[index + 1];
		}
		for (int index = 0; index < size; index++) {
			System.out.println(b[index] + " ");
		}
	}

}
