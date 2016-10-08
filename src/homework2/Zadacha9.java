package homework2;
import java.util.Scanner;

public class Zadacha9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete A");
		int A = sc.nextInt();
		System.out.println("Vuvedete B");
		int B = sc.nextInt();
		int sum = 0;
		for (int i = A; i <= B; i++) {
			if (i*i % 3 != 0) {
				System.out.print(i*i);
				sum += i*i;
			} else {
				System.out.print("skip 3");
			}
			if (sum > 2000) {
				break;
			}
			if (i != B) {
			System.out.print(", ");
			}
		}
	}

}
