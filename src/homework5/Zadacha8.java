package homework5;
import java.util.Scanner;

public class Zadacha8 {
	public static void main(String[] args) {
		String str = new Scanner(System.in).nextLine();
		boolean isPalindrome = true;
		for (int index = 0; index < str.length()/2; index++) {
			if (str.charAt(index) != str.charAt(str.length() - 1 - index)) {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
			System.out.println("da.");
		} else {
			System.out.println("ne.");
		}
	}
}
