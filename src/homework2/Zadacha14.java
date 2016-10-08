package homework2;
import java.util.Scanner;

public class Zadacha14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("Enter sum:");
			n = sc.nextInt();
		}
		while (n < 10 || n > 200);
		
		for (int i = n - 1; i >= 7; i--) {
			if (i % 7 == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
