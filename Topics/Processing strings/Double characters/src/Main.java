
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] b = new String[a.length()];
        for (int i = 0; i < a.length(); i++) {
            String temp = String.valueOf(a.charAt(i));
            b[i] = temp + temp;

        }
        String c = "";
        for (int i = 0; i < a.length(); i++) {
            c+=b[i];
        }
        System.out.println(c);
    }
}
