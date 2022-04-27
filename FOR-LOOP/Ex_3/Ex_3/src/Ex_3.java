import java.util.Scanner;

public class Ex_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double p1, p2, p3, p4, p5;
        double m = 0.0, p = 0.0, q = 0.0, t = 0.0, u = 0.0;
        System.out.printf("n= ");
        int n = scanner.nextInt();
        for (int i = 1; i<= n; i++){
            int number = scanner.nextInt();
            if (number < 200){
                m++;
            } else if (number >= 200 && number <= 399) {
                p++;
            } else if (number >= 400 && number <= 599) {
                q++;
            } else if (number >= 600 && number <= 799) {
                t++;
            }else if (number >= 800){
                u++;
            }

        }

        p1 = m/n*100;
        p2 = p/n*100;
        p3 = q/n*100;
        p4 = t/n*100;
        p5 = u/n*100;

        System.out.printf("p1: %.2f", p1);
        System.out.println("%");
        System.out.printf("p2: %.2f", p2);
        System.out.println("%");
        System.out.printf("p3: %.2f", p3);
        System.out.println("%");
        System.out.printf("p4: %.2f", p4);
        System.out.println("%");
        System.out.printf("p5: %.2f", p5);
        System.out.println("%");


    }
}
