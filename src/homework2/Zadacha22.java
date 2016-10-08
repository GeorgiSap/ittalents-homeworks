package homework2;
import java.util.Scanner;

public class Zadacha22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("Enter num");
			num = sc.nextInt();

		} while(num < 1 || num > 999);

		int count = 1;
		
		while (count <= 10) {
			num++;
			while (num % 2 != 0 && num % 3 != 0 && num % 5 != 0){
				num++;
			}
			System.out.print(count + ":" + num);
			if (count != 10) {
				System.out.print(", ");
			}
			count++;
		}
		
	}

}
