import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        long product = 1;

        for (int i = num1; i < num2; i++) {
            product *= i;
        }

        System.out.println(product);
    }
}