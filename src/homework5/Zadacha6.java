package homework5;
import java.util.Scanner;

public class Zadacha6 {

	public static void main(String[] args) {
		String sentence = new Scanner(System.in).nextLine();
		String[] words = sentence.split(" ");
		for (int index = 0; index < words.length; index++) {
			words[index] = words[index].substring(0, 1).toUpperCase() + words[index].substring(1);
			System.out.print(words[index] + " ");
		}
	}

}
