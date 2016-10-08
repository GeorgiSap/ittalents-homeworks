package homework2;

public class Zadacha12 {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		
		for (int num = 100; num < 1000; num++) {
			n1 = num % 10;
			n2 = ((num % 100) - n1)/10;
			n3 = (num - n1 - (n2 * 10))/100;
			
			if (n1 != n2 && n1 != n3 && n2 != n3) {
				System.out.println(num);
			}
		}

	}

}
