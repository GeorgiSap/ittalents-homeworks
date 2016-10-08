package homework5;
import java.util.Scanner;

public class Zadacha1 {

	public static void main(String[] args) {
		String text1 = enterString("first");
		String text2 = enterString("second");
		text1 = text1.toUpperCase();
		System.out.print(text1 + " ");
		text1 = text1.toLowerCase();
		System.out.print(text1 + " ");
		text2 = text2.toUpperCase();
		System.out.print(text2 + " ");
		text2 = text2.toLowerCase();
		System.out.print(text2);
	}

	static String enterString(String countText) {
		Scanner sc = new Scanner(System.in);
		boolean isLetter = true;
		boolean isShorterThan40 = true;
		String text = "";
		do {
			System.out.println("Enter " + countText + " string:");
			text = sc.nextLine();
			isShorterThan40 = validateLength(text);
			isLetter = validateIfLettersOnly(text);
		} while (!isLetter || !isShorterThan40);
		return text;
	}

	static boolean validateLength(String text) {
		boolean isShorterThan40 = (text.length() > 40) ? false : true;
		return isShorterThan40;
	}

	static boolean validateIfLettersOnly(String text) {
		boolean isLetter = true;
		for (int index = 0; index < text.length(); index++) {
			if ((text.charAt(index) < 65 || text.charAt(index) > 90)
					&& (text.charAt(index) < 97 || text.charAt(index) > 123)) {
				isLetter = false;
			}
		}
		return isLetter;
	}

}
