package homework2;
import java.util.Scanner;

public class Zadacha11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete chislo");
		int n = sc.nextInt();
		String sign = "*";
		String space = "";

		int count = n - 1;
		for (int row = 0; row < n; row++) {	
			space = "";
			for (int i = 0; i < count; i++) {
				space += " ";
			}
			count--;
			System.out.print(space);
			System.out.println(sign);
			sign += "**";
		}

	}

}
