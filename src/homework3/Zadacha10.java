package homework3;
import java.util.Scanner;

public class Zadacha10 {

	public static void main(String[] args) {

		int[] a = new int[7];
		Scanner sc = new Scanner(System.in);
		float avarageValue = 0;
		for (int index = 0; index < a.length; index++) {
			a[index] = sc.nextInt();
		}
		for (int index = 0; index < a.length; index++) {
			avarageValue += a[index];
		}
		avarageValue /= a.length;
		float smallestDiff = (avarageValue > a[0]) ?  avarageValue - a[0] : a[0] - avarageValue;
		int closestValue = a[0];
		for (int index = 1; index < a.length; index++) {
			if (((avarageValue > a[index]) ? avarageValue - a[index] : a[index] - avarageValue) < smallestDiff){
				smallestDiff = ((avarageValue > a[index]) ? avarageValue - a[index] : a[index] - avarageValue);
				closestValue = a[index];
			}
		}
		System.out.println(closestValue);
	}

}
