import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gravity = 9.8;
        double density = scanner.nextDouble();
        double height = scanner.nextDouble();
        double liquidPressure = gravity * density * height;

        System.out.println(liquidPressure);
    }
}