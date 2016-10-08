package homework1;

import java.util.Scanner;

public class Zadacha7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete chas:");
		int hour = sc.nextInt();
		System.out.println("Vuvedete suma pari:");
		double money = sc.nextDouble();
		System.out.println("Vuvedete dali ste zdrav:");
		boolean isHealthy = sc.nextBoolean();

		if (!isHealthy) {
			System.out.println("Niama da izlizam");
			if (money > 0) {
				System.out.println("Shte si kupia lekarstva");
			} else {
				System.out.println("Shte stoia vkushti i shte pia chai");
			}
		} else {
			if (money >= 10) {
				System.out.println("Shte otida na kino s priateli");
			} else {
				System.out.println("Shte otida na kafe");
			}
		}
	}

}
