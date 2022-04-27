import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Age: ");
        int n = scanner.nextInt();
        System.out.printf("Washing machine price: ");
        double price = scanner.nextDouble();
        System.out.printf("Toy price: ");
        int toy = scanner.nextInt();
        int even = 0, odd = 0,sum = 0, sum1 = 0, t = 0;
        double S, M, N;
        for (int i = 1; i <= n; i++){
            if (i % 2 == 0){
                even++;
            }else if (i % 2 != 0){
                odd++;
            }
        }
        for (int j = 2; j <= n; j = j + 2){
            sum1 = sum1 + 10;
            sum = sum1 + sum;
        }
        for (int i = 1; i <= n; i = i + 2){
            t++;
        }
        S = t * toy + sum - odd * 1;
        if (S >= price){
            N = S - price;
            System.out.printf("Yes! %.2f%n", N);
        } else if (S < price) {
            M = price - S;
            System.out.printf("No! %.2f%n", M);
        }
    }
}
