import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largest = 0;
        int num = 0;
        while (scanner.hasNext()) {
            largest = scanner.nextInt();
            if (largest > num) {
                num = largest;
            }
        }
        System.out.println(num);
    }
}
