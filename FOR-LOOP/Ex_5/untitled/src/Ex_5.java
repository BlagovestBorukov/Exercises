import java.util.Scanner;

public class Ex_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, p, sum = 0;
        System.out.printf("Websites opened: ");
        n = scanner.nextInt();
        System.out.printf("Salary: ");
        p = scanner.nextInt();
        String w;
        for (int i = 0; i <= n; i++) {
            w = scanner.nextLine();
            if (w.equals("Facebook")) {
                sum = sum + 150;
            } else if (w.equals("Instagram")) {
                sum = sum + 100;
            } else if (w.equals("Reddit")) {
                sum = sum + 50;
            }
            if (sum >= p){
                break;
            }
        }
        if(sum < p) {
            p = p - sum;
            System.out.printf("%d lv \n", p);
        } else if (sum >= p) {
            System.out.println("You have lost your salary.");
        }
    }
}
