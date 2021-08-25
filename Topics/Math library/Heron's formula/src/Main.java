import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(heronFormula(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));

    }
    public static double heronFormula(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));

    }
}
