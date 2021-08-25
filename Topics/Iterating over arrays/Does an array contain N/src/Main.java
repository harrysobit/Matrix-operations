import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        boolean contains = false;
        int number = scanner.nextInt();
        for (int a : arr
        ) {
            if (a == number) {
                contains = true;
                break;
            }


        }
        System.out.println(contains);
    }
}
