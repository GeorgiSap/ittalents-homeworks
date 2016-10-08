package homework5;
import java.util.Scanner;

public class Zadacha10 {

	public static void main(String[] args) {

		String str = new Scanner(System.in).nextLine();
		String newStr = "";
		for (int index = 0; index < str.length(); index++) {
			str = str.substring(0, index) + (char)(str.charAt(index) + 5) + str.substring(index + 1);
		}
		System.out.println(str);
	}

}
