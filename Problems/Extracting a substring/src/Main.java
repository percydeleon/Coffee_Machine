import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int pos = scanner.nextInt();
        int len = scanner.nextInt();

        System.out.println(word.substring(pos, ++len));
    }
}