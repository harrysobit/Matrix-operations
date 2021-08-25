import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int beginning = scanner.nextInt();
        int end = scanner.nextInt();

        for (; beginning <= end; beginning++) {
            System.out.println(beginning % 3 == 0 && beginning % 5 == 0 ?
                    "FizzBuzz" : beginning % 5 == 0 ?
                    "Buzz" : beginning % 3 == 0 ? "Fizz" : beginning);
        }
    }
}
