import java.util.Scanner;

public class NewProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        System.out.printf("Projection: ");
        String projection = scanner.nextLine();
        System.out.printf("rows= ");
        int r = scanner.nextInt();
        System.out.printf("columns= ");
        int c = scanner.nextInt();

        if ("Premiere".equals(projection)){
            sum = r * c * 12;
        } else if ("Normal".equals(projection)) {
            sum = r * c * 7.5;
        } else if ("Discount".equals(projection)) {
            sum = r * c * 5;
        }
        System.out.print("income= ");
        System.out.printf("%.2f lv", sum);
    }
}
