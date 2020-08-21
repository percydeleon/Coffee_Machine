import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int len = 0;

        while (scanner.hasNext()) {
            if (scanner.nextInt() > 0) {
                len++;
            } else {
                break;
            }

        }

        System.out.println(len);
    }
}