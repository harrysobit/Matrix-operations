import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticketNo = scanner.nextLine();
        double lucky = 0;
        double noLucky = 0;
        for (int i = 0; i < 3; i++) {
            lucky += ticketNo.charAt(i);
        }
        for (int i = ticketNo.length() - 1; i > ticketNo.length() - 4; i--) {
            noLucky += ticketNo.charAt(i);
        }
        if (lucky == noLucky) {
            System.out.println("Lucky");
        }
        else {
            System.out.println("Regular");
        }
    }
}
