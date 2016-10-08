package homework2;
import java.util.Scanner;

public class Zadacha19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;

		do {
			System.out.println("Enter num");
			num = sc.nextInt();

		} while(num < 10 || num > 99);
		
		do {
			if (num % 2 == 0) {
				num /= 2;
			}
			else {
				num = (num*3) + 1;
			}
			System.out.print(num + " ");
		} while(num != 1);

	}

}
