import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int busHeight = scanner.nextInt();
        int noOfBridge = scanner.nextInt();
        int[] heightOfBridge = new int[noOfBridge];

        int nocount = 0;
        for (int i = 0; i < noOfBridge; i++) {
            heightOfBridge[i] = scanner.nextInt();
            if (heightOfBridge[i] <= busHeight) {
                nocount++;
                int a = i + 1;
                System.out.println(" Will crash on bridge " + a);

                break;

            }

        }
        if (nocount <= 0) {
            System.out.println(" Will not crash");
        }
    }
}