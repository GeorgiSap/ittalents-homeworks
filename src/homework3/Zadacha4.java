package homework3;
import java.util.Scanner;

public class Zadacha4 {

	public static void main(String[] args) {
		
		int [] a = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int index = 0; index < a.length; index++) {
			a[index] = sc.nextInt();
		}
		boolean isMirrored = true;
		for (int index = 0; index < a.length/2; index++) {
			if (a[index] != a[a.length - 1 - index]) {
				isMirrored = false;
				break;
			}
		}
		
		if (isMirrored) {
			System.out.println("Ogledalen e.");
		}
		else {
			System.out.println("Ne e ogledalen.");
		}

	}

}
