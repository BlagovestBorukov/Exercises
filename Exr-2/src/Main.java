import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double sum;
		
		System.out.print("Predpazen nailon= ");
		int n = scanner.nextInt();
		System.out.print("boq= ");
		int b = scanner.nextInt();
		System.out.print("Razreditel za boq= ");
		int r = scanner.nextInt();
		System.out.print("Chasove rabota= ");
		double ch = scanner.nextDouble();
		
		double n1 = n * 1.5;
		double b1 = b * 14.5;
		double r1 = r * 5;
		double m = (n1 + b1 + r1 + 0.1*b1 + 3 + 0.4) * 0.3; 
		
		sum =n1 + b1 + r1 + 0.1*b1 + 3 + 0.4 + m * ch;
		System.out.println("Cena= " + sum);
		
		scanner.close();
	}
		
}
