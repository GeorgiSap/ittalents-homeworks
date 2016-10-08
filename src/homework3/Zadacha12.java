package homework3;
import java.util.Scanner;

public class Zadacha12 {

	public static void main(String[] args) {
		
		int[] a = new int[7];
		Scanner sc = new Scanner(System.in);
		for (int index = 0; index < a.length; index++) {
			a[index] = sc.nextInt();
		}
		
		int temp = a[0];
		a[0] = a[1];
		a[1] = temp;
		
		a[2] += a[3];
		a[3] = a[2] - a[3];
		a[2] -= a[3];
		
		a[4] *= a[5];
		a[5] = a[4] / a[5];
		a[4] /= a[5];
		
		for (int index = 0; index < a.length; index++) {
			System.out.print(a[index] + " ");
		}

	}

}
