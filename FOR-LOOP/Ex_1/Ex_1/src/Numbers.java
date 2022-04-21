package untitled.src;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("n= ");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++){
            if (i % 10 == 7){
                System.out.println(i);
            }
        }
    }
}

