package homework2;

public class Zadacha20 {

	public static void main(String[] args) {
		int num = 0;
		for (int i = 1; i <= 10; i++) {
		
			for (int j = 1; j <= 10; j++) {
				if (j + num < 10) {
				System.out.print(j + num + " ");
				}
				else {
					System.out.print(j + num -10 + " ");	
				}
			}
			System.out.println();
			num++;
		}
	}
}
