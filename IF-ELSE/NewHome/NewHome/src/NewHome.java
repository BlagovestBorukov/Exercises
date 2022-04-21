import  java.util.Scanner;

public class NewHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        double suml = 0;
        System.out.printf("Flowers: ");
        String Flower = scanner.nextLine();
        System.out.printf("Number of Flowers= ");
        int br = scanner.nextInt();
        System.out.printf("Budget= ");
        int budget = scanner.nextInt();

        if ("Roses".equals(Flower)){
            if (br > 80){
                sum = (br * 5) - (br * 5 * 10/100);
            }else {
                sum = br * 5;
            }
        } else if ("Dahlias".equals(Flower)) {
            if (br > 90){
                sum = (br * 3.8) - (br * 3.8 * 15/100);
            }else {
                sum = br * 3.8;
            }
        } else if ("Tulips".equals(Flower)) {
            if (br > 80){
                sum = (br * 2.8) - (br * 2.8 * 10/100);
            }else {
                sum = br * 2.8;
            }
        } else if ("Narcissus".equals(Flower)) {
            if (br < 120){
                sum = (br * 3) + (br * 3 * 15/100);
            }else {
                sum = br * 3;
            }
        }else if ("Gladiolus".equals(Flower)){
            if (br < 80){
                sum = (br * 2.5) + (br * 2.5 * 20/100);
            }else {
                sum = br * 2.5;
            }
        }
        if (sum <= budget){
            suml = budget - sum;
            System.out.printf("Hey, you have great garden with %d %s and %.2f leva left.", br, Flower, suml);
        }else if (sum > budget){
            suml = sum - budget;
            System.out.printf("Not enough money, you need %.2f leva more", suml);
        }
    }
}
