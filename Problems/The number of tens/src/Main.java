import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        String str = scanner.next();
        Integer len = str.length();

        if (len < 2) {
            System.out.println('0');
        } else {
            System.out.println(str.charAt(len - 2));
        }

    }
}