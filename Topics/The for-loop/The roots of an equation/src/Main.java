import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int count = 0;
        for (int root = 0; root <= 1000 && count < 3; root++) {

            if (root * root * root * a + root * root * b + root * c + d == 0) {

                System.out.println(root);
                count++;
            }
        }

    }
}