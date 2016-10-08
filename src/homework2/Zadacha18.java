package homework2;
import java.util.Scanner;

public class Zadacha18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		do {
			System.out.println("Enter a:");
			a = sc.nextInt();
			System.out.println("Enter b:");
			b = sc.nextInt();
		}
		while ((a < 1 || a > 9) || (b < 1 || b > 9));
		
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				System.out.print(i + "*" + j +"=" + (i*j) + "; ");
			}
			System.out.println();
		}

	}

}
