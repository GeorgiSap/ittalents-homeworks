package homework3;
import java.util.Scanner;

public class Zadacha2 {

	public static void main(String[] args) {
		
		int [] a = new int[7];
		Scanner sc = new Scanner(System.in);
		int sub = 1;
		for (int index = 0; index < a.length; index++) {
			a[index] = sc.nextInt();
		}
		
		int [] b = new int[a.length*2];
		
		for (int index = 0; index < b.length; index++) {
			if (index < a.length) {
				b[index] = a[index];
			}
			else {
				b[index] = a[index - sub];
				sub += 2;
			}
		}
		
		for (int index = 0; index < b.length; index++) {
			System.out.print(b[index] + " ");
		}

	}

}
