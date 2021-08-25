import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long c = 1;

        for (; a < b; a++) {
            c = c * a;

        }
        System.out.println(c);
    }
}
