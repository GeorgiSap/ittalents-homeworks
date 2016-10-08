package homework3;
import java.util.Scanner;

public class Zadacha6 {

	public static void main(String[] args) {

		int[] a = new int[3];
		int[] b = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete masiv 1:");
		for (int index = 0; index < a.length; index++) {
			a[index] = sc.nextInt();
		}
		System.out.println("Vuvedete masiv 2:");
		for (int index = 0; index < b.length; index++) {
			b[index] = sc.nextInt();
		}
		if (a.length != b.length) {
			System.out.println("Masivite ne sa s ednakuv razmer/ ne sa ravni.");
		} else {
			System.out.println("Masivite sa s ednakuv razmer.");
			boolean areEqual = true;
			for (int index = 0; index < a.length; index++) {
				if (a[index] != b[index]) {
					areEqual = false;
					break;
				}
			}
			if (areEqual) {
				System.out.println("Masivite sa ednakvi.");
			} else {
				System.out.println("Masivite ne sa ednakvi.");
			}
		}

	}

}
