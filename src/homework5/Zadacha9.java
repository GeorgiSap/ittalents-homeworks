package homework5;
import java.util.Scanner;

public class Zadacha9 {

	public static void main(String[] args) {
		
		String str = new Scanner(System.in).nextLine();
		String newStr = "";
		boolean isNewNum = false;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == '-' || (str.charAt(index) >= '0' && str.charAt(index) <= '9')) {
				if (isNewNum) {
					newStr += ' ';
					isNewNum = false;
				}
				newStr += str.charAt(index);
			} else {
				if (!isNewNum) {
					isNewNum = true;
				}
			}
		}
		newStr = newStr.trim();
		String[] nums = newStr.split(" ");
		int sum = 0;
		for (int index = 0; index < nums.length; index++) {
			sum += Integer.parseInt(nums[index]);
			System.out.println(nums[index]);
		}
		System.out.println("Suma = " + sum);
	}

}
