package homework5;
import java.util.Arrays;
import java.util.Scanner;

public class Zadacha4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String[] names = text.split(", ");
		int sumFirstName = 0;
		for (int index = 0; index < names[0].length(); index++) {
			sumFirstName += names[0].charAt(index);
		}
		int sumSecondName = 0;
		for (int index = 0; index < names[1].length(); index++) {
			sumSecondName += names[1].charAt(index);
		}
		int largerSumNameIndex = (sumFirstName > sumSecondName) ? 0 : 1 ;
		System.out.println(names[largerSumNameIndex]);
	}

}
