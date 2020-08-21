import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int num;
        int max = 0;
        do {
            num = scanner.nextInt();
            max = num > max ? num : max;

        } while (num != 0);

        System.out.println(max);
    }
}