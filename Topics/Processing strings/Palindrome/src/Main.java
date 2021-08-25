
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char[] charFromReal = string.toCharArray();
        String yes = "yes";
        for (int i = 0; i < string.length(); i++) {
            if (charFromReal[i] != charFromReal[string.length() - 1 - i]) {
                yes = "no";
            }

        }
        System.out.println(yes);
    }
}
