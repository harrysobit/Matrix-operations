import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int h = scan.nextInt();

        if (h < a) {
            System.out.println("Deficiency");
        } else if (h > b) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}