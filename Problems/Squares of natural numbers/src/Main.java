import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int nat = scanner.nextInt();

        int cnt = 1;
        int sqr = 1;

        if (nat == 1) {
            System.out.println(1);
        } else {
            while (sqr < nat) {
                sqr = cnt * cnt;
                if (sqr <= nat) {
                    System.out.println(sqr);
                }
                cnt++;
            }
        }
    }
}