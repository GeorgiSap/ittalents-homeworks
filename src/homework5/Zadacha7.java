package homework5;
import java.util.Scanner;

public class Zadacha7 {

	public static void main(String[] args) {
		
		String setOfWords = new Scanner(System.in).nextLine();
		String[] words = setOfWords.split(" ");
		int maxLength = 0;
		for (int index = 0; index < words.length; index++) {
			if (words[index].length() > maxLength) {
				maxLength = words[index].length();
			}
		}
		System.out.println(words.length + " dumi, naj-dulgata e s "+ maxLength + " simvola.");
	}

}
