import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Ex_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int p;
        int w = 2000;
        int f = 1200;
        int sf = 720;
        int a = 0;
        int ap;
        double win = 0.0;
        double pw;
        System.out.printf("Number of tournaments: ");
        n = scanner.nextInt();
        System.out.printf("Starting points: ");
        p = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            String result = scanner.nextLine();
            if (result.equals("W")) {
                p = p + w;
                a = a + w;
                win++;
            } else if (result.equals("F")) {
                p = p + f;
                a = a + f;
            } else if (result.equals("SF")) {
                p = p + sf;
                a = a + sf;
            }
        }
        ap = a/n;
        pw = (win/n)*100;
        System.out.printf("Final points: %d\n", p);
        System.out.printf("Average points: %d\n", ap);
        System.out.printf("%.2f%%\n", pw);
    }
}
