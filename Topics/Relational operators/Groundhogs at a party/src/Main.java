import java.util.Scanner;

class Main {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int butterCup = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();
        boolean sucessfulParty = weekend ? butterCup >= 15 && butterCup <= 25 :
                butterCup >= 10 && butterCup <= 20;
        System.out.println(sucessfulParty);

    }
}