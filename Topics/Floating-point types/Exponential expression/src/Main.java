import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double result = Math.pow(x, 3) + Math.pow(x, 2) + Math.pow(x, 1) + Math.pow(x, 0);
        System.out.println(result);
    }
}
