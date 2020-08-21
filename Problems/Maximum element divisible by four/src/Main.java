import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int numElement = scanner.nextInt();
        int max = 0;

        for (int i = 0; i < numElement; i++) {
            int num = scanner.nextInt();

            if (num % 4 == 0) {
                max = num > max ? num : max;
            }
        }

        System.out.println(max);
    }
}