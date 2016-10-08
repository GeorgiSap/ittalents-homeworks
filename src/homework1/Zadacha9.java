package homework1;
import java.util.Scanner;

public class Zadacha9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		
		do {
			System.out.println("Vuvedete a:");
			a = sc.nextInt();
			System.out.println("Vuvedete b:");
			b = sc.nextInt();
		}
		while (a < 10 || a > 99 || b < 10 || b > 99);
		
		int prod = a * b;
		System.out.print(prod + " ");
		int lastDigit = prod % 10;
		System.out.print(lastDigit + " ");
		if (lastDigit % 2 == 0) {
			System.out.print("chetno");
		} else {
			System.out.print("nechetno");
		}
		

	}

}
