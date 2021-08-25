import java.util.Scanner;

public class Main {

    public static long fib(long n){
        if (n <= 1){
            return n;
        } else {
            return fib(n -1 ) + fib (n - 2);
        }

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n !=0 && n %2 == 0){
            System.out.println("-" + fib(n));

        }
        else {
            System.out.println(fib(n));

        }

    }
}