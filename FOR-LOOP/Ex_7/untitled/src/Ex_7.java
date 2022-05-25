import java.util.Scanner;

public class Ex_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int p;
        double mu = 0;
        double mo = 0;
        double k = 0;
        double k2 = 0;
        double e = 0;
        double sum = 0;
        System.out.print("Number of groups: ");
        n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Number of people in group %d: ", i + 1);
            p = scanner.nextInt();
            sum = sum + p;
            if (p <= 5) {
                mu = mu + p;
                mu = mu / sum * 100;
                mu = mu - 100;
            } else if (p >= 6 && p <= 12) {
                mo = mo + p;
                mo = mo / sum * 100;
            }else if (p >= 13 && p <=25) {
                k = k+ p;
                k = k / sum * 100;
            } else if (p >= 26 && p <= 40) {
                k2 = k2 + p;
                k2 = k2 / sum * 100;
            } else if (p >= 41) {
                e = e + p;
                e = e / sum * 100;
            }
        }
        System.out.printf("%f.2%%\n", mu);
        System.out.printf("%f.2%%\n", mo);
        System.out.printf("%f.2%%\n", k);
        System.out.printf("%f.2%%\n", k2);
        System.out.printf("%f.2%%\n", e);

    }
}
