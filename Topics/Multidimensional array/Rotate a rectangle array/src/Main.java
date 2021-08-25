
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] initialArray = new int[n][m];
        int[][] finalArray = new int[m][n];

        for (int i = 0; i < initialArray.length; i++) {
            for (int j = 0; j < initialArray[i].length; j++) {
                initialArray[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                finalArray[j][n - 1 - i] = initialArray[i][j];
            }

        }
        for (int i = 0; i < finalArray.length; i++) {
            for (int j = 0; j < finalArray[i].length; j++) {
                System.out.print(finalArray[i][j] + " ");

            }
            System.out.println("");
        }


    }
}
