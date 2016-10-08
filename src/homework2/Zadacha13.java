package homework2;
import java.util.Scanner;

public class Zadacha13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum;
		int n1, n2, n3;
		
		do {
			System.out.println("Enter sum:");
			sum = sc.nextInt();
		}
		while (sum < 2 || sum > 27);

		for (int num = 100; num < 1000; num++) {
			n1 = num % 10;
			n2 = ((num % 100) - n1)/10;
			n3 = (num - n1 - (n2 * 10))/100;
			if (n1 + n2 + n3 == sum) {
				System.out.print(num + " ");
			}
		}
	}

}
