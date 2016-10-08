package homework5;
import java.util.Scanner;

public class Zadacha11 {

	public static void main(String[] args) {

		String str = new Scanner(System.in).nextLine();
		String[] strArr = str.split("");
		printArray(strArr);

	}
	
	static void printArray (String[] strArr) {
		for (int index = 0; index < strArr.length; index++) {
			System.out.print(strArr[index]);
		}
	}

}
