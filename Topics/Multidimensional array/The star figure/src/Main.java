import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char[][] towDArray = new char[n][n];
        for (int i = 0; i < towDArray.length; i++) {
            for (int j = 0; j < towDArray.length; j++) {
                towDArray[i][j] = '.';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n / 2 || i == n / 2 ||  i == j || i + j == n - 1) {
                    towDArray[i][j] = '*';
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(towDArray[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
