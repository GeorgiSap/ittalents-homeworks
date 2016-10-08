package homework3;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Zadacha1 {

	public static void main(String[] args) {
		
		int [] a = new int[7];
		Scanner sc = new Scanner(System.in);
		
		for (int index = 0; index < a.length; index++) {
			a[index] = sc.nextInt();
		}
		
		int minNum = Integer.MAX_VALUE;
		
		for (int index = 0; index < a.length; index++) {
			if (a[index] % 3 == 0) {
				if (a[index] < minNum) {
					minNum = a[index];
				}
			}
		}
		if (minNum == Integer.MAX_VALUE) {
			System.out.println("Niama stoinost kratna na 3.");
		}
		else {
			System.out.println(minNum);
		}
		
	}

}
