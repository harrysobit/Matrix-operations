import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int a = scan.nextInt();
            if (a == 0) {
                break;
            }
            System.out.println(a % 2 == 0 ? "even" : "odd");

        }
    }
}