package homework1;
import java.util.Arrays;
import java.util.Scanner;

public class Zadacha5 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete A:");
		int numA = sc.nextInt();
		System.out.println("Vuvedete B:");
		int numB = sc.nextInt();
		System.out.println("Vuvedete C:");
		int numC = sc.nextInt();
		
		int[] nums = {numA, numB, numC};
		Arrays.sort(nums);
		for (int i = nums.length -1; i >= 0; i--) {
			System.out.println(nums[i]);
		}

	}

}
