import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        String[] wordList = words.split(" ");
        String temp = wordList[0];
        for (int i = 0; i < wordList.length; i++) {
            String temporary = wordList[i];
            if (temporary.length() > temp.length()) {
                temp = temporary;
            }
        }
        System.out.println(temp);
    }
}
