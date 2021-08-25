import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dat = scanner.nextLine();
        String[] dat1 = dat.split("-");
        String one = dat1[0];
        String two = dat1[1];
        String three = dat1[2];

        System.out.println(two+ "/" +three+ "/" +one);


    }
}
