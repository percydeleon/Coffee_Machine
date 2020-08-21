import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int in = scanner.nextInt();

        System.out.println(in < 10 && in > 0);
    }
}