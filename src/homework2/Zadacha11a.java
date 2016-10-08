package homework2;
import java.util.Scanner;

public class Zadacha11a {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete chislo");
		int n = sc.nextInt();
		String sign = "*";
		String space = "";
		String spaceBetween = "";
		int count = n - 1;
		for (int row = 0; row < n; row++) {	
			space = "";
			for (int i = 0; i < count; i++) {
				space += " ";
			}
			count--;
			System.out.print(space);
			
			if (row == 0) {
				System.out.println("*");
			}
			if (row == n - 1) {
				System.out.println(sign);
				
			}
			sign += "**";
			
			if (row != 0 && row != n - 1) {
				if (row != 1) {
					spaceBetween += "  ";
				}
				else {
					spaceBetween += " ";
				}
				System.out.println("*" + spaceBetween + "*");
			}
			
		}

	}

}
