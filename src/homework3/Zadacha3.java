package homework3;
import java.util.Scanner;

public class Zadacha3 {

	public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		int[] a = new int[10];
		a[0] = n;
		a[1] = n;
		for (int index = 2; index < a.length; index++) {
			a[index] = a[index - 1] + a[index - 2];
		}
		
		for (int index = 0; index < a.length; index++) {
			System.out.print(a[index] + " ");
		}
	

	}

}
