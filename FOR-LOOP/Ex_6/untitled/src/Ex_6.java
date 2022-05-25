import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name, jury;
        int n;
        double points, jpoints, sum = 0;
        System.out.print("Name of the actor: ");
        name = scanner.nextLine();
        System.out.print("Points from the Academy: ");
        points = scanner.nextDouble();
        System.out.print("Jury: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            System.out.println("Name of jury");
            jury = scanner.nextLine();
            System.out.println("Points of jury");
            jpoints = scanner.nextDouble();

            points = points + ((jury.length() * jpoints) / 2);

            if (points > 1250.5) {
                break;
            }
        }

        if (points > 1250.5) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %f.1!\n",name ,points);
        }else if (points <= 1250.5) {
            sum = 1250.5 - points;
            System.out.printf("Sorry, %s you need %f.1" ,name ,sum);
        }
    }
}
