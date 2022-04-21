import java.util.Scanner;

public class SummerFit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Time: ");
        String Time = scanner.nextLine();
        System.out.printf("Degrees: ");
        int d = scanner.nextInt();
        String outfit = "";
        String shoes = "";

        if("Morning".equals(Time)){
            if (d >= 10 && d <= 18){
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (d > 18 && d <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        } else if ("Afternoon".equals(Time)) {
            if (d >= 10 && d <= 18){
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (d > 18 && d <= 24) {
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        } else if ("Evening".equals(Time)) {
            if (d >= 10 && d <= 18){
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (d > 18 && d <= 24) {
                outfit = "Shirt";
                shoes = "Moccasins";
            } else {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", d, outfit, shoes);
    }
}
