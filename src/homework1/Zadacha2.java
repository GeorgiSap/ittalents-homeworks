package homework1;
import java.util.Scanner;

public class Zadacha2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Vuvedete A:");
		int numA = sc.nextInt();
		System.out.println("Vuvedete B:");
		int numB = sc.nextInt();
		
		System.out.println("Sumata na chislata " + numA + " i " + numB + " e: " + (numA + numB));
		System.out.println("Razlikata na chislata " + numA + " i " + numB + " e: " + (numA - numB));
		System.out.println("Proizvedenieto na chislata " + numA + " i " + numB + " e: " + (numA * numB));
		System.out.println("Ostatukat ot delenie na chislata " + numA + " i " + numB + " e: " + (numA % numB));
		System.out.println("Celochisl. chastno na chislata " + numA + " i " + numB + " e: " + (numA / numB));
		
		System.out.println("Vuvedete A:");
		double numDoubleA = sc.nextDouble();
		System.out.println("Vuvedete B:");
		double numDoubleB = sc.nextDouble();
		
		System.out.println("Sumata na chislata " + numDoubleA + " i " + numDoubleB + " e: " + (numDoubleA + numDoubleB));
		System.out.println("Razlikata na chislata " + numDoubleA + " i " + numDoubleB + " e: " + (numDoubleA - numDoubleB));
		System.out.println("Proizvedenieto na chislata " + numDoubleA + " i " + numDoubleB + " e: " + (numDoubleA * numDoubleB));
		System.out.println("Ostatukat ot delenie na chislata " + numDoubleA + " i " + numDoubleB + " e: " + (numDoubleA % numDoubleB));
		System.out.println("Celochisl. chastno na chislata " + numDoubleA + " i " + numDoubleB + " e: " + (int)(numDoubleA / numDoubleB));
		


	}

}
