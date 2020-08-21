import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int collatz = scanner.nextInt();

        System.out.print(collatz + " ");
        while (collatz != 1) {
            collatz = collatz % 2 == 0 ? collatz / 2 : (collatz * 3) + 1;
            System.out.print(collatz + " ");
        }
    }
}