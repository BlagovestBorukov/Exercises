import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int[][] A = new int[10][10];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                System.out.printf("%d", A[i][j]);
            }
            System.out.println();
        }
    }
}
