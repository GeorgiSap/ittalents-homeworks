package homework1;

import java.util.Scanner;

public class Zadacha12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean isValid = true;
		int day, month, year;
		int monthLenght;
		
		do {
			if (!isValid) {
				System.out.println("Nevalidna data. Vuvedete otnovo.");
				isValid = true;
			}
			
			System.out.println("Vuvedete den:");
			day = sc.nextInt();
			System.out.println("Vuvedete mesec:");
			month = sc.nextInt();
			System.out.println("Vuvedete godina:");
			year = sc.nextInt();
			
			if (year <= 0 || year > 4000 || month < 1 || month > 12) {
				isValid = false;
			}
			
			boolean isLeap = false;
			if (year % 4 == 0) {
				isLeap = true;
				if (year % 100 == 0) {
					isLeap = false;
					if (year % 400 == 0) {
						isLeap = true;
					}
				}
			}
			
			monthLenght = 31;
			switch (month) {
			case 4:
			case 6:
			case 9:
			case 11:
				monthLenght = 30;
				break;
			case 2:
				if (isLeap) {
					monthLenght = 28;
				} else {
					monthLenght = 27;
				}
				break;
			default:
				break;
			}
			
			if (day < 1 || day > monthLenght) {
				isValid = false;
			}
		}
		while(!isValid);
		
		if (day < monthLenght) {
			day++;
		} else {
			day = 1;
			if (month < 12) {
				month++;
			} else {
				month = 1;
				year++;
			}
		}

		System.out.println("Sledvashtata data e: " + day + "-" + month + "-" +  year);
	}
	
}
