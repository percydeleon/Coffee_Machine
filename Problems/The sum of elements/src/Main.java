import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int input = 1;
        int sum = 0;

        while (input != 0) {
            input = scanner.nextInt();
            sum += input;
        }

        System.out.println(sum);
    }
}