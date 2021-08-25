import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine().toLowerCase(Locale.ROOT);

       int  c1 = 0;




        for (int i = 0; i < sentence.length(); i++) {
           int a = Character.valueOf(sentence.charAt(i)).compareTo(Character.valueOf('t'));
           if (a == 0) {
               int b = Character.valueOf(sentence.charAt(i+1)).compareTo(Character.valueOf('h'));
               if (b == 0) {
                   int c = Character.valueOf(sentence.charAt(i+2)).compareTo(Character.valueOf('e'));
                   if (c == 0) {
                       System.out.println(i);
                       c1++;
                       break;
                   }
               }
           }

           }
        if (c1 == 0){
            System.out.println(-1);
        }




        }
    }

