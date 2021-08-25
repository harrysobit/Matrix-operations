import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        int hours = scanner.nextInt();
        double speed = distance / hours;
        System.out.println(speed);
    }
}
