package homework2;
import java.util.Scanner;

public class Zadacha16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n, m, min, max;
		
		do {
			System.out.println("Enter n:");
			n = sc.nextInt();
			System.out.println("Enter m:");
			m = sc.nextInt();
		}
		while ((n < 10 || n > 5555) || (m < 10 || m > 5555));

		min = n > m ? m : n;
		max = m <= n ? n : m;
		
		for (int i = max; i >= min; i--) {
			if (i % 50 == 0) {
				System.out.print(i + " ");
			}
		}
		
		
	}

}
