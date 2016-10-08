package homework5;
import java.util.Scanner;

public class Zadacha2 {

	public static void main(String[] args) {
		String word1 = enterString ("first");
		String word2 = enterString ("second");
		int longer = (word1.length() > word2.length()) ? word1.length() : word2.length();
		System.out.print(longer + " ");
		String word1First5 = word1.substring(0, 5);
		String word2First5 = word2.substring(0, 5);
		word1 = word2First5 + word1.substring(5);
		word2 = word1First5 + word2.substring(5);
		System.out.print(word1 + " ");
		System.out.print(word2);
	}
	
	static String enterString (String count) {
		Scanner sc = new Scanner(System.in);
		boolean isLetter = true;
		boolean isBetween10And20 = true;
		String word = "";
		do {
			System.out.println("Enter "+ count +" string:");
			word = sc.next();
			isBetween10And20 = validateLength(word);
			isLetter = validateIfLettersOnly(word);
		}
		while (!isLetter || !isBetween10And20);
		return word;
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
	
	static boolean validateLength(String word) {
		boolean isBetween10And20 = (word.length() < 10 || word.length() > 20) ? false : true;
		return isBetween10And20;
	}
}
