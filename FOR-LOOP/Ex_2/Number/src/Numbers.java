import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("n= ");
        int n = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 1; i <= n; i++){
            int number = scanner.nextInt();
            sum += number;
            if (number > max){
                max = number;
            }
        }

        int sumWithOutMaxNumber = sum - max;
        if (max == sumWithOutMaxNumber){
            System.out.println("Yes");;
            System.out.println("sum= " + max);
        }else {
            int diff = Math.abs(max - sumWithOutMaxNumber);
            System.out.println("No");;
            System.out.println("diff= " + diff);
        }
    }
}
