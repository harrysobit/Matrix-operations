import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int count = 0;
        while (scanner.hasNext()) {
            counter = scanner.nextInt();
            if (counter % 4 == 0) {
                if (counter > count) {
                    count = counter;
                }
                ;
            }
        }
        System.out.println(count);
    }
}
